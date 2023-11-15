package com.example.bier.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.timemanager.EPeriodicallyMakerStatus

@Composable
fun StartScreen(){

    val mStartScreenViewModel: StartScreenViewModel = viewModel()
    val mPeriodicallyMakerStatus by mStartScreenViewModel.mTM.mPeriodicallyMakerStatus.collectAsState()
    val mPeriodicallyMakerTick by mStartScreenViewModel.mTM.mPeriodicallyMakerTick.collectAsState()

    Column {

        if (mPeriodicallyMakerStatus != EPeriodicallyMakerStatus.TIME_TO_DO_SOMETHING) {
            Icon(
                imageVector = Icons.Default.Face,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .size(64.dp)
                    .padding(16.dp),
                tint = MaterialTheme.colorScheme.primary
            )
        }
        else {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .size(64.dp)
                    .padding(16.dp),
                tint = MaterialTheme.colorScheme.primary
            )
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            onClick = { mStartScreenViewModel.doPeriodically() }
        ) {
            Text(text = "start")
        }
        Text(
            text = mPeriodicallyMakerTick.toString(),
            modifier = Modifier.fillMaxWidth(),
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center
        )
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            onClick = { mStartScreenViewModel.stopDoPeriodically() }
        ) {
            Text(text = "stop")
        }
    }
}