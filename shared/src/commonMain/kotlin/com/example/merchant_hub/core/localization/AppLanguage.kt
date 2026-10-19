package com.example.merchant_hub.core.localization

import androidx.compose.runtime.staticCompositionLocalOf

enum class AppLanguage(val code: String, val isoCode: String, val title: String) {
    UA("UA", "uk", "Українська"),
    EN("EN", "en", "English");

    companion object {
        fun fromCode(code: String): AppLanguage {
            return entries.firstOrNull { it.code.equals(code, ignoreCase = true) || it.isoCode.equals(code, ignoreCase = true) } ?: UA
        }

        fun fromSystemLocale(): AppLanguage {
            val systemLang = getSystemLocaleLanguage().lowercase()
            return if (systemLang.startsWith("uk")) UA else EN
        }
    }
}

val LocalAppLanguage = staticCompositionLocalOf { AppLanguage.UA }
