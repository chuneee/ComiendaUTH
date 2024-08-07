package mx.edu.uthermosillo.a21311072.comandas.ui.views.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import mx.edu.uthermosillo.a21311072.comandas.R
import mx.edu.uthermosillo.a21311072.comandas.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_second, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.onBoardingViewPager)
        binding.buttonNext2.setOnClickListener {
            viewPager?.currentItem=2
        }
        return view
    }

}