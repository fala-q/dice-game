package com.example.dice_lab

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startG = findViewById<ImageButton>(R.id.startGame)
        startG.setOnClickListener{
            val intent = Intent(this,Roll::class.java)
            startActivity(intent)
        }
        quitGame.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Are you sure you want to quit?")
            builder.create()
            builder.setPositiveButton("Yes",DialogInterface.OnClickListener{
                    dialog, id -> finish()
            }
            )
            builder.setNegativeButton("No", DialogInterface.OnClickListener{
                    dialog, id -> dialog.cancel()
            }
            )

            builder.show()
        }
    }
}





