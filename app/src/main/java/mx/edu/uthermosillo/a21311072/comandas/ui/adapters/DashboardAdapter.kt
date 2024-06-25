package mx.edu.uthermosillo.a21311072.comandas.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import mx.edu.uthermosillo.a21311072.comandas.data.models.Item
import mx.edu.uthermosillo.a21311072.comandas.databinding.DashboardItemBinding

class DashboardAdapter(private val context: Context, private val itemList: List<Item>) :
        RecyclerView.Adapter<DashboardAdapter.ViewHolder>() {

        override fun getItemViewType(position: Int): Int {
                return itemList[position].type
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val binding = DashboardItemBinding.inflate(LayoutInflater.from(context), parent, false)
                return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                val item = itemList[position]

                when (item.type) {
                        Item.TYPE_USER_INFO -> {
                                holder.binding.itemIcon.visibility = View.VISIBLE
                                holder.binding.userName.visibility = View.VISIBLE
                                holder.binding.userEmail.visibility = View.VISIBLE
                                holder.binding.itemText.visibility = View.GONE

                                holder.binding.userName.text = item.userName
                                holder.binding.userEmail.text = item.userEmail
                                Glide.with(context)
                                        .load(item.userPhotoUrl)
                                        .into(holder.binding.itemIcon)
                        }
                        Item.TYPE_COMMAND -> {
                                holder.binding.itemIcon.visibility = View.VISIBLE
                                holder.binding.userName.visibility = View.GONE
                                holder.binding.userEmail.visibility = View.GONE
                                holder.binding.itemText.visibility = View.VISIBLE

                                holder.binding.itemIcon.setImageResource(item.icon!!)
                                holder.binding.itemText.text = item.text
                        }
                }
        }

        override fun getItemCount(): Int {
                return itemList.size
        }

        class ViewHolder(val binding: DashboardItemBinding) : RecyclerView.ViewHolder(binding.root)
}
