package mx.edu.potros.practica5_233326

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val button: Button = findViewById(R.id.btn_sign)

        button.setOnClickListener {
            var intent: Intent=Intent(this,
                MenuActivity::class.java)
            startActivity(intent)
        }
    }
}