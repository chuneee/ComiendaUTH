package mx.edu.uthermosillo.a21311072.comandas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import mx.edu.uthermosillo.a21311072.comandas.databinding.FragmentInitBinding
import mx.edu.uthermosillo.a21311072.comandas.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.signin.setOnClickListener {
            Toast.makeText(context, "Hola ssoy binding", Toast.LENGTH_LONG).show()
        }

        return binding.root
    }
}