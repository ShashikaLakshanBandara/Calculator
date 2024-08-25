package com.octochimp.calculator.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.octochimp.calculator.R
import com.octochimp.calculator.screens.tools.innerShadow
import com.octochimp.calculator.ui.theme.CalculatorTheme


@Composable
fun UpperCard() {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .innerShadow(
                shape = CardDefaults.elevatedShape,
                color = colorResource(id = R.color.key_shadow).copy(alpha = 0.6f),
                blur = 6.dp,
                offsetY = (6).dp,
                offsetX = (6).dp
            )
            .innerShadow(
                shape = CardDefaults.elevatedShape,
                color = colorResource(id = R.color.upper_card_glare),
                blur = 6.dp,
                offsetY = (-6).dp,
                offsetX = (-6).dp
            )
            .background(
                color = colorResource(id = R.color.upper_card_background),
                shape = RoundedCornerShape(11.dp)
            )
            .fillMaxWidth()

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "0",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "+",
                style = MaterialTheme.typography.bodySmall
            )
            Text(

                text = "0",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "=",
                style = MaterialTheme.typography.bodySmall
            )
            Text(

                text = "0",
                style = MaterialTheme.typography.bodyMedium
            )

        }

    }

}

@Preview(showBackground = true,)
@Composable
fun PreviewUpperCard() {
    CalculatorTheme {
        UpperCard()
    }

}