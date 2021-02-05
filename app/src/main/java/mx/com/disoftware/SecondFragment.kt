package mx.com.disoftware

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment(R.layout.fragment_second) {

    private var nombre: String? = ""
    private var edad: Int? = 0
    private val args: SecondFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nombre = args.nombre
        edad = args.edad
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textViewSecondFragment = view.findViewById<TextView>(R.id.text_view_second_fragment)
        val buttonDecondFragment = view.findViewById<Button>(R.id.button_second_fragment)
        val buttonGoSecondFragmentProductSecond = view.findViewById<Button>(R.id.button_go_second_fragment_product_second)

        textViewSecondFragment.text = "${nombre} ${edad}"

        buttonDecondFragment.setOnClickListener {
            // navegar al primer fragmento (principal, el que tiene la casita de product_second.xml)
            // Sólo requiere de agregar la felcha a donde se desea navegar de main_graph.xml al product_graph.xml
            // se navega al que esté marcado como principal (con la casita).
            findNavController().navigate(R.id.product_graph)
        }

        buttonGoSecondFragmentProductSecond.setOnClickListener {
            // Navegar directamente a un fragmento en específico (distinto al principal) de product_graph.xml
            // 1. agregarlo como propiedad en la sección de deep link  en el product_fragment.xml dentro de la navigation product_graph.xml.
            // 2. agregar el deep link en el manifest
            findNavController().navigate(Uri.parse("deeplinkejem://card"))
        }

    }

}