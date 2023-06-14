package com.twoonebet.twoonebet.tzjust.rep

import com.twoonebet.twoonebet.tzjust.model.Item
import com.twoonebet.twoonebet.tzjust.model.Model
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository {

    suspend fun load(): List<Model> {
        return withContext(Dispatchers.IO) {
            val list = mutableListOf<Model>()
            list.add(Model("Category 0", listOf(
                Item(0, false),
                Item(0, false),
                Item(0, true),
                Item(0, false),
                Item(0, true),
                Item(0, false),
            )))
            list.add(Model("Category 1", listOf(
                Item(0, false),
                Item(0, false),
                Item(0, true),
            )))
            list.add(Model("Category 2", listOf(
                Item(0, false),
                Item(0, false),
                Item(0, false),
                Item(0, false),
                Item(0, false),
                Item(0, false),
            )))
            list.add(Model("Category 3", listOf(
                Item(0, false),
                Item(0, false),
                Item(0, true),
                Item(0, false),
                Item(0, true),
                Item(0, false),
            )))
            list.add(Model("Category 4", listOf(
                Item(0, false),
            )))
            list.add(Model("Category 5", listOf(
                Item(0, false),
                Item(0, true),
            )))
            list.add(Model("Category 6", listOf(
                Item(0, false),
                Item(0, false),
                Item(0, true),
                Item(0, false),
                Item(0, true),
                Item(0, false),
            )))
            list.toList()
        }
    }
}