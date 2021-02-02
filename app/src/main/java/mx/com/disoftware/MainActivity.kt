package mx.com.disoftware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewMainActivity = findViewById<TextView>(R.id.textViewMainActivity)
        val buttonMainActivity = findViewById<Button>(R.id.buttonMainActivity)

        buttonMainActivity.setOnClickListener {
            val intent = Intent(this, SegundoActivity::class.java)
            // mandando un valor al prozimo activity
            intent.putExtra("cadena", "vengo de $this")
            startActivity(intent)
        }

    }
}