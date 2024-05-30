package kr.ac.kopo.addactivitytest

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        var btnThird = findViewById<Button>(R.id.btnThird)
        btnThird.setOnClickListener {
            finish()
        }
    }
}