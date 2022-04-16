package com.dicoding.rindikapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LevelPemulaAct : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_levelpemula)

        val btnlevel1 : Button = findViewById(R.id.btn_pemula1)
        btnlevel1.setOnClickListener(this)
        val btnlevel2 : Button = findViewById(R.id.btn_pemula2)
        btnlevel2.setOnClickListener(this)
        val btnlevel3 : Button = findViewById(R.id.btn_pemula3)
        btnlevel3.setOnClickListener(this)
        val btnlevel4 : Button = findViewById(R.id.btn_pemula4)
        btnlevel4.setOnClickListener(this)
        val btnlevel5 : Button = findViewById(R.id.btn_pemula5)
        btnlevel5.setOnClickListener(this)
    }

    override fun onClick (v: View?){
        when(v?.id){
            R.id.btn_pemula1 -> {
                val moveIntent = Intent(this@LevelPemulaAct, RindikAct::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_pemula2 -> {
                val moveIntent = Intent(this@LevelPemulaAct, RindikAct::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_pemula3 -> {
                val moveIntent = Intent(this@LevelPemulaAct, RindikAct::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_pemula4 -> {
                val moveIntent = Intent(this@LevelPemulaAct, RindikAct::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_pemula5 -> {
                val moveIntent = Intent(this@LevelPemulaAct, RindikAct::class.java)
                startActivity(moveIntent)
            }
        }
    }
}