package mx.edu.potros.practica5_233326

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.btn_start)

        button.setOnClickListener {
            var intent: Intent=Intent(this,
                RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}