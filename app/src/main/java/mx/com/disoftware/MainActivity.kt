package mx.com.disoftware

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textViewMainActivity: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewMainActivity = findViewById<TextView>(R.id.textViewMainActivity)
        val buttonMainActivity = findViewById<Button>(R.id.buttonMainActivity)

        buttonMainActivity.setOnClickListener {
            val intent = Intent(this, SegundoActivity::class.java)
            // mandando un valor al prozimo activity
            intent.putExtra("cadena", "vengo de $this")
            //startActivity(intent)
            startActivityForResult(intent, 1) // Para esperar que al finalizar el segundo activity, devuelva argumentos.
        }

    }

    // Para poder recibir los argumentos que regresen de la segunda actividad.
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) { // corresponde a la activity segunda, puede esperar resultados de más de un activity.
            if (resultCode == Activity.RESULT_OK) {
                val datoEsperado = data?.getStringExtra("cadenaSegundaActivity")
                textViewMainActivity.text = datoEsperado
            }
        }
    }

}