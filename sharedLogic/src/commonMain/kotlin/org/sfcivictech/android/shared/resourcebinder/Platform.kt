package org.sfcivictech.android.shared.resourcebinder

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform