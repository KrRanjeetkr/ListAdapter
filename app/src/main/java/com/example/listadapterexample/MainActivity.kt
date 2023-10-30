package com.example.listadapterexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadapterexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = ProgrammingAdapter()

        val p1 = ProgrammingItem(1, "A", "GEJGU")
        val p2 = ProgrammingItem(2, "B", "HEFCG")
        val p3 = ProgrammingItem(3, "C", "IFEVFS")
        adapter.submitList(listOf(p1, p2, p3))

        binding.programmingList.layoutManager = LinearLayoutManager(this)
        binding.programmingList.setHasFixedSize(true)
        binding.programmingList.adapter = adapter

        Handler(Looper.getMainLooper()).postDelayed({
            val p3 = ProgrammingItem(3, "C", "IFEVFS")
            val p4 = ProgrammingItem(4, "D", "Android")
            val p5 = ProgrammingItem(5, "E", "Os")
            val p6 = ProgrammingItem(6, "F", "RamSiyaRam")
            adapter.submitList(listOf(p3, p4, p5, p6))
        },4000)

    }
}