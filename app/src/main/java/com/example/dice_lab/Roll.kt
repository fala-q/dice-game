package com.example.dice_lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_roll.*
import java.util.*

class Roll : AppCompatActivity() {


    var d1: Int = 0
    var d2: Int = 0
    var d3: Int = 0
    var d4: Int = 0
    var d5: Int = 0
    var d6: Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_roll)
        textView2.text = "1 : " + d1
        textView3.text = "2 : " + d2
        textView4.text = "3 : " + d3
        textView5.text = "4 : " + d4
        textView6.text = "5 : " + d5
        textView7.text = "6 : " + d6




        var rollIt: ImageView = findViewById(R.id.imageView2)
        rollIt.setOnClickListener {
            var randomInt = Random().nextInt(6)
            when(randomInt){
                   1 ->{
                    imageView2.setImageResource(R.drawable.d1)
                }  2 ->{
                imageView2.setImageResource(R.drawable.d2)
                }  3 ->{
                imageView2.setImageResource(R.drawable.d3)
                }  4 ->{
                imageView2.setImageResource(R.drawable.d4)
                }  5 ->{
                imageView2.setImageResource(R.drawable.d5)
                }  else ->{
                imageView2.setImageResource(R.drawable.d6) }
            }




            when (randomInt) {
                1 -> { d1++
                    textView2.text = " 1 : " + d1
                }
                2 -> { d2++
                    textView3.text = " 2 : " + d2
                }
                3 -> { d3++
                    textView4.text = " 3 : " + d3
                }
                4 -> { d4++
                    textView5.text = " 4 : " + d4
                }
                5 -> { d5++
                    textView6.text = " 5 : " + d5
                }
                else -> { d6++
                    textView7.text = " 6 : " + d6
                }
            }
        }
    }


    fun resetbtn(View : View){
        d1 = 0
        textView2.text= "1 : " + d1
        d2 = 0
        textView3.text= "2 : " + d2
        d3 = 0
        textView4.text= "3 : " + d3
        d4 = 0
        textView5.text= "4 : " + d4
        d5 = 0
        textView6.text= "5 : " + d5
        d6 = 0
        textView7.text= "6 : " + d6
    }
}



