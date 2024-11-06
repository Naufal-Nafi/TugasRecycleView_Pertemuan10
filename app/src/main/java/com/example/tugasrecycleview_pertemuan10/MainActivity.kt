package com.example.tugasrecycleview_pertemuan10

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tugasrecycleview_pertemuan10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val photoList = listOf(
            Photo(R.drawable.a),
            Photo(R.drawable.b),
            Photo(R.drawable.c),
            Photo(R.drawable.d),
            Photo(R.drawable.e),
            Photo(R.drawable.f),
            Photo(R.drawable.g),
            Photo(R.drawable.h),
            Photo(R.drawable.i)
        )

        with(binding){
            rvPhoto.apply {
                val photoAdapter = PhotoAdapter(photoList)
                adapter = photoAdapter
                layoutManager = GridLayoutManager(this@MainActivity,3)
            }
        }



//        val adapter = PhotoAdapter(photoList)
//        binding.rvPhoto.adapter = adapter



    }
}