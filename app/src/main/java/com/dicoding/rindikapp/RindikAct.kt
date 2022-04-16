package com.dicoding.rindikapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class RindikAct : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rindik)

        val btnBantuan : Button = findViewById(R.id.help_btn)
        btnBantuan.setOnClickListener(this)
    }

    override fun onClick(v: View?){
        when (v?.id){
            R.id.help_btn -> {
                val moveIntent = Intent(this@RindikAct, HowAct::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
