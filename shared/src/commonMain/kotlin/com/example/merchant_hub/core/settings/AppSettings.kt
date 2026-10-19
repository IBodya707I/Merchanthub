package com.example.merchant_hub.core.settings

import co.touchlab.kermit.Logger
import com.example.merchant_hub.core.localization.AppLanguage
import com.russhwolf.settings.Settings

class AppSettings(
    private val settings: Settings = Settings()
) {
    private val logger = Logger.withTag("AppSettings")

    companion object {
        private const val KEY_ONBOARDING_DONE = "onboarding_done"
        private const val KEY_APP_LANGUAGE = "app_language"
        private const val KEY_IS_DARK_MODE = "is_dark_mode"
        private const val KEY_ACTIVE_STORE_ID = "active_store_id"

        const val DEFAULT_STORE_ID = "11111111-1111-1111-1111-111111111111"
        const val LANG_UA = "UA"
        const val LANG_EN = "EN"
    }

    var isOnboardingCompleted: Boolean
        get() = settings.getBoolean(KEY_ONBOARDING_DONE, false)
        set(value) {
            logger.i { "Setting isOnboardingCompleted = $value" }
            settings.putBoolean(KEY_ONBOARDING_DONE, value)
        }

    val isLanguageConfigured: Boolean
        get() = settings.hasKey(KEY_APP_LANGUAGE)

    var currentLanguage: AppLanguage
        get() {
            return if (isLanguageConfigured) {
                AppLanguage.fromCode(settings.getString(KEY_APP_LANGUAGE, LANG_UA))
            } else {
                AppLanguage.fromSystemLocale()
            }
        }
        set(value) {
            logger.i { "Setting currentLanguage = ${value.code}" }
            settings.putString(KEY_APP_LANGUAGE, value.code)
        }

    var appLanguage: String
        get() = currentLanguage.code
        set(value) {
            currentLanguage = AppLanguage.fromCode(value)
        }

    val isDarkModeConfigured: Boolean
        get() = settings.hasKey(KEY_IS_DARK_MODE)

    var isDarkMode: Boolean
        get() = settings.getBoolean(KEY_IS_DARK_MODE, false)
        set(value) {
            logger.i { "Setting isDarkMode = $value" }
            settings.putBoolean(KEY_IS_DARK_MODE, value)
        }

    fun resetThemeToSystem() {
        logger.i { "Resetting theme to follow system" }
        settings.remove(KEY_IS_DARK_MODE)
    }

    var activeStoreId: String
        get() = settings.getString(KEY_ACTIVE_STORE_ID, DEFAULT_STORE_ID)
        set(value) {
            logger.i { "Setting activeStoreId = $value" }
            settings.putString(KEY_ACTIVE_STORE_ID, value)
        }

    fun resetOnboarding() {
        logger.w { "Resetting onboarding status to false" }
        settings.putBoolean(KEY_ONBOARDING_DONE, false)
    }
}
