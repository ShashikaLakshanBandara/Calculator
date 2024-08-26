package com.octochimp.calculator.model

import com.octochimp.calculator.CalculatorEvents
import com.octochimp.calculator.CalculatorViewModel

data class Key(
    val keyName: String,
    val onPressed:(onEvent: (CalculatorEvents) -> Unit) -> Unit
)
