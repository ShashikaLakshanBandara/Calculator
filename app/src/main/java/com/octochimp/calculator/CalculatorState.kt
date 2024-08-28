package com.octochimp.calculator

data class CalculatorState(
    val firstLine :String = "0",
    val operator : String = "",
    val isOperatorPressed : Boolean = false,
    val secondLine :String = "",
    val isShowEqual : Boolean = false,
    val answer : String = "",
    val lightMode:Boolean = true,
    val isPositiveNumber:Boolean = true

)
