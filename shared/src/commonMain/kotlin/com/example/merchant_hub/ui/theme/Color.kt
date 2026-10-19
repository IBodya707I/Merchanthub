package com.example.merchant_hub.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// MARK: - Core Palette (Executive Slate & Indigo)
val Indigo900 = Color(0xFF1E1B4B)
val Indigo800 = Color(0xFF312E81)
val Indigo700 = Color(0xFF4338CA)
val Indigo600 = Color(0xFF4F46E5)
val Indigo500 = Color(0xFF6366F1)
val Indigo400 = Color(0xFF818CF8)
val Indigo200 = Color(0xFFC7D2FE)
val Indigo100 = Color(0xFFE0E7FF)
val Indigo50  = Color(0xFFEEF2FF)

val Teal700   = Color(0xFF0F766E)
val Teal600   = Color(0xFF0D9488)
val Teal400   = Color(0xFF2DD4BF)
val Teal100   = Color(0xFFCCFBF1)
val Teal50    = Color(0xFFF0FDFA)

val Amber500  = Color(0xFFF59E0B)
val Amber400  = Color(0xFFFBBF24)
val Amber100  = Color(0xFFFEF3C7)

val Slate950  = Color(0xFF020617)
val Slate900  = Color(0xFF0F172A)
val Slate800  = Color(0xFF1E293B)
val Slate700  = Color(0xFF334155)
val Slate600  = Color(0xFF475569)
val Slate500  = Color(0xFF64748B)
val Slate400  = Color(0xFF94A3B8)
val Slate300  = Color(0xFFCBD5E1)
val Slate200  = Color(0xFFE2E8F0)
val Slate100  = Color(0xFFF1F5F9)
val Slate50   = Color(0xFFF8FAFC)

val Red500    = Color(0xFFEF4444)
val Red400    = Color(0xFFF87171)
val Red100    = Color(0xFFFEE2E2)

val Blue500   = Color(0xFF3B82F6)
val Blue400   = Color(0xFF60A5FA)
val Emerald500 = Color(0xFF10B981)
val Emerald400 = Color(0xFF34D399)

val ObsidianCanvas        = Color(0xFF101010) // Pure dark matte graphite background
val ObsidianPreviewBg     = Color(0xFF171717) // Neutral charcoal container (R=23, G=23, B=23)
val ObsidianPreviewBorder = Color(0xFF262626) // Clean neutral grey hairline border (R=38, G=38, B=38)
val ObsidianCardBg        = Color(0xFF1E1E1E) // Elevated matte graphite card (R=30, G=30, B=30)
val ObsidianCardBorder    = Color(0xFF2E2E2E) // Distinct neutral grey outline (R=46, G=46, B=46)
val ObsidianInsetBg       = Color(0xFF141414) // Recessed dark box (R=20, G=20, B=20)
val ObsidianInsetBorder   = Color(0xFF262626) // Recessed neutral border
val ObsidianTextPrimary   = Color(0xFFF5F5F5) // Titanium white (crisp, readable)
val ObsidianTextSecondary = Color(0xFFA3A3A3) // True neutral silver grey (Tailwind Neutral 400, 0% blue)
val ObsidianTextMuted     = Color(0xFF737373) // True neutral ash grey (Tailwind Neutral 500, 0% blue)

val StitchPreviewBgLight = Color(0xFFEFF4FF)
val StitchPreviewBorderLight = Color(0xFFE0E7FF)
val StitchPreviewBgDark = ObsidianPreviewBg
val StitchPreviewBorderDark = ObsidianPreviewBorder
val StitchCardBgLight = Color(0xFFFFFFFF)
val StitchCardBgDark = ObsidianCardBg
val StitchPrimaryBtn = Color(0xFF4338CA)

