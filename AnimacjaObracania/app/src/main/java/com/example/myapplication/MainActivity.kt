package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var isAnimation:AnimationDrawable
    private lateinit var btn:Button
    private lateinit var img:ImageView

    var isStart = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /** set find Id for image (img) and button (btn)*/
        img = findViewById(R.id.img)
        btn = findViewById(R.id.btn)
        img.setImageResource(R.drawable.animation_item)
        /** set Animation*/
        isAnimation = img.drawable as AnimationDrawable
        btn.setBackgroundColor(Color.GREEN)
        /**set animation Start */
        btn.setOnClickListener {
            if (!isStart){
                isAnimation.start()
                btn.text = "stop"
                isStart  = true
                btn.setBackgroundColor(Color.RED)

            }
            else{
                isAnimation.stop()
                btn.text = "Start"
                isStart  = false
                btn.setBackgroundColor(Color.GREEN)
            }
        }
    }

}
