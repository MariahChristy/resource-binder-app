package org.sfcivictech.android.shared.resourcebinder

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return sayHello(platform.name)
    }
}