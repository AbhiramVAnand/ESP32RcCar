package com.abhiram.esp32rcremote.constants

sealed class Constants( val name : String) {
    object UP_ARROW : Constants("up")
    object DOWN_ARROW : Constants("down")
    object LEFT_ARROW : Constants("left")
    object RIGHT_ARROW : Constants("right")
}