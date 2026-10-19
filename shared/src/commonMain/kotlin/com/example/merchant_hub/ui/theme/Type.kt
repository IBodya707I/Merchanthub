package com.example.merchant_hub.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import merchanthub.shared.generated.resources.Res
import merchanthub.shared.generated.resources.jetbrains_mono
import merchanthub.shared.generated.resources.manrope_bold
import merchanthub.shared.generated.resources.manrope_extrabold
import merchanthub.shared.generated.resources.manrope_regular
import merchanthub.shared.generated.resources.manrope_semibold
import org.jetbrains.compose.resources.Font

@Immutable
data class ExtendedTypography(
    val codeLarge: TextStyle,
    val codeMedium: TextStyle,
    val labelBadge: TextStyle
)

val DefaultExtendedTypography = ExtendedTypography(
    codeLarge = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 28.sp
    ),
    codeMedium = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 20.sp
    ),
    labelBadge = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.SemiBold,
        fontSize = 11.sp,
        letterSpacing = 0.5.sp
    )
)

val LocalExtendedTypography = staticCompositionLocalOf { DefaultExtendedTypography }

@Composable
fun rememberAppFontFamilies(): Pair<FontFamily, FontFamily> {
    val sansRegular = Font(Res.font.manrope_regular, weight = FontWeight.Normal)
    val sansMedium = Font(Res.font.manrope_semibold, weight = FontWeight.Medium)
    val sansSemiBold = Font(Res.font.manrope_semibold, weight = FontWeight.SemiBold)
    val sansBold = Font(Res.font.manrope_bold, weight = FontWeight.Bold)
    val sansExtraBold = Font(Res.font.manrope_extrabold, weight = FontWeight.ExtraBold)
    val sansBlack = Font(Res.font.manrope_extrabold, weight = FontWeight.Black)

    val monoRegular = Font(Res.font.jetbrains_mono, weight = FontWeight.Normal)
    val monoBold = Font(Res.font.jetbrains_mono, weight = FontWeight.Bold)

    val sansFamily = remember(sansRegular, sansMedium, sansSemiBold, sansBold, sansExtraBold, sansBlack) {
        FontFamily(sansRegular, sansMedium, sansSemiBold, sansBold, sansExtraBold, sansBlack)
    }
    val monoFamily = remember(monoRegular, monoBold) {
        FontFamily(monoRegular, monoBold)
    }
    return Pair(sansFamily, monoFamily)
}

@Composable
fun rememberAppTypography(
    sansFontFamily: FontFamily = rememberAppFontFamilies().first,
    monoFontFamily: FontFamily = rememberAppFontFamilies().second
): Pair<Typography, ExtendedTypography> {
    return remember(sansFontFamily, monoFontFamily) {
        val typography = Typography(
            headlineLarge = TextStyle(
                fontFamily = sansFontFamily,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 26.sp,
                lineHeight = 32.sp,
                letterSpacing = (-0.5).sp
            ),
            headlineMedium = TextStyle(
                fontFamily = sansFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                lineHeight = 28.sp,
                letterSpacing = (-0.25).sp
            ),
            titleLarge = TextStyle(
                fontFamily = sansFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                lineHeight = 24.sp
            ),
            titleMedium = TextStyle(
                fontFamily = sansFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                lineHeight = 22.sp
            ),
            titleSmall = TextStyle(
                fontFamily = sansFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                lineHeight = 20.sp
            ),
            bodyLarge = TextStyle(
                fontFamily = sansFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp,
                lineHeight = 22.sp
            ),
            bodyMedium = TextStyle(
                fontFamily = sansFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 13.sp,
                lineHeight = 18.sp
            ),
            bodySmall = TextStyle(
                fontFamily = sansFontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 11.sp,
                lineHeight = 16.sp
            ),
            labelLarge = TextStyle(
                fontFamily = sansFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                lineHeight = 20.sp
            ),
            labelMedium = TextStyle(
                fontFamily = sansFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 12.sp,
                lineHeight = 16.sp
            ),
            labelSmall = TextStyle(
                fontFamily = sansFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp,
                lineHeight = 14.sp
            )
        )

        val extended = ExtendedTypography(
            codeLarge = TextStyle(
                fontFamily = monoFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                lineHeight = 28.sp
            ),
            codeMedium = TextStyle(
                fontFamily = monoFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                lineHeight = 20.sp
            ),
            labelBadge = TextStyle(
                fontFamily = monoFontFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 11.sp,
                letterSpacing = 0.5.sp
            )
        )

        typography to extended
    }
}
