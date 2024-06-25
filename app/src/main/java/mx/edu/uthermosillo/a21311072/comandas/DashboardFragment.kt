package mx.edu.uthermosillo.a21311072.comandas.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import mx.edu.uthermosillo.a21311072.comandas.R
import mx.edu.uthermosillo.a21311072.comandas.data.models.Item
import mx.edu.uthermosillo.a21311072.comandas.databinding.FragmentDashboardBinding
import mx.edu.uthermosillo.a21311072.comandas.ui.adapters.DashboardAdapter
import mx.edu.uthermosillo.a21311072.comandas.ui.views.activities.AuthActivity

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: DashboardAdapter
    private lateinit var itemList: MutableList<Item>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.buttonLogout.setOnClickListener {
//            FirebaseAuth.getInstance().signOut()
//            Toast.makeText(requireContext(), "Logged out successfully", Toast.LENGTH_SHORT).show()
//            val intent = Intent(activity, AuthActivity::class.java)
//            startActivity(intent)
//            requireActivity().finish()
//        }

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(context)

        itemList = mutableListOf(
            Item(type = Item.TYPE_COMMAND, icon = R.drawable.icon_compras, text = "Compras"),
            Item(type = Item.TYPE_COMMAND, icon = R.drawable.icon_saldos, text = "Saldos"),
            Item(type = Item.TYPE_COMMAND, icon = R.drawable.icon_pagos, text = "Pagos")
        )

        val user: FirebaseUser? = FirebaseAuth.getInstance().currentUser
        user?.let {
            val userItem = Item(
                type = Item.TYPE_USER_INFO,
                userName = it.displayName,
                userEmail = it.email,
                userPhotoUrl = it.photoUrl.toString()
            )
            Log.d("DashboardFragment", "User Photo URL: ${it.photoUrl.toString()}") // Añadir log para la URL de la foto
            itemList.add(userItem) // Agregar el elemento de usuario al final de la lista
        }

        adapter = DashboardAdapter(requireContext(), itemList)
        binding.recyclerView.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
