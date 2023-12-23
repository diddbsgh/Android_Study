package app.yunho.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.yunho.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFD9D9D9))
                ) {
                    IntroduceButton()
                }
            }
        }
    }
}

//@Composable
//fun Yang2() {
//    Column {
//        Text(text = "asdasdasd")
//        Yang()
//    }
//}
//
//@Composable
//fun Yang() {
//    Column {
//        Text(
//            text = "jhfhgvhgvh",
//            modifier = Modifier
//                .fillMaxSize(0.5f)
//                .align(Alignment.CenterHorizontally)
//                .background(Color(0xFFD9D9D9)),
//            textAlign = TextAlign.Center,
//            fontWeight = FontWeight.Bold,
//            fontSize = 20.sp
//        )
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_foreground),
//            contentDescription = "image",
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun YangPreview() {
//    Yang2()
//}
//
@Composable
fun IntroduceButton() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .fillMaxWidth(0.4f)
            .height(70.dp)
    ) {
        Text(
            text = "서비스",
            modifier = Modifier.padding(
                horizontal = 12.dp,
                vertical = 4.dp,
            ),
            fontSize = 16.sp,
            textAlign = TextAlign.Start
        )
        Text(
            text = "소개",
            modifier = Modifier.padding(
                horizontal = 12.dp,
                vertical = 4.dp,
            ),
            fontSize = 20.sp,
            textAlign = TextAlign.Start
        )
    }
}