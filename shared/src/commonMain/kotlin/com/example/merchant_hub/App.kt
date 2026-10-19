package com.example.merchant_hub

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.merchant_hub.core.localization.AppLanguage
import com.example.merchant_hub.core.localization.LocalAppLanguage
import com.example.merchant_hub.core.localization.setPlatformLocale
import com.example.merchant_hub.core.settings.AppSettings
import com.example.merchant_hub.ui.home.MerchantHomeScreen
import com.example.merchant_hub.ui.onboarding.OnboardingScreen
import com.example.merchant_hub.ui.theme.AppTheme

@Composable
@Preview
fun App() {
    val appSettings = remember { AppSettings() }

    var currentLanguage by remember {
        mutableStateOf(appSettings.currentLanguage)
    }

    LaunchedEffect(currentLanguage) {
        setPlatformLocale(currentLanguage.isoCode)
    }

    var isOnboardingCompleted by remember {
        mutableStateOf(appSettings.isOnboardingCompleted)
    }

    val systemDark = isSystemInDarkTheme()
    var userDarkMode by remember {
        mutableStateOf(if (appSettings.isDarkModeConfigured) appSettings.isDarkMode else null)
    }

    val effectiveDarkMode = userDarkMode ?: systemDark

    CompositionLocalProvider(
        LocalAppLanguage provides currentLanguage
    ) {
        key(currentLanguage) {
            AppTheme(darkTheme = effectiveDarkMode) {
                if (!isOnboardingCompleted) {
                    OnboardingScreen(
                        appSettings = appSettings,
                        isDarkMode = effectiveDarkMode,
                        onToggleDarkMode = { newMode ->
                            userDarkMode = newMode
                            appSettings.isDarkMode = newMode
                        },
                        onLanguageChange = { newLang ->
                            currentLanguage = newLang
                            appSettings.currentLanguage = newLang
                            setPlatformLocale(newLang.isoCode)
                        },
                        onFinished = {
                            isOnboardingCompleted = true
                        }
                    )
                } else {
                    MerchantHomeScreen(
                        appSettings = appSettings,
                        isDarkMode = effectiveDarkMode,
                        onToggleDarkMode = { newMode ->
                            userDarkMode = newMode
                            appSettings.isDarkMode = newMode
                        },
                        onResetOnboarding = {
                            appSettings.resetOnboarding()
                            isOnboardingCompleted = false
                        }
                    )
                }
            }
        }
    }
}