package com.example.a20211213

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.a20211213.databinding.ActivitySecondBinding

data class Content(val write: String?)
//데이터를 넣을 배열. 클래스 안 말고 이 위에 해줘야 창 왓다갓다해도 유지가됨
var contentArrayList = ArrayList<Content>()


class SecondActivity : AppCompatActivity(){


    private lateinit var customAdapter: CustomAdapter
    lateinit var binding:ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        //데이터를 받아오기, 스트링형으로 저장하기
        var setdata : String? = intent.getStringExtra("data")
        contentArrayList.add(Content(write = setdata))

        customAdapter= CustomAdapter(this,contentArrayList)
        binding.listviewMain.adapter=customAdapter

        binding.btnWrite.setOnClickListener{

            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        //삭제버튼 누르면 삭제하고, 새로고침하기
        binding.btnUpdate.setOnClickListener{

            contentArrayList.removeAt(0)

            customAdapter.notifyDataSetChanged()
        }

    }
}

