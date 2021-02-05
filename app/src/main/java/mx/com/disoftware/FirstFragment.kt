package mx.com.disoftware

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonFirstFragment = view.findViewById<Button>(R.id.button_first_fragment)

        buttonFirstFragment.setOnClickListener {
            /**
             * Safe args: ya sabe qué parámetros hay que mandar al segundo fragment y en dónde se encuentra el segundo fragment.
             */
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("Melchiah", 27)
            findNavController().navigate(action)
        }

    }
}