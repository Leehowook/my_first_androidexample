package com.example.a20211213

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.a20211213.databinding.ListviewItemBinding

class CustomAdapter(context: Context, private val contentArrayList:ArrayList<Content>) : BaseAdapter(){

    //앱과 OS사이에 중재자 역할하는 코드
    private val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    lateinit var binding:ListviewItemBinding

    override fun getCount(): Int = contentArrayList.size

    override fun getItem(p0: Int): Any = contentArrayList[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {

        binding = ListviewItemBinding.inflate(inflater,p2,false)
        binding.txtSecond.text=contentArrayList[position].write

        return binding.root
    }

}