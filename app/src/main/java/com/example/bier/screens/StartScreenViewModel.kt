package com.example.bier.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.timemanager.TimeManager
import kotlinx.coroutines.launch

class StartScreenViewModel: ViewModel() {

    val mTM = TimeManager()

    fun doPeriodically(){
        viewModelScope.launch {
            mTM.doPeriodically(1000,2, {} )
        }
    }
    fun stopDoPeriodically(){
        mTM.stopDoPeriodically()
    }



}