val LightColorScheme = lightColorScheme(
    primary = Indigo600,
    onPrimary = Color.White,
    primaryContainer = Indigo100,
    onPrimaryContainer = Indigo900,
    inversePrimary = Indigo400,

    secondary = Teal600,
    onSecondary = Color.White,
    secondaryContainer = Teal100,
    onSecondaryContainer = Teal700,

    tertiary = Amber500,
    onTertiary = Color.White,
    tertiaryContainer = Amber100,
    onTertiaryContainer = Color(0xFF78350F),

    background = Slate50,
    onBackground = Slate900,

    surface = Color.White,
    onSurface = Slate900,
    surfaceVariant = StitchPreviewBgLight,
    onSurfaceVariant = Slate500,

    outline = Slate200,
    outlineVariant = Color(0xFFCBD5E1),

    error = Red500,
    onError = Color.White,
    errorContainer = Red100,
    onErrorContainer = Color(0xFF991B1B)
)

val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF818CF8),
    onPrimary = Color(0xFF101010),
    primaryContainer = Color(0xFF312E81),
    onPrimaryContainer = Color(0xFFE0E7FF),
    inversePrimary = Color(0xFF4F46E5),

    secondary = Color(0xFF2DD4BF),
    onSecondary = Color(0xFF042F2E),
    secondaryContainer = Color(0xFF134E4A),
    onSecondaryContainer = Color(0xFFCCFBF1),

    tertiary = Color(0xFFFBBF24),
    onTertiary = Color(0xFF451A03),
    tertiaryContainer = Color(0xFF78350F),
    onTertiaryContainer = Color(0xFFFEF3C7),

    background = ObsidianCanvas,
    onBackground = ObsidianTextPrimary,

    surface = ObsidianCardBg,
    onSurface = ObsidianTextPrimary,
    surfaceVariant = ObsidianPreviewBg,
    onSurfaceVariant = ObsidianTextSecondary,

    outline = ObsidianCardBorder,
    outlineVariant = Color(0xFF383838),

    error = Color(0xFFF87171),
    onError = Color(0xFF450A0A),
    errorContainer = Color(0xFF7F1D1D),
    onErrorContainer = Color(0xFFFEE2E2)
)

@Immutable
data class ExtendedColors(
    val isDark: Boolean = false,
    val previewBg: Color,
    val previewBorder: Color,
    val cardBg: Color,
    val cardBorder: Color,
    val subCardBg: Color,
    val subCardBorder: Color,
    val primaryButton: Color,
    val primaryButtonGlow: Color,
    val activeDot: Color,
    val cardShadow: Color,
    val floatingPillShadow: Color,
    val floatingPillGradient: List<Color>,
    val pillContainerBg: Color,
    val pillContainerBorder: Color,

    val badgeSuccessBg: Color,
    val badgeSuccessBorder: Color,
    val badgeSuccessText: Color,

    val badgeBrandBg: Color,
    val badgeBrandBorder: Color,
    val badgeBrandText: Color,

    val badgeWarningBg: Color,
    val badgeWarningBorder: Color,
    val badgeWarningText: Color,

    val badgeTealBg: Color,
    val badgeTealBorder: Color,
    val badgeTealText: Color,

    val trackNeutral: Color,
    val inactiveDotBg: Color,
    val inactiveDotCenter: Color,

    val chartStroke: Color,
    val chartGradientTop: Color,

    val statusPending: Color,
    val statusConfirmed: Color,
    val statusDelivered: Color,
    val statusCancelled: Color,
    val codeText: Color
)

