package com.twoonebet.twoonebet.tzjust.rv

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterRv(private val viewTypeHolder: TypeHolder): RecyclerView.Adapter<BasicHolder>() {
    var list: List<Any> = mutableListOf()
        set(newValue) {
            field = newValue
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicHolder {
        return HolderFactory.createHolder(parent, viewTypeHolder)
    }

    override fun onBindViewHolder(holder: BasicHolder, position: Int) {
        holder.updateView(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}