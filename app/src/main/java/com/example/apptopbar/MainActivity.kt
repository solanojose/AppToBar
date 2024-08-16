package com.example.apptopbar

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apptopbar.ui.theme.AppTopBarTheme
import com.example.apptopbar.ui.theme.Instagram

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTopBarTheme {
                Surface {
                    MyTopAppBar()
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar() {
    val context = LocalContext.current.applicationContext
    TopAppBar(title = { Text(text = "Instagram",
                            style = TextStyle(fontFamily = FontFamily.Cursive,
                                    fontSize = 23.sp,
                                    fontWeight = FontWeight.Black))},
                                    navigationIcon = {
                                    IconButton(onClick = { Toast.makeText(context, " Hola soy Instagram!", Toast.LENGTH_SHORT).show()}
                                        ) {
                                        Icon(painter = painterResource(id = R.drawable.instagram),
                                            contentDescription = "",
                                            tint = Color.Unspecified,
                                            modifier = Modifier.size(45.dp)
                                        )
                    }
                }, colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Instagram,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.Black
                ), actions = {
                    IconButton(onClick = { Toast.makeText(context, " Notificacion", Toast.LENGTH_SHORT).show() }) {
                        Icon(imageVector = Icons.Filled.FavoriteBorder, contentDescription ="", tint = Color.White)
                    }
                    IconButton(onClick = { Toast.makeText(context, " Ajuste", Toast.LENGTH_SHORT).show() }) {
                        Icon(imageVector = Icons.Filled.MoreVert, contentDescription ="", tint = Color.White)
                    }
        }
    )
}

@Composable
@Preview
fun PreviewTopAppBar() {
   AppTopBarTheme {
       MyTopAppBar()
   }
}



//.clip(CircleShape)
//.border(0.3.dp, MaterialTheme.colorScheme.primary, CircleShape)