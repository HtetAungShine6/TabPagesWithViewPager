package com.example.mosquito.android

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_1.*


class Fragment1 : Fragment(),View.OnClickListener{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_1, container, false)
        val btn1: Button = view.findViewById(R.id.button1)
        btn1.setOnClickListener(this)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button1 -> {
                textView1.setText(editText1.getText())
            }
            else -> {
            }
        }
    }

}