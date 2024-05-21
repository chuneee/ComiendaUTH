package mx.edu.uthermosillo.a21311072.comandas.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class OnBoardingAdapter (list: ArrayList<Fragment>, fm: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fm, lifecycle) {

    private val fragmmentList: ArrayList<Fragment> = list

    override fun getItemCount(): Int {
        return fragmmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmmentList[position]
    }
}