package com.example.timemanager

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow

class TimeManager {

    val mTime = MutableStateFlow(0)
    private var mIsTimerRunning = false


    suspend fun timerStart() {

        if (!mIsTimerRunning){
            mIsTimerRunning = true
            while (mIsTimerRunning) {
                delay(1000)
                mTime.value = mTime.value.plus(1)
                println("-> ${mTime.value}, $mIsTimerRunning")
            }
        }

    }

    fun timerStop() {
        mIsTimerRunning = false
    }

    fun timerReset(){
        mTime.value = 0
    }
}