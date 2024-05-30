package kr.ac.kopo.addactivitytest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var rg : RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        rg = findViewById<RadioGroup>(R.id.rg)
        rg.check(R.id.radioSecond)

        var btnMain = findViewById<Button>(R.id.btnMain)
        var intent = Intent(this@MainActivity, SecondActivity::class.java)

        rg.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId) {
                R.id.radioSecond -> intent = Intent(this@MainActivity, SecondActivity::class.java)
                R.id.radioThird -> intent = Intent(this@MainActivity, ThirdActivity::class.java)
            }
        }
        btnMain.setOnClickListener {
            startActivity(intent)
        }
    }
}