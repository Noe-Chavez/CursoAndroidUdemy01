package mx.com.disoftware

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonFirstFragment = view.findViewById<Button>(R.id.button_first_fragment)

        buttonFirstFragment.setOnClickListener {
            findNavController() // clase que controla la navegabilidad de los fragmentos.
                .navigate(R.id.action_firstFragment_to_secondFragment)// id de la navigabilidad (ver main_graph.xml)
        }

    }
}