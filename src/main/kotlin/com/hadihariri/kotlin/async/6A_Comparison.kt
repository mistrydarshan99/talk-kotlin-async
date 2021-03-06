package com.hadihariri.kotlin.async

import kotlinx.coroutines.experimental.*
import kotlin.concurrent.*

fun threads() {
    val jobs = 1..100000
    jobs.forEach {
        thread {
            Thread.sleep(1000L)
            println(".")
        }
    }
}














fun coroutines() = runBlocking {
    val jobs = List(1000000) {
        launch(CommonPool) {
            delay(1000L)
            println(".")
        }
    }
    jobs.forEach {
        it.join()
    }
}









fun main(args: Array<String>) {

    coroutines()

    //threads()

}