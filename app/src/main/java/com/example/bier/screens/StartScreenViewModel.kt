package com.example.bier.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class StartScreenViewModel: ViewModel() {

    //val mTM = TimeManager()
    //val mX = mTM.mTime


    //val mY = MutableLiveData(0)
    //val mJsonString = MutableLiveData("")



    init {
        //val user = User("Jerry", 2, Number.ONE)
        //mJsonString.value = Json.encodeToString(user)
        /*
        val format: Json = Json {
            prettyPrint = true // make string well readable
            isLenient          // ignore quotation of values
            ignoreUnknownKeys
            //coerceInputValues = true    // handle nullable and enum errors
            //encodeDefaults = true
            //explicitNulls = false
        }
        val jString = """{"name":"Micky","age":3, "mNumber":  "ONE"}"""
        val dataObject = format.decodeFromString<User>(jString)

        println(dataObject)
        println(mJsonString.value)

         */

    }

    fun start(){
        viewModelScope.launch {
          // mTM.timerStart()
        }
    }
    fun stop(){
       // mTM.timerStop()
    }



}