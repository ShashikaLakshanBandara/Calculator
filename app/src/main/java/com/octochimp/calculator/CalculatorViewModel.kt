package com.octochimp.calculator

import androidx.lifecycle.ViewModel
import com.octochimp.calculator.calculations.Calculations
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CalculatorViewModel : ViewModel() {
    val calculator = Calculations()

    private val _state = MutableStateFlow(CalculatorState())

    val state = _state.asStateFlow()

    fun onEvent(event: CalculatorEvents) {
        when (event) {
            CalculatorEvents.onClicklightModeButton -> {
                _state.update {
                    it.copy(
                        lightMode = !(it.lightMode)
                    )
                }
            }

            is CalculatorEvents.onClickNumber -> {

                if (_state.value.answer != "") {
                    reset(event.key,"")

                } else {
                    if (_state.value.isOperatorPressed) {
                        if (_state.value.secondLine == "0") {
                            if (event.key != "0") {
                                _state.update {
                                    it.copy(
                                        secondLine = event.key
                                    )
                                }
                            }

                        } else {
                            _state.update {
                                it.copy(
                                    secondLine = it.secondLine + event.key
                                )
                            }
                        }

                    } else (if (_state.value.firstLine == "0") {
                        if (event.key != "0") {
                            _state.update {
                                it.copy(
                                    firstLine = event.key
                                )
                            }
                        }

                    } else {
                        _state.update {
                            it.copy(
                                firstLine = it.firstLine + event.key
                            )
                        }
                    })

                }


            }

            is CalculatorEvents.onClickOperator -> {

                if(_state.value.answer !=""){
                    reset(_state.value.answer,event.operator)
                }
                _state.update {
                    it.copy(
                        operator = event.operator, isOperatorPressed = true
                    )
                }
            }

            CalculatorEvents.onClickEqualButton -> {

                if (_state.value.firstLine != "" && _state.value.secondLine != "") {
                    _state.update {
                        it.copy(
                            isShowEqual = true, answer = calculator.calculate(
                                operator = it.operator,
                                firstLine = it.firstLine.toDouble(),
                                secondLine = it.secondLine.toDouble()
                            )
                        )
                    }
                }


            }

            CalculatorEvents.onClickACButton -> {
                reset("0","")
            }

            CalculatorEvents.onClickCEButton -> {
                if (_state.value.isOperatorPressed) {
                    _state.update {
                        it.copy(
                            secondLine = it.secondLine.dropLast(1)
                        )
                    }
                } else {
                    _state.update {
                        it.copy(
                            firstLine = it.firstLine.dropLast(1)
                        )
                    }
                }
            }
        }
    }
    private fun reset(value:String,operator:String){
        _state.update {
            it.copy(
                firstLine = value,
                secondLine = "",
                answer = "",
                operator = operator,
                isShowEqual = false,
                isOperatorPressed = false
            )
        }
    }
}

