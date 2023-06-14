package com.twoonebet.twoonebet.tzjust.rv

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BasicHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun updateView(item: Any)
}