package com.example.timemanager

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow

class TimeManager() {

    // public parameter

    val mTime = MutableStateFlow(0)
    val mPeriodicallyMakerStatus = MutableStateFlow(EPeriodicallyMakerStatus.STOPPED)
    val mPeriodicallyMakerTick = MutableStateFlow(1L)

    // private parameter

    private var mIsTimerRunning = false

    /**
     *      Simple timer
     **/

    suspend fun timerStart(delay: Long) {
        if (!mIsTimerRunning){
            mIsTimerRunning = true
            while (mIsTimerRunning) {
                delay(delay)
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

    /**
     *
     */
    suspend fun doPeriodically(delay: Long, everyTimes: Int, action: () -> Unit) {
        if (mPeriodicallyMakerStatus.value == EPeriodicallyMakerStatus.STOPPED) {
            mPeriodicallyMakerStatus.value = EPeriodicallyMakerStatus.RUNNING
            while (mPeriodicallyMakerStatus.value != EPeriodicallyMakerStatus.STOPPED) {
                delay(delay)
                if (mPeriodicallyMakerStatus.value != EPeriodicallyMakerStatus.STOPPED) {
                    mPeriodicallyMakerTick.value = mPeriodicallyMakerTick.value.plus(1)
                    if (mPeriodicallyMakerTick.value % everyTimes == 0L) {
                        mPeriodicallyMakerStatus.value = EPeriodicallyMakerStatus.TIME_TO_DO_SOMETHING
                        action()
                    }
                    else {
                        mPeriodicallyMakerStatus.value = EPeriodicallyMakerStatus.RUNNING
                    }
                }
            }
        }
    }

    fun stopDoPeriodically(){
        mPeriodicallyMakerStatus.value = EPeriodicallyMakerStatus.STOPPED
        mPeriodicallyMakerTick.value = 0
        println("-> tick status: ${mPeriodicallyMakerStatus.value}")
    }
}