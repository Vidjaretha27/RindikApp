package com.dicoding.rindikapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMulai: Button = findViewById(R.id.mulai)
        btnMulai.setOnClickListener(this)
        val btnCara: Button = findViewById(R.id.cara)
        btnCara.setOnClickListener(this)
        val btnTentang: Button = findViewById(R.id.tentang)
        btnTentang.setOnClickListener(this)

        val btnSetting: ImageButton = findViewById(R.id.setting_btn)
        btnSetting.setOnClickListener {

            val setFrag = SettingsFrag()
            val fragment : Fragment ?= supportFragmentManager.findFragmentByTag(SettingsFrag::class.java.simpleName)
            if (fragment !is Fragment){
                supportFragmentManager.beginTransaction()
                    .add(R.id.linlay_setting, setFrag, SettingsFrag::class.java.simpleName)
                    .commit()
            }
//            btnSetting.visibility = View.GONE
        }

    }

    override fun onClick(v: View?){
        when (v?.id){
            R.id.mulai -> {
                val moveIntent = Intent(this@MainActivity, StartAct::class.java)
                startActivity(moveIntent)
            }
            R.id.cara -> {
                val moveIntent = Intent(this@MainActivity, HowAct::class.java)
                startActivity(moveIntent)
            }
            R.id.tentang ->{
                val moveIntent = Intent(this@MainActivity, AboutAct::class.java)
                startActivity(moveIntent)
            }
            R.id.setting_btn ->{
                
            }
        }
    }
}