package com.octochimp.calculator

data class CalculatorState(
    val firstLine :String = "",
    val operator : String = "",
    val secondLine :String = "",
    val showEqual : Boolean = false,
    val answer : String = "",
    val clear : Boolean = false,
    val power : Boolean = false,
    val lightMode:Boolean = true,


)
