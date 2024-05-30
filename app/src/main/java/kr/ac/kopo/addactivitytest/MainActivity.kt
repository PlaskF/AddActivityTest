package kr.ac.kopo.addactivitytest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnMain = findViewById<Button>(R.id.btnMain)
        btnMain.setOnClickListener {
            var intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}