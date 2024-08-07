package mx.edu.uthermosillo.a21311072.comandas.ui.views.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import mx.edu.uthermosillo.a21311072.comandas.R
import mx.edu.uthermosillo.a21311072.comandas.databinding.FragmentSecondBinding
import mx.edu.uthermosillo.a21311072.comandas.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_third, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.onBoardingViewPager)
        binding.buttonNext3.setOnClickListener {
            viewPager?.currentItem=3
        }
        return view
    }

}