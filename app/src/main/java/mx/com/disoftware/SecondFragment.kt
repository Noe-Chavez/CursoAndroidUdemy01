package mx.com.disoftware

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
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
        textViewSecondFragment.text = "${nombre} ${edad}"
    }

}