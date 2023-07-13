package screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import composables.VerticalCard

@Composable
fun NextDays(){
    Column(
        modifier = Modifier.fillMaxHeight()
            .fillMaxWidth(1f)
            .background(Color(0x4F859BAC)) //todo change color to design system
            .padding(24.dp),
    ) {
        LazyColumn(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            item {
                Text( //todo change color and font to design system
                    text = "Next Days",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    modifier = Modifier.padding(start = 18.dp, top = 18.dp, bottom = 16.dp)
                )
            }
            items(7) {
                VerticalCard()
            }
        }
    }
}