package com.example.merchant_hub.core.localization

import java.util.Locale

actual fun setPlatformLocale(languageCode: String) {
    val locale = Locale.forLanguageTag(languageCode)
    Locale.setDefault(locale)
}

actual fun getSystemLocaleLanguage(): String {
    return Locale.getDefault().language
}
