package mx.com.disoftware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SegundoActivity : AppCompatActivity() {

    private var parametro: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundo)

        val textViewSegundoActivity = findViewById<TextView>(R.id.textViewSegundoActivity)
        val buttonSegundaActivity = findViewById<Button>(R.id.buttonSegundaActivity)

        // Recibiendo parámetros.
        intent.extras?.let {
            parametro = it.getString("cadena")
        }

        textViewSegundoActivity.text = parametro

        buttonSegundaActivity.setOnClickListener {
            /**
             * Mata esta actividad al dar click, para que se elemine del Back stack (pila de activities)
             */
            finish()
            // Nota: Si en ligar de usar finish se usa otro intent, en lugar de volver a la activity precedente se crearía otra y se agregaría a la pila.
        }

    }
}