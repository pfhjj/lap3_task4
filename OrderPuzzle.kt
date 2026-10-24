package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ChainA(modifier: Modifier = Modifier) {
    Text(
        text = "content",
        modifier = modifier
            .background(Color(0xFF3DDC84))
            .padding(24.dp)
    )
}

@Composable
fun ChainB(modifier: Modifier = Modifier) {
    Text(
        text = "content",
        modifier = modifier
            .padding(24.dp)
            .background(Color(0xFF3DDC84))
    )
}

@Composable
fun ChainC(modifier: Modifier = Modifier) {
    Text(
        text = "content",
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFF3DDC84))
            .padding(24.dp)
    )
}

@Composable
fun TapTargetExample() {
    Column {
        Text(
            text = "Clickable before padding",
            modifier = Modifier
                .clickable { }
                .padding(16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Clickable after padding",
            modifier = Modifier
                .padding(16.dp)
                .clickable { }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun OrderPuzzlePreview() {
    Column(
        modifier = Modifier.padding(24.dp)
    ) {
        ChainA()

        Spacer(modifier = Modifier.height(24.dp))

        ChainB()

        Spacer(modifier = Modifier.height(24.dp))

        ChainC()

        Spacer(modifier = Modifier.height(32.dp))

        TapTargetExample()
    }
}