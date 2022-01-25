package com.example.a20211213

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a20211213.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    lateinit var binding:ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        binding.showTxt.text=intent.getStringExtra("data")

        binding.btnDelete.setOnClickListener{
            var intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}