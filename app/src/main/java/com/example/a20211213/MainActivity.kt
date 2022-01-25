package com.example.a20211213

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a20211213.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)



        binding.btnMain.setOnClickListener{
            var intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("data",binding.editMain.text.toString())
            startActivity(intent)
        }


    }
}