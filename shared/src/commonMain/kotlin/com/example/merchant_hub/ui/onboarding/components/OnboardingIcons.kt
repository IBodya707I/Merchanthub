package com.example.merchant_hub.ui.onboarding.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun IconTrendingUp(
    modifier: Modifier = Modifier.size(14.dp),
    tint: Color = Color(0xFF0D9488),
    strokeWidth: Dp = 2.dp
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = strokeWidth.toPx()

        val path = Path().apply {
            moveTo(w * 0.1f, h * 0.8f)
            lineTo(w * 0.4f, h * 0.5f)
            lineTo(w * 0.6f, h * 0.65f)
            lineTo(w * 0.95f, h * 0.25f)
        }
        drawPath(path, tint, style = Stroke(sw, cap = StrokeCap.Round, join = StrokeJoin.Round))

        val arrow = Path().apply {
            moveTo(w * 0.7f, h * 0.25f)
            lineTo(w * 0.95f, h * 0.25f)
            lineTo(w * 0.95f, h * 0.5f)
        }
        drawPath(arrow, tint, style = Stroke(sw, cap = StrokeCap.Round, join = StrokeJoin.Round))
    }
}

@Composable
fun IconShoppingBag(
    modifier: Modifier = Modifier.size(16.dp),
    tint: Color = Color(0xFF4F46E5),
    strokeWidth: Dp = 1.8.dp
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = strokeWidth.toPx()

        val body = Path().apply {
            moveTo(w * 0.2f, h * 0.35f)
            lineTo(w * 0.8f, h * 0.35f)
            lineTo(w * 0.86f, h * 0.9f)
            lineTo(w * 0.14f, h * 0.9f)
            close()
        }
        drawPath(body, tint, style = Stroke(sw, cap = StrokeCap.Round, join = StrokeJoin.Round))

        val handle = Path().apply {
            moveTo(w * 0.36f, h * 0.35f)
            cubicTo(w * 0.36f, h * 0.12f, w * 0.64f, h * 0.12f, w * 0.64f, h * 0.35f)
        }
        drawPath(handle, tint, style = Stroke(sw, cap = StrokeCap.Round))
    }
}

@Composable
fun IconShoppingCart(
    modifier: Modifier = Modifier.size(16.dp),
    tint: Color = Color(0xFF0D9488),
    strokeWidth: Dp = 1.8.dp
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = strokeWidth.toPx()

        val path = Path().apply {
            moveTo(w * 0.1f, h * 0.2f)
            lineTo(w * 0.25f, h * 0.2f)
            lineTo(w * 0.4f, h * 0.65f)
            lineTo(w * 0.82f, h * 0.65f)
            lineTo(w * 0.92f, h * 0.32f)
            lineTo(w * 0.3f, h * 0.32f)
        }
        drawPath(path, tint, style = Stroke(sw, cap = StrokeCap.Round, join = StrokeJoin.Round))

        // Wheels
        drawCircle(tint, radius = w * 0.08f, center = Offset(w * 0.42f, h * 0.82f), style = Fill)
        drawCircle(tint, radius = w * 0.08f, center = Offset(w * 0.78f, h * 0.82f), style = Fill)
    }
}

@Composable
fun IconBell(
    modifier: Modifier = Modifier.size(14.dp),
    tint: Color = Color.White
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = 1.5.dp.toPx()

        val bell = Path().apply {
            moveTo(w * 0.5f, h * 0.15f)
            cubicTo(w * 0.3f, h * 0.15f, w * 0.25f, h * 0.45f, w * 0.2f, h * 0.65f)
            lineTo(w * 0.15f, h * 0.75f)
            lineTo(w * 0.85f, h * 0.75f)
            lineTo(w * 0.8f, h * 0.65f)
            cubicTo(w * 0.75f, h * 0.45f, w * 0.7f, h * 0.15f, w * 0.5f, h * 0.15f)
            close()
        }
        drawPath(bell, tint, style = Fill)

        drawCircle(tint, radius = w * 0.12f, center = Offset(w * 0.5f, h * 0.85f))
    }
}

@Composable
fun IconRefresh(
    modifier: Modifier = Modifier.size(15.dp),
    tint: Color = Color(0xFF94A3B8),
    strokeWidth: Dp = 1.8.dp
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = strokeWidth.toPx()

        drawArc(
            color = tint,
            startAngle = 45f,
            sweepAngle = 270f,
            useCenter = false,
            topLeft = Offset(w * 0.15f, h * 0.15f),
            size = Size(w * 0.7f, h * 0.7f),
            style = Stroke(sw, cap = StrokeCap.Round)
        )

        val arrow = Path().apply {
            moveTo(w * 0.75f, h * 0.15f)
            lineTo(w * 0.9f, h * 0.32f)
            lineTo(w * 0.65f, h * 0.35f)
        }
        drawPath(arrow, tint, style = Stroke(sw, cap = StrokeCap.Round, join = StrokeJoin.Round))
    }
}

