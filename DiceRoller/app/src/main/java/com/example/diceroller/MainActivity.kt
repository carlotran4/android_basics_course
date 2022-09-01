package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        val diceImage : ImageView = findViewById(R.id.imageView)

        val dice = Dice(6)

        fun rolldice() {
            val foo = dice.roll()
            val drawableResource = when(foo){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.dice_1
            }
            diceImage.setImageResource(drawableResource)
            diceImage.contentDescription = foo.toString()
        }
        rolldice()

        rollButton.setOnClickListener{
            rolldice()
        }
    }
}

class Dice(private val numSides:Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}



