package com.twoonebet.twoonebet.tzjust.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import com.twoonebet.twoonebet.tzjust.R

object HolderFactory {

    fun createHolder(parent: ViewGroup, viewType: TypeHolder): BasicHolder{
        return when (viewType) {
            TypeHolder.MODEL_HOLDER -> ModelHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_vh_category, parent, false))
            TypeHolder.ITEM_HOLDER -> ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_vh_item, parent, false))
        }
    }

}