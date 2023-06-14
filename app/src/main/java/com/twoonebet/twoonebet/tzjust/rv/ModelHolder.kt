package com.twoonebet.twoonebet.tzjust.rv

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.twoonebet.twoonebet.tzjust.R
import com.twoonebet.twoonebet.tzjust.model.Model

class ModelHolder(itemView: View) : BasicHolder(itemView) {
    private val adapterRv = AdapterRv(TypeHolder.ITEM_HOLDER)

    override fun updateView(item: Any){
        item as Model
        itemView.findViewById<TextView>(R.id.titleCategory).text = item.name
        itemView.findViewById<RecyclerView>(R.id.rvCategory).adapter = adapterRv
        adapterRv.list = item.items
    }
}