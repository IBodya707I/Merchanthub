package com.example.merchant_hub.ui.onboarding.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.merchant_hub.core.localization.AppLanguage
import com.example.merchant_hub.core.localization.LocalAppLanguage
import com.example.merchant_hub.ui.theme.*
import merchanthub.shared.generated.resources.*
import org.jetbrains.compose.resources.stringResource

@Composable
fun SlideOneCard(
    language: AppLanguage = LocalAppLanguage.current,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(26.dp))
            .background(AppTheme.colors.previewBg)
            .border(1.dp, AppTheme.colors.previewBorder, RoundedCornerShape(26.dp))
            .padding(10.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp, vertical = 2.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50))
                        .background(AppTheme.colors.cardBg)
                        .border(1.dp, AppTheme.colors.cardBorder, RoundedCornerShape(50))
                        .padding(horizontal = 9.dp, vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(16.dp)
                            .clip(CircleShape)
                            .background(Indigo600),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = stringResource(Res.string.slide1_letter),
                            color = Color.White,
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Black
                        )
                    }
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = stringResource(Res.string.slide1_store_name),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50))
                        .background(AppTheme.colors.badgeSuccessBg)
                        .border(1.dp, AppTheme.colors.badgeSuccessBorder, RoundedCornerShape(50))
                        .padding(horizontal = 9.dp, vertical = 3.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    PulsingStatusDot()
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = stringResource(Res.string.slide1_synced),
                        color = AppTheme.colors.badgeSuccessText,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.5.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(20.dp),
                        spotColor = AppTheme.colors.cardShadow
                    )
                    .clip(RoundedCornerShape(20.dp))
                    .background(AppTheme.colors.cardBg)
                    .border(1.dp, AppTheme.colors.cardBorder, RoundedCornerShape(20.dp))
                    .padding(14.dp)
            ) {
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            modifier = Modifier
                                .clip(RoundedCornerShape(50))
                                .background(AppTheme.colors.badgeSuccessBg)
                                .border(1.dp, AppTheme.colors.badgeSuccessBorder, RoundedCornerShape(50))
                                .padding(horizontal = 9.dp, vertical = 3.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            PulsingStatusDot()
                            Spacer(modifier = Modifier.width(5.dp))
                            Text(
                                text = stringResource(Res.string.slide1_live_store),
                                color = AppTheme.colors.badgeSuccessText,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }

                        IconRefresh(
                            modifier = Modifier.size(15.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = stringResource(Res.string.slide1_todays_revenue),
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 0.8.sp
                    )
                    Spacer(modifier = Modifier.height(3.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "₴ 84,250.00",
                            style = AppTheme.typography.codeLarge,
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Row(
                            modifier = Modifier
                                .clip(RoundedCornerShape(50))
                                .background(AppTheme.colors.badgeTealBg)
                                .border(1.dp, AppTheme.colors.badgeTealBorder, RoundedCornerShape(50))
                                .padding(horizontal = 8.dp, vertical = 3.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            IconTrendingUp(modifier = Modifier.size(11.dp), tint = AppTheme.colors.badgeTealText)
                            Spacer(modifier = Modifier.width(3.dp))
                            Text(
                                text = stringResource(Res.string.slide1_revenue_growth),
                                color = AppTheme.colors.badgeTealText,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(14.dp))
                            .background(AppTheme.colors.subCardBg)
                            .border(1.dp, AppTheme.colors.subCardBorder, RoundedCornerShape(14.dp))
                            .padding(10.dp)
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = stringResource(Res.string.slide1_velocity),
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(50))
                                        .background(AppTheme.colors.badgeBrandBg)
                                        .border(1.dp, AppTheme.colors.badgeBrandBorder, RoundedCornerShape(50))
                                        .padding(horizontal = 7.dp, vertical = 2.dp)
                                    ) {
                                    Text(
                                        text = stringResource(Res.string.slide1_peak),
                                        color = AppTheme.colors.badgeBrandText,
                                        fontSize = 9.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(6.dp))

                            val chartStroke = AppTheme.colors.chartStroke
                            val gradTop = AppTheme.colors.chartGradientTop

                            Canvas(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(48.dp)
                            ) {
                                val w = size.width
                                val h = size.height

                                val path = Path().apply {
                                    moveTo(0f, h * 0.85f)
                                    cubicTo(w * 0.12f, h * 0.82f, w * 0.22f, h * 0.55f, w * 0.35f, h * 0.45f)
                                    cubicTo(w * 0.48f, h * 0.35f, w * 0.55f, h * 0.15f, w * 0.65f, h * 0.20f)
                                    cubicTo(w * 0.75f, h * 0.25f, w * 0.85f, h * 0.60f, w, h * 0.30f)
                                }

                                val fillPath = Path().apply {
                                    addPath(path)
                                    lineTo(w, h)
                                    lineTo(0f, h)
                                    close()
                                }

                                drawPath(
                                    path = fillPath,
                                    brush = Brush.verticalGradient(
                                        colors = listOf(
                                            gradTop,
                                            Color.Transparent
                                        )
                                    )
                                )

                                drawPath(
                                    path = path,
                                    color = chartStroke,
                                    style = Stroke(width = 2.2.dp.toPx(), cap = StrokeCap.Round)
                                )

                                val peakX = w * 0.62f
                                val peakY = h * 0.18f

                                drawCircle(
                                    color = chartStroke.copy(alpha = 0.25f),
                                    radius = 7.dp.toPx(),
                                    center = Offset(peakX, peakY)
                                )
                                drawCircle(
                                    color = chartStroke,
                                    radius = 4.dp.toPx(),
                                    center = Offset(peakX, peakY)
                                )
                                drawCircle(
                                    color = Color.White,
                                    radius = 2.dp.toPx(),
                                    center = Offset(peakX, peakY)
                                )
                            }

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("06:00", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 9.sp, style = AppTheme.typography.labelBadge)
                                Text("09:00", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 9.sp, style = AppTheme.typography.labelBadge)
                                Text("12:00", color = MaterialTheme.colorScheme.onSurfaceVariant, fontSize = 9.sp, style = AppTheme.typography.labelBadge)
                                Text(
                                    text = stringResource(Res.string.slide1_now),
                                    color = MaterialTheme.colorScheme.primary,
                                    fontSize = 9.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(AppTheme.colors.subCardBg)
                                .border(1.dp, AppTheme.colors.subCardBorder, RoundedCornerShape(12.dp))
                                .padding(10.dp)
                        ) {
                            Column {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    IconShoppingBag(modifier = Modifier.size(13.dp), tint = Indigo600)
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(
                                        text = stringResource(Res.string.slide1_orders),
                                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = "142",
                                    style = AppTheme.typography.codeMedium,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = stringResource(Res.string.slide1_this_hr),
                                    color = Emerald500,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .background(AppTheme.colors.subCardBg)
                                .border(1.dp, AppTheme.colors.subCardBorder, RoundedCornerShape(12.dp))
                                .padding(10.dp)
                        ) {
                            Column {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    IconShoppingCart(modifier = Modifier.size(13.dp), tint = Color(0xFF0D9488))
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(
                                        text = stringResource(Res.string.slide1_avg_basket),
                                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                                        fontSize = 11.sp,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = "₴ ",
                                        color = MaterialTheme.colorScheme.onSurface,
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        text = "593",
                                        style = AppTheme.typography.codeMedium,
                                        color = MaterialTheme.colorScheme.onSurface,
                                        fontSize = 18.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                                Text(
                                    text = stringResource(Res.string.slide1_vs_avg),
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 9.sp
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = stringResource(Res.string.slide1_sales_channels),
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = stringResource(Res.string.slide1_today),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 10.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(6.dp)
                            .clip(RoundedCornerShape(50))
                            .background(AppTheme.colors.subCardBorder)
                    ) {
                        Box(
                            modifier = Modifier
                                .weight(0.65f)
                                .fillMaxHeight()
                                .background(Indigo600)
                        )
                        Box(
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(Emerald500)
                        )
                        Box(
                            modifier = Modifier
                                .weight(0.10f)
                                .fillMaxHeight()
                                .background(Color(0xFFE1306C))
                        )
                    }

                    Spacer(modifier = Modifier.height(6.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(6.dp)
                                    .clip(CircleShape)
                                    .background(Indigo600)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Web 65%",
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(6.dp)
                                    .clip(CircleShape)
                                    .background(Emerald500)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Rozetka 25%",
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }

                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(6.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFFE1306C))
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Insta 10%",
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .offset(x = (-16).dp, y = (10).dp)
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(50),
                    spotColor = AppTheme.colors.floatingPillShadow
                )
                .clip(RoundedCornerShape(50))
                .background(
                    Brush.horizontalGradient(AppTheme.colors.floatingPillGradient)
                )
                .border(1.5.dp, AppTheme.colors.cardBg, RoundedCornerShape(50))
                .padding(horizontal = 12.dp, vertical = 5.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconBell(modifier = Modifier.size(11.dp), tint = Color.White)
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = stringResource(Res.string.slide1_new_orders_badge),
                    color = Color.White,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
