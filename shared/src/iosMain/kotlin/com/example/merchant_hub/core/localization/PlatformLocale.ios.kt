package com.example.merchant_hub.core.localization

import platform.Foundation.NSLocale
import platform.Foundation.NSUserDefaults
import platform.Foundation.currentLocale
import platform.Foundation.languageCode

actual fun setPlatformLocale(languageCode: String) {
    NSUserDefaults.standardUserDefaults.setObject(listOf(languageCode), forKey = "AppleLanguages")
    NSUserDefaults.standardUserDefaults.synchronize()
}

actual fun getSystemLocaleLanguage(): String {
    return NSLocale.currentLocale.languageCode ?: "en"
}
