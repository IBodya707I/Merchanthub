package com.example.merchant_hub.ui.onboarding

import androidx.compose.runtime.Composable
import merchanthub.shared.generated.resources.*
import org.jetbrains.compose.resources.stringResource

data class OnboardingSlideContent(
    val title: String,
    val description: String,
    val nextButtonText: String,
    val skipButtonText: String,
    val backButtonText: String
)

object OnboardingData {
    @Composable
    fun getSlide(index: Int): OnboardingSlideContent {
        return when (index) {
            0 -> OnboardingSlideContent(
                title = stringResource(Res.string.slide1_title),
                description = stringResource(Res.string.slide1_desc),
                nextButtonText = stringResource(Res.string.btn_next),
                skipButtonText = stringResource(Res.string.btn_skip),
                backButtonText = stringResource(Res.string.btn_back)
            )
            1 -> OnboardingSlideContent(
                title = stringResource(Res.string.slide2_title),
                description = stringResource(Res.string.slide2_desc),
                nextButtonText = stringResource(Res.string.btn_next),
                skipButtonText = stringResource(Res.string.btn_skip),
                backButtonText = stringResource(Res.string.btn_back)
            )
            2 -> OnboardingSlideContent(
                title = stringResource(Res.string.slide3_title),
                description = stringResource(Res.string.slide3_desc),
                nextButtonText = stringResource(Res.string.btn_next),
                skipButtonText = stringResource(Res.string.btn_skip),
                backButtonText = stringResource(Res.string.btn_back)
            )
            3 -> OnboardingSlideContent(
                title = stringResource(Res.string.slide4_title),
                description = stringResource(Res.string.slide4_desc),
                nextButtonText = stringResource(Res.string.btn_get_started),
                skipButtonText = stringResource(Res.string.btn_skip),
                backButtonText = stringResource(Res.string.btn_back)
            )
            else -> getSlide(0)
        }
    }
}
