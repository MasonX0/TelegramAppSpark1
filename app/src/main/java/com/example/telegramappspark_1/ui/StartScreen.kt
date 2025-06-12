import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telegramappspark_1.R

@Preview
@Composable
fun StartScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    Pair(0f, Color(0xFFFcc5906)),
                    Pair(1f, Color(0xFFF00000))
                )
            )
    ) {}
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { },
        horizontalArrangement = Arrangement.End
    ) {
        Box(modifier = Modifier.padding(15.dp)) {
            Row(horizontalArrangement = Arrangement.End) {
                Text(
                    "GoTo",
                    color = Color.White,
                    fontSize = 27.sp
                )
                Image(
                    painter = painterResource(R.drawable.nextplane),
                    null,
                )
            }
        }

    }



    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
    ) {

        Box(
            modifier = Modifier
                .padding(vertical = 10.dp)
                .border(
                    width = (1.5).dp,
                    shape = RoundedCornerShape(50.dp),
                    color = Color.White
                )
                .clickable {},
            contentAlignment = Alignment.CenterStart
        ) {
            Image(
                painter = painterResource(R.drawable.sparkgramlogobigone),
                null,
            )
        }
        Text(text = "SparkGram", fontSize = 40.sp, color = Color.White)
        Text(
            "Please enter your phone number ",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier.padding(vertical = 20.dp, horizontal = 30.dp),
        )
        Spacer(modifier = Modifier.padding(vertical = 20.dp))



        TextField(
            "Your phone number", {},
            shape = RoundedCornerShape(50.dp),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedTextColor = Color.Gray,
                unfocusedTextColor = Color.Gray,

                )

        )


    }
}

