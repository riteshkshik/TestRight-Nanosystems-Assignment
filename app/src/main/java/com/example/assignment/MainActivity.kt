package com.example.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    var flag = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.r1c1?.setOnClickListener {
            if (flag) makeInvisible()
            else makeVisible()
        }
        binding?.r1c2?.setOnClickListener {
            if (flag) makeInvisible()
            else makeVisible()
        }
        binding?.r1c3?.setOnClickListener {
            if (flag) makeInvisible()
            else makeVisible()
        }
        binding?.r1c4?.setOnClickListener {
            if (flag) makeInvisible()
            else makeVisible()
        }
        binding?.r1c5?.setOnClickListener {
            if (flag) makeInvisible()
            else makeVisible()
        }
        binding?.r2c1?.setOnClickListener {
            if (flag) makeInvisible()
            else makeVisible()
        }
        binding?.r2c2?.setOnClickListener {
            if (flag) makeInvisible()
            else makeVisible()
        }
        binding?.r2c3?.setOnClickListener {
            if (flag) makeInvisible()
            else makeVisible()
        }
        binding?.r2c4?.setOnClickListener {
            if (flag) makeInvisible()
            else makeVisible()
        }
        binding?.r2c5?.setOnClickListener {
            if (flag) makeInvisible()
            else makeVisible()
        }
        binding?.okayLower?.setOnClickListener {
            applyIdChangesLower()
        }
        binding?.okayUpper?.setOnClickListener {
            applyIdChangesUpper()
        }
    }

    fun applyIdChangesUpper(){
        val changedId = binding?.editTextUpper?.text.toString()
        if (changedId.isNotEmpty()){
            binding?.sampleIdUpper?.text = changedId
            binding?.sampleIdLower?.text = changedId
            binding?.editTextUpper?.setText("")
        }
    }
    fun applyIdChangesLower(){
        val changedId = binding?.editTextLower?.text.toString()
        if (changedId.isNotEmpty()){
            binding?.sampleIdLower?.text = changedId
            binding?.sampleIdUpper?.text = changedId
            binding?.editTextLower?.setText("")
        }
    }

    fun makeVisible(){
        binding?.lowerAlertBox?.visibility = View.VISIBLE
        binding?.upperAlertBox?.visibility = View.VISIBLE
        binding?.triangleLower?.visibility = View.VISIBLE
        binding?.triangleUpper?.visibility = View.VISIBLE
        flag = true
    }
    fun makeInvisible(){
        binding?.lowerAlertBox?.visibility = View.GONE
        binding?.upperAlertBox?.visibility = View.GONE
        binding?.triangleLower?.visibility = View.INVISIBLE
        binding?.triangleUpper?.visibility = View.INVISIBLE
        flag = false
    }

}