package com.example.merchant_hub

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform