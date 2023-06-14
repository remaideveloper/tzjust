package com.twoonebet.twoonebet.tzjust

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.twoonebet.twoonebet.tzjust.databinding.ActivityMainBinding
import com.twoonebet.twoonebet.tzjust.rep.Repository
import com.twoonebet.twoonebet.tzjust.rv.AdapterRv
import com.twoonebet.twoonebet.tzjust.rv.TypeHolder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterRv = AdapterRv(TypeHolder.MODEL_HOLDER)
        binding.rv.adapter = adapterRv
        val rep = Repository()
        CoroutineScope(Dispatchers.Main).launch {
            val list = rep.load()
            adapterRv.list = list
        }

    }
}