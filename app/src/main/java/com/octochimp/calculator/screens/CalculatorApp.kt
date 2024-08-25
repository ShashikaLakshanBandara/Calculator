package com.octochimp.calculator.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.octochimp.calculator.R
import com.octochimp.calculator.screens.composables.KeyBoard
import com.octochimp.calculator.screens.tools.innerShadow
import com.octochimp.calculator.ui.theme.CalculatorTheme

@Composable
fun CalculatorApp(
    modifier: Modifier
){
    Box (
        modifier = modifier
            .fillMaxSize()
            .background(
                color = colorResource(id = R.color.card_background)
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            UpperCard()
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .innerShadow(
                        shape = CardDefaults.elevatedShape,
                        color = colorResource(id = R.color.key_shadow).copy(alpha = 0.2f),
                        blur = 3.dp,
                        offsetY = (3).dp,
                        offsetX = (3).dp
                    )
                    .innerShadow(
                        shape = CardDefaults.elevatedShape,
                        color = colorResource(id = R.color.upper_card_glare).copy(alpha = 0.2f),
                        blur = 3.dp,
                        offsetY = (-3).dp,
                        offsetX = (-3).dp
                    ),
            ) {
                KeyBoard()
            }

        }

    }


}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCalculatorApp(){
    CalculatorTheme {
        CalculatorApp(modifier = Modifier)
    }

}