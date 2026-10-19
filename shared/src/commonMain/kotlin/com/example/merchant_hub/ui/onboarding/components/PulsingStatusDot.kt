package com.example.merchant_hub.ui.onboarding.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.merchant_hub.ui.theme.Emerald500

/**
 * Compact and elegant pulsing status dot matching Stitch's refined look.
 * Features a neat breathing core and a gentle expanding halo.
 */
@Composable
fun PulsingStatusDot(
    modifier: Modifier = Modifier,
    color: Color = Emerald500,
    dotSize: Dp = 5.dp,
    haloScale: Float = 1.9f,
    durationMillis: Int = 1600
) {
    val infiniteTransition = rememberInfiniteTransition(label = "PulsingDotTransition")

    val progress by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = durationMillis, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "PulseProgress"
    )

    val coreScale by infiniteTransition.animateFloat(
        initialValue = 0.92f,
        targetValue = 1.08f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = durationMillis / 2, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "CoreScale"
    )

    val haloAlpha = ((1f - progress) * 0.60f).coerceIn(0f, 1f)

    Box(
        modifier = modifier.size(dotSize * haloScale),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.size(dotSize * haloScale)) {
            val center = Offset(size.width / 2f, size.height / 2f)
            val baseRadius = dotSize.toPx() / 2f
            val maxRadius = size.minDimension / 2f

            val currentRadius = baseRadius + (maxRadius - baseRadius) * progress

            drawCircle(
                color = color.copy(alpha = haloAlpha * 0.35f),
                radius = currentRadius,
                center = center
            )
            drawCircle(
                color = color.copy(alpha = haloAlpha * 0.70f),
                radius = currentRadius,
                center = center,
                style = Stroke(width = 1.dp.toPx())
            )

            drawCircle(
                color = color,
                radius = baseRadius * coreScale,
                center = center
            )
        }
    }
}

