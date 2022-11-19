package com.example.advanceduisampleproject

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.advanceduisampleproject.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    private var countryNames = arrayListOf("England", "America")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countryNames)
        binding.MylistView.adapter  = adapter
        countryNames.add("new element")
        binding.MylistView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(adapterView.context,"Country:${adapterView.getItemAtPosition(i)}",Toast.LENGTH_SHORT).show()
        }

    }
}