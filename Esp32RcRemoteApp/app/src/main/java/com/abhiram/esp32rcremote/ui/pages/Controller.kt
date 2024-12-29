package com.abhiram.esp32rcremote.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.abhiram.esp32rcremote.R
import com.abhiram.esp32rcremote.constants.Constants
import com.abhiram.esp32rcremote.ui.theme.Grey
import com.abhiram.esp32rcremote.viewmodel.ControllerViewModel

@Composable
fun Controller(innerPadding: PaddingValues, viewModel: ControllerViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize(1F)
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painterResource(id = R.drawable.ic_up_arrow),
            contentDescription = "up arrow",
            modifier = Modifier.size(120.dp)
                .clickable {
                    viewModel.onArrowClick(Constants.UP_ARROW.name)
                },
            tint = Grey
        )
        Row(
            modifier = Modifier.fillMaxWidth(1F), horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painterResource(id = R.drawable.ic_left_arrow),
                contentDescription = "up arrow",
                modifier = Modifier.size(120.dp)
                    .clickable {
                        viewModel.onArrowClick(Constants.DOWN_ARROW.name)
                    },
                tint = Grey
            )
            Spacer(modifier = Modifier.width(24.dp))
            Icon(
                painterResource(id = R.drawable.ic_right_arrrow),
                contentDescription = "up arrow",
                modifier = Modifier.size(120.dp)
                    .clickable {
                        viewModel.onArrowClick(Constants.UP_ARROW.name)
                    },
                tint = Grey
            )
        }
        Icon(
            painterResource(id = R.drawable.ic_down_arrow),
            contentDescription = "up arrow",
            modifier = Modifier.size(120.dp)
                .clickable {
                    viewModel.onArrowClick(Constants.DOWN_ARROW.name)
                },
            tint = Grey
        )
    }
}