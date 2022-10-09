package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button_roll = (findViewById<Button>(R.id.button_roll))
        var textView1_1 = (findViewById<TextView>(R.id.textView1_1))
        var textView1_2 = (findViewById<TextView>(R.id.textView1_2))
        var textView1_3 = (findViewById<TextView>(R.id.textView1_3))
        var textView2_1 = (findViewById<TextView>(R.id.textView2_1))
        var textView2_2 = (findViewById<TextView>(R.id.textView2_2))
        var textView2_3 = (findViewById<TextView>(R.id.textView2_3))
        var textView3_1 = (findViewById<TextView>(R.id.textView3_1))
        var textView3_2 = (findViewById<TextView>(R.id.textView3_2))
        var textView3_3 = (findViewById<TextView>(R.id.textView3_3))
        button_roll.setOnClickListener{
            if (textView1_1.getText() == "1" && textView2_1.getText() == "1" && textView3_1.getText() == "1") {
                textView1_2.setText("2")
                textView1_1.setText(" ")
                textView2_2.setText("2")
                textView2_1.setText(" ")
                textView3_2.setText("2")
                textView3_1.setText(" ")
            }
            else if (textView1_2.getText() == "2" && textView2_2.getText() == "2" && textView3_2.getText() == "2") {
                textView1_3.setText("3")
                textView1_2.setText(" ")
                textView2_3.setText("3")
                textView2_2.setText(" ")
                textView3_3.setText("3")
                textView3_2.setText(" ")
            }
            else if (textView1_3.getText() == "3" && textView2_3.getText() == "3" && textView3_3.getText() == "3") {
                textView1_1.setText("1")
                textView1_3.setText(" ")
                textView2_1.setText("1")
                textView2_3.setText(" ")
                textView3_1.setText("1")
                textView3_3.setText(" ")
            }
        }
    }
}