package com.dicoding.rindikapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class StartAct : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val btnPemula: Button = findViewById(R.id.btn_pemula)
        val btnLanjutan: Button = findViewById(R.id.btn_lanjutan)
        btnPemula.setOnClickListener(this)
        btnLanjutan.setOnClickListener(this)

//        btnLanjutan.setEnabled(false)
    }

    override fun onClick (v: View?){
        when(v?.id){
            R.id.btn_pemula -> {
                val moveIntent = Intent(this@StartAct, LevelPemulaAct::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_lanjutan -> {
                val moveIntent = Intent(this@StartAct, LevelLanjutanAct::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
