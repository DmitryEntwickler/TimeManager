package com.example.timemanager

import kotlinx.coroutines.delay

class TimeManager {

    var time = 0
    private var isTimerRunning = false


    suspend fun timerStart(){
        if (!isTimerRunning) {
            isTimerRunning = true
            while (isTimerRunning){
                delay(1000)
                time += 1
            }
        }

    }

    fun timerStop(){
        isTimerRunning = false
    }
}