package com.octochimp.calculator.screens.composables

import android.graphics.BlurMaskFilter
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.LightMode
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.octochimp.calculator.R
import com.octochimp.calculator.data.keys

fun Modifier.shadow(
    color: Color = Color.Black,
    offsetX: Dp = 0.dp,
    offsetY: Dp = 0.dp,
    blurRadius: Dp = 0.dp,
) = then(drawBehind {
    drawIntoCanvas { canvas ->
        val paint = Paint()
        val frameworkPaint = paint.asFrameworkPaint()
        if (blurRadius != 0.dp) {
            frameworkPaint.maskFilter =
                (BlurMaskFilter(blurRadius.toPx(), BlurMaskFilter.Blur.NORMAL))
        }
        frameworkPaint.color = color.toArgb()

        val leftPixel = offsetX.toPx()
        val topPixel = offsetY.toPx()
        val rightPixel = size.width + topPixel
        val bottomPixel = size.height + leftPixel

        canvas.drawRect(
            left = leftPixel,
            top = topPixel,
            right = rightPixel,
            bottom = bottomPixel,
            paint = paint,
        )
    }
})


@Composable
fun KeyBoard() {
    LazyVerticalGrid(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        columns = GridCells.Fixed(4),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(keys) { key ->
            Box(
                modifier = Modifier
                    .background(
                        color = colorResource(id = R.color.card_background)
                    )
                    .padding(4.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .shadow(
                            color = colorResource(id = R.color.key_shadow).copy(alpha = 0.2f),
                            offsetX = (3).dp,
                            offsetY = (3).dp,
                            blurRadius = 3.dp,
                        )
                        .shadow(
                            color = Color.White.copy(alpha = 0.2f),
                            offsetX = (-3).dp,
                            offsetY = (-3).dp,
                            blurRadius = 3.dp,
                        )

                        .background(
                            color = colorResource(id = R.color.key_background),
                            shape = RoundedCornerShape(5.dp)
                        )
                        .size(
                            width = 50.dp, height = 50.dp
                        ),
                    contentAlignment = Alignment.Center,
                ) {
                    if(key.keyName == ""){
                        Icon(
                            imageVector = Icons.Rounded.LightMode,
                            tint = colorResource(id = R.color.key_color),
                            contentDescription = null
                        )
                    }
                    else{
                        Text(
                            text = key.keyName, style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.key_color),
                                fontSize = 20.sp
                            )
                        )
                    }

                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF56A29B)
@Composable
fun PreviewKeyBoard() {
    KeyBoard()
}
