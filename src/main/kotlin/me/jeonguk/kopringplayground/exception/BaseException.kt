package me.jeonguk.kopringplayground.exception

open class BaseException(
    val status: Int,
    var code: String,
    var default: String? = null,
    var args: Array<out Any?>? = null
) : RuntimeException(code) {
}