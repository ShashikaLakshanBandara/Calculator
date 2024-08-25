package com.octochimp.calculator.model

data class Key(
    val keyName: String,
    val onTap: () -> Unit,
)
