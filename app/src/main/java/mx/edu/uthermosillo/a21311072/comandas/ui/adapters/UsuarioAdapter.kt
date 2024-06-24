package mx.edu.uthermosillo.a21311072.comandas.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import mx.edu.uthermosillo.a21311072.comandas.R
import mx.edu.uthermosillo.a21311072.comandas.Usuario

class UsuarioAdapter(private val usuarios: List<Usuario>) :
        RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder>() {

        class UsuarioViewHolder(view: View) : RecyclerView.ViewHolder(view) {
                val inicialesTextView: TextView = view.findViewById(R.id.tvIniciales)
                val nombreTextView: TextView = view.findViewById(R.id.tvNombre)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_usuario, parent, false)
                return UsuarioViewHolder(view)
        }

        override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
                val usuario = usuarios[position]
                holder.inicialesTextView.text = usuario.iniciales
                holder.nombreTextView.text = usuario.nombre
        }

        override fun getItemCount() = usuarios.size
}
