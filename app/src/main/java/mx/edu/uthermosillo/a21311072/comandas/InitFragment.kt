package mx.edu.uthermosillo.a21311072.comandas

import HistoryFragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mx.edu.uthermosillo.a21311072.comandas.ui.adapters.OnBoardingAdapter
import mx.edu.uthermosillo.a21311072.comandas.databinding.FragmentInitBinding
import mx.edu.uthermosillo.a21311072.comandas.ui.views.onboarding.FirstFragment
import mx.edu.uthermosillo.a21311072.comandas.ui.views.onboarding.SecondFragment
import mx.edu.uthermosillo.a21311072.comandas.ui.views.onboarding.ThirdFragment

class InitFragment : Fragment() {

    private var _binding: FragmentInitBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInitBinding.inflate(inflater, container, false)
        val view = binding.root

        val viewPager2 = binding.onBoardingViewPager

        val fragmentList = arrayListOf<Fragment>(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment(),
            LoginFragment(),
        )

        val adapter = OnBoardingAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter

        return view
    }

}
