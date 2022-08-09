package me.jeonguk.kopring.playground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Playground

fun main(args: Array<String>) {
    runApplication<Playground>(*args)
}