val LightExtendedColors = ExtendedColors(
    isDark = false,
    previewBg = StitchPreviewBgLight,
    previewBorder = StitchPreviewBorderLight,
    cardBg = Color.White,
    cardBorder = Color(0xFFF1F5F9),
    subCardBg = Color(0xFFF8FAFC),
    subCardBorder = Color(0xFFE2E8F0),
    primaryButton = StitchPrimaryBtn,
    primaryButtonGlow = Indigo700.copy(alpha = 0.40f),
    activeDot = Indigo700,
    cardShadow = Indigo600.copy(alpha = 0.15f),
    floatingPillShadow = Indigo700.copy(alpha = 0.35f),
    floatingPillGradient = listOf(Indigo600, Color(0xFF3730A3)),
    pillContainerBg = Color(0xFFE2E8F0).copy(alpha = 0.8f),
    pillContainerBorder = Color(0xFFCBD5E1).copy(alpha = 0.5f),

    badgeSuccessBg = Color(0xFFECFDF5),
    badgeSuccessBorder = Color(0xFFA7F3D0).copy(alpha = 0.7f),
    badgeSuccessText = Color(0xFF0F766E),

    badgeBrandBg = Indigo50,
    badgeBrandBorder = Indigo100,
    badgeBrandText = Indigo700,

    badgeWarningBg = Color(0xFFFEF3C7),
    badgeWarningBorder = Color(0xFFFDE68A),
    badgeWarningText = Color(0xFF92400E),

    badgeTealBg = Color(0xFFCCFBF1),
    badgeTealBorder = Color(0xFF99F6E4),
    badgeTealText = Color(0xFF0D9488),

    trackNeutral = Color(0xFFE2E8F0),
    inactiveDotBg = Color(0xFFE2E8F0),
    inactiveDotCenter = Color(0xFF9CA3AF),

    chartStroke = Indigo600,
    chartGradientTop = Indigo600.copy(alpha = 0.30f),

    statusPending = Amber500,
    statusConfirmed = Blue500,
    statusDelivered = Emerald500,
    statusCancelled = Red500,
    codeText = Slate900
)

val DarkExtendedColors = ExtendedColors(
    isDark = true,
    previewBg = ObsidianPreviewBg,
    previewBorder = ObsidianPreviewBorder,
    cardBg = ObsidianCardBg,
    cardBorder = ObsidianCardBorder,
    subCardBg = ObsidianInsetBg,
    subCardBorder = ObsidianInsetBorder,
    primaryButton = Color(0xFF4F46E5),
    primaryButtonGlow = Color(0xFF6366F1).copy(alpha = 0.45f),
    activeDot = Color(0xFF818CF8),
    cardShadow = Color.Black.copy(alpha = 0.50f),
    floatingPillShadow = Color(0xFF6366F1).copy(alpha = 0.45f),
    floatingPillGradient = listOf(Color(0xFF4F46E5), Color(0xFF6366F1)),
    pillContainerBg = ObsidianCardBg,
    pillContainerBorder = ObsidianCardBorder,

    badgeSuccessBg = Color(0xFF10B981).copy(alpha = 0.12f),
    badgeSuccessBorder = Color(0xFF10B981).copy(alpha = 0.35f),
    badgeSuccessText = Color(0xFF34D399),

    badgeBrandBg = Color(0xFF6366F1).copy(alpha = 0.15f),
    badgeBrandBorder = Color(0xFF6366F1).copy(alpha = 0.40f),
    badgeBrandText = Color(0xFFA5B4FC),

    badgeWarningBg = Color(0xFFF59E0B).copy(alpha = 0.14f),
    badgeWarningBorder = Color(0xFFF59E0B).copy(alpha = 0.35f),
    badgeWarningText = Color(0xFFFBBF24),

    badgeTealBg = Color(0xFF2DD4BF).copy(alpha = 0.12f),
    badgeTealBorder = Color(0xFF2DD4BF).copy(alpha = 0.35f),
    badgeTealText = Color(0xFF2DD4BF),

    trackNeutral = ObsidianCardBorder,
    inactiveDotBg = Color(0xFF282828),
    inactiveDotCenter = Color(0xFF525252),

    chartStroke = Color(0xFF818CF8),
    chartGradientTop = Color(0xFF818CF8).copy(alpha = 0.35f),

    statusPending = Color(0xFFFBBF24),
    statusConfirmed = Color(0xFF818CF8),
    statusDelivered = Color(0xFF34D399),
    statusCancelled = Color(0xFFF87171),
    codeText = ObsidianTextPrimary
)

val LocalExtendedColors = staticCompositionLocalOf { LightExtendedColors }
