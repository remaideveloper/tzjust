package com.twoonebet.twoonebet.tzjust.rv

import android.util.Log
import android.view.View
import android.widget.ImageView
import com.twoonebet.twoonebet.tzjust.R
import com.twoonebet.twoonebet.tzjust.model.Item

class ItemHolder(itemView: View) : BasicHolder(itemView) {

    override fun updateView(item: Any) {
        Log.e("FDFD", "fddfdf")
        item as Item
        itemView.findViewById<ImageView>(R.id.img).setImageResource(R.drawable.person)
        val res = if (item.isPremium) R.drawable.icon else R.drawable.youtube
        itemView.findViewById<ImageView>(R.id.premiumImg).setImageResource(res)
    }
}