@Composable
fun IconLock(
    modifier: Modifier = Modifier.size(14.dp),
    tint: Color = Color.White
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = 1.6.dp.toPx()

        drawRoundRect(
            color = tint,
            topLeft = Offset(w * 0.2f, h * 0.45f),
            size = Size(w * 0.6f, h * 0.45f),
            cornerRadius = androidx.compose.ui.geometry.CornerRadius(w * 0.1f, w * 0.1f),
            style = Fill
        )

        val shackle = Path().apply {
            moveTo(w * 0.32f, h * 0.45f)
            lineTo(w * 0.32f, h * 0.3f)
            cubicTo(w * 0.32f, h * 0.15f, w * 0.68f, h * 0.15f, w * 0.68f, h * 0.3f)
            lineTo(w * 0.68f, h * 0.45f)
        }
        drawPath(shackle, tint, style = Stroke(sw, cap = StrokeCap.Round))
    }
}

@Composable
fun IconPhone(
    modifier: Modifier = Modifier.size(13.dp),
    tint: Color = Color(0xFF94A3B8)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = 1.5.dp.toPx()

        val phone = Path().apply {
            moveTo(w * 0.2f, h * 0.15f)
            cubicTo(w * 0.2f, h * 0.45f, w * 0.55f, h * 0.8f, w * 0.85f, h * 0.8f)
            lineTo(w * 0.75f, h * 0.6f)
            lineTo(w * 0.6f, h * 0.65f)
            cubicTo(w * 0.45f, h * 0.55f, w * 0.45f, h * 0.55f, w * 0.35f, h * 0.4f)
            lineTo(w * 0.4f, h * 0.25f)
            close()
        }
        drawPath(phone, tint, style = Stroke(sw, cap = StrokeCap.Round, join = StrokeJoin.Round))
    }
}

@Composable
fun IconMail(
    modifier: Modifier = Modifier.size(13.dp),
    tint: Color = Color(0xFF94A3B8)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = 1.5.dp.toPx()

        drawRoundRect(
            color = tint,
            topLeft = Offset(w * 0.1f, h * 0.2f),
            size = Size(w * 0.8f, h * 0.6f),
            cornerRadius = androidx.compose.ui.geometry.CornerRadius(w * 0.1f, w * 0.1f),
            style = Stroke(sw)
        )

        val flap = Path().apply {
            moveTo(w * 0.12f, h * 0.25f)
            lineTo(w * 0.5f, h * 0.52f)
            lineTo(w * 0.88f, h * 0.25f)
        }
        drawPath(flap, tint, style = Stroke(sw, cap = StrokeCap.Round, join = StrokeJoin.Round))
    }
}

@Composable
fun IconHeadphones(
    modifier: Modifier = Modifier.size(18.dp),
    tint: Color = Color(0xFF475569)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = 1.6.dp.toPx()

        val band = Path().apply {
            moveTo(w * 0.2f, h * 0.6f)
            cubicTo(w * 0.2f, h * 0.15f, w * 0.8f, h * 0.15f, w * 0.8f, h * 0.6f)
        }
        drawPath(band, tint, style = Stroke(sw, cap = StrokeCap.Round))

        drawRoundRect(
            color = tint,
            topLeft = Offset(w * 0.12f, h * 0.55f),
            size = Size(w * 0.16f, h * 0.32f),
            cornerRadius = androidx.compose.ui.geometry.CornerRadius(w * 0.08f, w * 0.08f),
            style = Fill
        )
        drawRoundRect(
            color = tint,
            topLeft = Offset(w * 0.72f, h * 0.55f),
            size = Size(w * 0.16f, h * 0.32f),
            cornerRadius = androidx.compose.ui.geometry.CornerRadius(w * 0.08f, w * 0.08f),
            style = Fill
        )
    }
}

@Composable
fun IconClock(
    modifier: Modifier = Modifier.size(11.dp),
    tint: Color = Color(0xFF94A3B8)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = 1.3.dp.toPx()

        drawCircle(
            color = tint,
            radius = w * 0.45f,
            center = Offset(w * 0.5f, h * 0.5f),
            style = Stroke(sw)
        )

        val hands = Path().apply {
            moveTo(w * 0.5f, h * 0.25f)
            lineTo(w * 0.5f, h * 0.5f)
            lineTo(w * 0.7f, h * 0.5f)
        }
        drawPath(hands, tint, style = Stroke(sw, cap = StrokeCap.Round))
    }
}

