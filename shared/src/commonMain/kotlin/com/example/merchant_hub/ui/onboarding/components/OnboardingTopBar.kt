package com.example.merchant_hub.ui.onboarding.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.merchant_hub.core.localization.AppLanguage
import com.example.merchant_hub.core.localization.LocalAppLanguage
import com.example.merchant_hub.ui.theme.AppTheme
import merchanthub.shared.generated.resources.Res
import merchanthub.shared.generated.resources.btn_skip
import org.jetbrains.compose.resources.stringResource

@Composable
fun OnboardingTopBar(
    onLanguageChange: (AppLanguage) -> Unit,
    onSkipClick: () -> Unit,
    selectedLanguage: AppLanguage = LocalAppLanguage.current,
    isDarkMode: Boolean = false,
    onToggleDarkMode: (() -> Unit)? = null,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp, vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(34.dp)
                    .clip(CircleShape)
                    .background(
                        Brush.linearGradient(
                            listOf(Color(0xFF3525CD), Color(0xFF6366F1))
                        )
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "M",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Black
                )
            }

            Row(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(AppTheme.colors.cardBg)
                    .border(1.dp, AppTheme.colors.cardBorder, RoundedCornerShape(50))
                    .padding(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                LanguagePillItem(
                    title = "UA",
                    isSelected = selectedLanguage == AppLanguage.UA,
                    onClick = { onLanguageChange(AppLanguage.UA) }
                )
                LanguagePillItem(
                    title = "EN",
                    isSelected = selectedLanguage == AppLanguage.EN,
                    onClick = { onLanguageChange(AppLanguage.EN) }
                )
            }

            if (onToggleDarkMode != null) {
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                        .background(AppTheme.colors.cardBg)
                        .border(1.dp, AppTheme.colors.cardBorder, CircleShape)
                        .clickable { onToggleDarkMode() },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = if (isDarkMode) "🌙" else "☀️",
                        fontSize = 13.sp
                    )
                }
            }
        }

        Text(
            text = "Merchant Hub",
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = (-0.3).sp
        )

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .clickable { onSkipClick() }
                .padding(horizontal = 6.dp, vertical = 4.dp)
        ) {
            Text(
                text = stringResource(Res.string.btn_skip),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Composable
private fun LanguagePillItem(
    title: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val unselectedColor = MaterialTheme.colorScheme.onSurfaceVariant
    val activeColor = MaterialTheme.colorScheme.primary
    val bgColor by animateColorAsState(if (isSelected) activeColor else Color.Transparent)
    val textColor by animateColorAsState(if (isSelected) Color.White else unselectedColor)

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(bgColor)
            .clickable { onClick() }
            .padding(horizontal = 9.dp, vertical = 3.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = title,
            color = textColor,
            fontSize = 10.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.SemiBold
        )
    }
}
