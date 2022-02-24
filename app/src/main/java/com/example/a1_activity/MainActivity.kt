package com.example.a1_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a1_activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            //binding.txtShow.setText( "Hello" + binding.edtName.text)
            binding.txtShow.text = "Hello" + binding.edtName.text
        }

    }
}