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
fun SlideThreeCard(
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
                            .size(6.dp)
                            .clip(CircleShape)
                            .background(Indigo600)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = stringResource(Res.string.slide3_products_count),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

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
                            .size(6.dp)
                            .clip(CircleShape)
                            .background(Emerald500)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "USD/UAH 41.40",
                        style = AppTheme.typography.labelBadge,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold
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
                        Text(
                            text = "SKU: MH-7749-BLK",
                            style = AppTheme.typography.labelBadge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier
                                .clip(RoundedCornerShape(6.dp))
                                .background(AppTheme.colors.subCardBg)
                                .border(1.dp, AppTheme.colors.subCardBorder, RoundedCornerShape(6.dp))
                                .padding(horizontal = 8.dp, vertical = 3.dp)
                        )

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
                                text = stringResource(Res.string.slide3_in_stock),
                                color = AppTheme.colors.badgeSuccessText,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(44.dp)
                                .clip(RoundedCornerShape(12.dp))
                                .background(AppTheme.colors.subCardBg)
                                .border(1.dp, AppTheme.colors.subCardBorder, RoundedCornerShape(12.dp)),
                            contentAlignment = Alignment.Center
                        ) {
                            IconCoffee(modifier = Modifier.size(24.dp), tint = MaterialTheme.colorScheme.primary)
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Aeropress Titanium Brewer",
                                color = MaterialTheme.colorScheme.onSurface,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = stringResource(Res.string.slide3_category),
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontSize = 11.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(14.dp))
                            .background(AppTheme.colors.subCardBg)
                            .border(1.dp, AppTheme.colors.subCardBorder, RoundedCornerShape(14.dp))
                            .padding(12.dp)
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Box(
                                        modifier = Modifier
                                            .size(22.dp)
                                            .clip(RoundedCornerShape(6.dp))
                                            .background(MaterialTheme.colorScheme.primary),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        IconLock(modifier = Modifier.size(11.dp), tint = Color.White)
                                    }
                                    Spacer(modifier = Modifier.width(7.dp))
                                    Text(
                                        text = stringResource(Res.string.slide3_locked_snapshot),
                                        color = MaterialTheme.colorScheme.onSurface,
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }

                                Row(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(50))
                                        .background(AppTheme.colors.badgeSuccessBg)
                                        .border(1.dp, AppTheme.colors.badgeSuccessBorder, RoundedCornerShape(50))
                                        .padding(horizontal = 8.dp, vertical = 3.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = stringResource(Res.string.slide3_margin),
                                        color = AppTheme.colors.badgeSuccessText,
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = "₴ 3,250.00",
                                style = AppTheme.typography.codeLarge,
                                color = MaterialTheme.colorScheme.onSurface,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Row(
                                modifier = Modifier.padding(top = 3.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                IconTrendingUp(modifier = Modifier.size(11.dp), tint = Color(0xFF0D9488))
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = stringResource(Res.string.slide3_locked_rate),
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 4.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        text = stringResource(Res.string.slide3_cost_price_label),
                                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                                        fontSize = 10.sp
                                    )
                                    Text(
                                        text = "₴ 1,859.00",
                                        style = AppTheme.typography.codeMedium,
                                        color = MaterialTheme.colorScheme.onSurface,
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }

                                Text(
                                    text = "15.10.2026 13:39",
                                    style = AppTheme.typography.labelBadge,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 9.sp
                                )
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = stringResource(Res.string.slide3_price_history_label),
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "₴ 3,090 — ₴ 3,410",
                                    style = AppTheme.typography.labelBadge,
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 9.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }

                            val strokeColor = AppTheme.colors.chartStroke
                            val gradTop = AppTheme.colors.chartGradientTop

                            Canvas(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(44.dp)
                                    .padding(top = 4.dp)
                            ) {
                                val w = size.width
                                val h = size.height

                                val path = Path().apply {
                                    moveTo(0f, h * 0.76f)
                                    cubicTo(w * 0.20f, h * 0.76f, w * 0.35f, h * 0.56f, w * 0.52f, h * 0.54f)
                                    cubicTo(w * 0.70f, h * 0.52f, w * 0.82f, h * 0.32f, w, h * 0.26f)
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
                                    color = strokeColor,
                                    style = Stroke(width = 2.4.dp.toPx(), cap = StrokeCap.Round)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(10.dp))
                            .background(AppTheme.colors.subCardBg)
                            .border(1.dp, AppTheme.colors.subCardBorder, RoundedCornerShape(10.dp))
                            .padding(horizontal = 9.dp, vertical = 7.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            IconRefresh(modifier = Modifier.size(12.dp), tint = MaterialTheme.colorScheme.onSurfaceVariant)
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = stringResource(Res.string.slide3_channels_row),
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
                                .padding(horizontal = 7.dp, vertical = 2.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            PulsingStatusDot()
                            Spacer(modifier = Modifier.width(3.dp))
                            Text(
                                text = "LIVE",
                                color = AppTheme.colors.badgeSuccessText,
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }
    }
}
