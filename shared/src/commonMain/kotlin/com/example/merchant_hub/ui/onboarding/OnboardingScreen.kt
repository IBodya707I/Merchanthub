package com.example.merchant_hub.ui.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import co.touchlab.kermit.Logger
import com.example.merchant_hub.core.localization.AppLanguage
import com.example.merchant_hub.core.localization.LocalAppLanguage
import com.example.merchant_hub.core.settings.AppSettings
import com.example.merchant_hub.ui.onboarding.components.*
import kotlinx.coroutines.launch

@Composable
fun OnboardingScreen(
    appSettings: AppSettings,
    isDarkMode: Boolean = false,
    onToggleDarkMode: ((Boolean) -> Unit)? = null,
    onLanguageChange: (AppLanguage) -> Unit,
    onFinished: () -> Unit,
    modifier: Modifier = Modifier
) {
    val logger = remember { Logger.withTag("OnboardingScreen") }
    val coroutineScope = rememberCoroutineScope()
    val pagerState = rememberPagerState(pageCount = { 4 })

    val currentSlideContent = OnboardingData.getSlide(pagerState.currentPage)

    val completeOnboarding = {
        logger.i { "User completed onboarding (current page = ${pagerState.currentPage})" }
        appSettings.isOnboardingCompleted = true
        onFinished()
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .statusBarsPadding()
            .navigationBarsPadding(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .widthIn(max = 430.dp)
                .fillMaxSize()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            OnboardingTopBar(
                onLanguageChange = onLanguageChange,
                onSkipClick = {
                    logger.i { "User tapped Skip" }
                    completeOnboarding()
                },
                isDarkMode = isDarkMode,
                onToggleDarkMode = if (onToggleDarkMode != null) { { onToggleDarkMode(!isDarkMode) } } else null
            )

            HorizontalPager(
                state = pagerState,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) { page ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 2.dp),
                    contentAlignment = Alignment.Center
                ) {
                    when (page) {
                        0 -> SlideOneCard()
                        1 -> SlideTwoCard()
                        2 -> SlideThreeCard()
                        3 -> SlideFourCard()
                    }
                }
            }

            OnboardingBottomBar(
                title = currentSlideContent.title,
                description = currentSlideContent.description,
                currentPage = pagerState.currentPage,
                pageCount = 4,
                nextButtonText = currentSlideContent.nextButtonText,
                backButtonText = currentSlideContent.backButtonText,
                onNextClick = {
                    if (pagerState.currentPage < 3) {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    } else {
                        completeOnboarding()
                    }
                },
                onBackClick = {
                    if (pagerState.currentPage > 0) {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage - 1)
                        }
                    }
                }
            )

            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}
