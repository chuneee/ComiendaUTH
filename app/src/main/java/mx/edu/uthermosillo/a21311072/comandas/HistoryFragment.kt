import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import mx.edu.uthermosillo.a21311072.comandas.R
import mx.edu.uthermosillo.a21311072.comandas.Usuario
import mx.edu.uthermosillo.a21311072.comandas.ui.adapters.UsuarioAdapter

class HistoryFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var usuarioAdapter: UsuarioAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.rvUsuarios)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Simulamos algunos datos
        val usuarios = listOf(
            Usuario(iniciales = "LA", nombre = "Luis Acuña"),
            Usuario(iniciales = "AA", nombre = "Aldo Avalos")
        )

        usuarioAdapter = UsuarioAdapter(usuarios)
        recyclerView.adapter = usuarioAdapter
    }
}
