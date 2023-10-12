package com.example.tugasbmi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugasbmi.ui.theme.TugasBmiTheme

class MainActivity : ComponentActivity() {
    lateinit var edTB: EditText
    lateinit var btnHitung : Button
    lateinit var tvHasil : TextView
    lateinit var rdGR : RadioGroup
    lateinit var rdbL : RadioButton
    lateinit var rdbP : RadioButton
    lateinit var selectedRadio : RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tugasbmilayout)

        edTB = findViewById(R.id.edTinggiBadan)
        btnHitung = findViewById(R.id.btnHitung)
        tvHasil = findViewById(R.id.tvHasil)
        rdGR = findViewById(R.id.rdGroup)
        rdbL = findViewById(R.id.Laki)
        rdbP = findViewById(R.id.Perempuan)

        btnHitung.setOnClickListener {
            val selected: Int = rdGR.checkedRadioButtonId
            if (selected != -1){
                selectedRadio = findViewById(selected)

                val jk : String = selectedRadio.text.toString()

                if (jk == "Laki-Laki"){
                    val hasil =
                        (edTB.text.toString().toInt() -100)-((edTB.text.toString().toInt()-100)*0.1)
                    tvHasil.text =hasil.toString()
                }else{
                    val hasil =
                        (edTB.text.toString().toInt() -100)-((edTB.text.toString().toInt()-100)*0.15)
                    tvHasil.text =hasil.toString()
                }
            }
        }
    }
}
