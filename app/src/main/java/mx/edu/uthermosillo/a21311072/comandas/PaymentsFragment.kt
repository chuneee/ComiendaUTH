package mx.edu.uthermosillo.a21311072.comandas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mx.edu.uthermosillo.a21311072.comandas.databinding.FragmentCartBinding
import mx.edu.uthermosillo.a21311072.comandas.databinding.FragmentPaymentsBinding


class PaymentsFragment : Fragment() {


    private var _binding: FragmentPaymentsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPaymentsBinding.inflate(inflater, container, false)

        return binding.root
    }

}