@Composable
fun IconPrinter(
    modifier: Modifier = Modifier.size(11.dp),
    tint: Color = Color.White
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = 1.2.dp.toPx()

        val paper = Path().apply {
            moveTo(w * 0.25f, h * 0.35f)
            lineTo(w * 0.25f, h * 0.1f)
            lineTo(w * 0.75f, h * 0.1f)
            lineTo(w * 0.75f, h * 0.35f)
        }
        drawPath(paper, tint, style = Stroke(sw))

        drawRoundRect(
            color = tint,
            topLeft = Offset(w * 0.1f, h * 0.35f),
            size = Size(w * 0.8f, h * 0.35f),
            cornerRadius = androidx.compose.ui.geometry.CornerRadius(w * 0.08f, w * 0.08f),
            style = Fill
        )

        drawRoundRect(
            color = tint,
            topLeft = Offset(w * 0.25f, h * 0.65f),
            size = Size(w * 0.5f, h * 0.25f),
            cornerRadius = androidx.compose.ui.geometry.CornerRadius(w * 0.04f, w * 0.04f),
            style = Stroke(sw)
        )
    }
}

@Composable
fun IconCoffee(
    modifier: Modifier = Modifier.size(18.dp),
    tint: Color = Color(0xFF4F46E5)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = 1.5.dp.toPx()

        val cup = Path().apply {
            moveTo(w * 0.15f, h * 0.3f)
            lineTo(w * 0.7f, h * 0.3f)
            cubicTo(w * 0.7f, h * 0.75f, w * 0.15f, h * 0.75f, w * 0.15f, h * 0.3f)
        }
        drawPath(cup, tint, style = Stroke(sw))

        val handle = Path().apply {
            moveTo(w * 0.7f, h * 0.38f)
            cubicTo(w * 0.92f, h * 0.38f, w * 0.92f, h * 0.62f, w * 0.7f, h * 0.62f)
        }
        drawPath(handle, tint, style = Stroke(sw, cap = StrokeCap.Round))

        drawLine(
            color = tint,
            start = Offset(w * 0.1f, h * 0.82f),
            end = Offset(w * 0.78f, h * 0.82f),
            strokeWidth = sw,
            cap = StrokeCap.Round
        )
    }
}

@Composable
fun IconUser(
    modifier: Modifier = Modifier.size(13.dp),
    tint: Color = Color(0xFF4F46E5)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height

        drawCircle(
            color = tint,
            radius = w * 0.22f,
            center = Offset(w * 0.5f, h * 0.32f),
            style = Fill
        )

        val body = Path().apply {
            moveTo(w * 0.15f, h * 0.88f)
            cubicTo(w * 0.15f, h * 0.65f, w * 0.32f, h * 0.60f, w * 0.5f, h * 0.60f)
            cubicTo(w * 0.68f, h * 0.60f, w * 0.85f, h * 0.65f, w * 0.85f, h * 0.88f)
            close()
        }
        drawPath(body, tint, style = Fill)
    }
}

@Composable
fun IconUsers(
    modifier: Modifier = Modifier.size(14.dp),
    tint: Color = Color.White
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = 1.6.dp.toPx()

        drawCircle(
            color = tint,
            radius = w * 0.18f,
            center = Offset(w * 0.5f, h * 0.3f),
            style = Stroke(sw)
        )

        val centerBody = Path().apply {
            moveTo(w * 0.25f, h * 0.85f)
            cubicTo(w * 0.25f, h * 0.62f, w * 0.75f, h * 0.62f, w * 0.75f, h * 0.85f)
        }
        drawPath(centerBody, tint, style = Stroke(sw, cap = StrokeCap.Round))

        val leftBody = Path().apply {
            moveTo(w * 0.12f, h * 0.82f)
            cubicTo(w * 0.12f, h * 0.68f, w * 0.24f, h * 0.66f, w * 0.28f, h * 0.7f)
        }
        drawPath(leftBody, tint, style = Stroke(sw, cap = StrokeCap.Round))

        val rightBody = Path().apply {
            moveTo(w * 0.72f, h * 0.7f)
            cubicTo(w * 0.76f, h * 0.66f, w * 0.88f, h * 0.68f, w * 0.88f, h * 0.82f)
        }
        drawPath(rightBody, tint, style = Stroke(sw, cap = StrokeCap.Round))
    }
}

@Composable
fun IconChart(
    modifier: Modifier = Modifier.size(14.dp),
    tint: Color = Color(0xFF4F46E5)
) {
    Canvas(modifier = modifier) {
        val w = size.width
        val h = size.height
        val sw = 1.6.dp.toPx()

        drawRoundRect(
            color = tint,
            topLeft = Offset(w * 0.12f, h * 0.15f),
            size = Size(w * 0.76f, h * 0.7f),
            cornerRadius = androidx.compose.ui.geometry.CornerRadius(2.dp.toPx()),
            style = Stroke(sw)
        )

        val line = Path().apply {
            moveTo(w * 0.22f, h * 0.62f)
            lineTo(w * 0.42f, h * 0.42f)
            lineTo(w * 0.58f, h * 0.54f)
            lineTo(w * 0.78f, h * 0.32f)
        }
        drawPath(line, tint, style = Stroke(sw, cap = StrokeCap.Round, join = StrokeJoin.Round))
    }
}
