package com.octochimp.calculator

sealed interface CalculatorEvents {

    data class onClickNumber(val key: String) : CalculatorEvents
    data class onClickOperator(val operator: String) : CalculatorEvents
    data object onClickEqualButton:CalculatorEvents
    data object onClickACButton:CalculatorEvents
    data object onClickCEButton:CalculatorEvents
    data object onClicklightModeButton:CalculatorEvents
    data object onClickNegativeButton : CalculatorEvents
    data object onClickDecimalPoint:CalculatorEvents


}

//val firstLine :String = "",
//val operator : String = "",
//val secondLine :String = "",
//val showEqual : Boolean = false,
//val answer : String = "",
//val clear : Boolean = false,
//val power : Boolean = false,
//val lightMode:Boolean = true,