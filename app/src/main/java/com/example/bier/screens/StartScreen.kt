package com.example.bier.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun StartScreen(){

    val mStartScreenViewModel: StartScreenViewModel = viewModel()
    //val mX by mStartScreenViewModel.mTM.mTime.collectAsState()
    //val mJSON by mStartScreenViewModel.mJsonString.observeAsState()

    Column {
        //Text(text = "Handler: $mX")
        //Text(text = "JSON: $mJSON")
        Button(
            onClick = { mStartScreenViewModel.start() }
        ) {
            Text(text = "start")
        }
        Button(
            onClick = { mStartScreenViewModel.stop() }
        ) {
            Text(text = "stop")
        }
    }
}