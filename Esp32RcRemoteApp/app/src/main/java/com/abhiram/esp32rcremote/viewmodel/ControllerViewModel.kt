package com.abhiram.esp32rcremote.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abhiram.esp32rcremote.constants.Constants
import com.abhiram.esp32rcremote.esp32.Esp32ApiInstance
import kotlinx.coroutines.launch

class ControllerViewModel : ViewModel(){
    private val esp32Api = Esp32ApiInstance.api

    fun onArrowClick(arrow : String){
        viewModelScope.launch {
            when(arrow){
                Constants.UP_ARROW.name -> {
                    esp32Api.onUpArrow()
                }
                Constants.DOWN_ARROW.name -> {
                    esp32Api.onDownArrow()
                }
                Constants.LEFT_ARROW.name -> {
                    esp32Api.onUpArrow()
                }
                Constants.RIGHT_ARROW.name -> {
                    esp32Api.onDownArrow()
                }
            }
        }
    }
}