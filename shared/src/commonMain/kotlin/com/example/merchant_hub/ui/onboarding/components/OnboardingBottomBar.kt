package com.example.merchant_hub.ui.onboarding.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.merchant_hub.ui.theme.AppTheme
import com.example.merchant_hub.ui.theme.Indigo700
import com.example.merchant_hub.ui.theme.Slate300
import com.example.merchant_hub.ui.theme.Slate500
import com.example.merchant_hub.ui.theme.Slate900

@Composable
fun OnboardingBottomBar(
    title: String,
    description: String,
    currentPage: Int,
    pageCount: Int,
    nextButtonText: String,
    backButtonText: String,
    onNextClick: () -> Unit,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            letterSpacing = (-0.5).sp,
            lineHeight = 30.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = description,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            lineHeight = 20.sp,
            modifier = Modifier.padding(horizontal = 12.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(7.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            for (i in 0 until pageCount) {
                val isSelected = i == currentPage
                val dotWidth by animateDpAsState(if (isSelected) 26.dp else 6.5.dp)
                val dotColor by animateColorAsState(if (isSelected) AppTheme.colors.activeDot else MaterialTheme.colorScheme.outlineVariant)

                Box(
                    modifier = Modifier
                        .height(6.5.dp)
                        .width(dotWidth)
                        .clip(RoundedCornerShape(50))
                        .background(dotColor)
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        Button(
            onClick = onNextClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(16.dp),
                    spotColor = AppTheme.colors.primaryButtonGlow
                ),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = AppTheme.colors.primaryButton,
                contentColor = Color.White
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = nextButtonText,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                if (currentPage < pageCount - 1) {
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "→",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        if (currentPage > 0) {
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .clickable { onBackClick() }
                    .padding(horizontal = 14.dp, vertical = 6.dp)
            ) {
                Text(
                    text = "← $backButtonText",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium
                )
            }
        } else {
            Spacer(modifier = Modifier.height(35.dp))
        }
    }
}
