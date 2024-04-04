package me.jeonguk.kopringplayground.exception

open class BaseException(
    val status: Int,
    var code: String,
    var default: String? = null
) : RuntimeException(code) {
}