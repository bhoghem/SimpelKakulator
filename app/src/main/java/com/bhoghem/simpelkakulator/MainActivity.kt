package com.bhoghem.simpelkakulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListener()


    }
    private fun validate(): Boolean{
        if (edt_main1.text.isNullOrEmpty()|| edt_main2.text.isNullOrEmpty()){
            return false
        }
        return true
    }
    private fun calculatorPlus(value1: Int, value2: Int): String{
        val resultPlus = value1 + value2
        return resultPlus.toString()
    }
    private fun calculatorMinus(value1: Int, value2: Int): String{
        val resultPlus = value1 - value2
        return resultPlus.toString()
    }
    private fun calculatorMultiply(value1: Int, value2: Int): String {
        val resultPlus = value1 * value2
        return resultPlus.toString()
    }
    private fun calculatorDevide(value1: Int, value2: Int): String {
        val resultPlus = value1 / value2
        return resultPlus.toString()
    }
    private fun setupListener(){
        btn_calculator_plus.setOnClickListener {
            if (validate()) {
            val value1: Int = edt_main1.text.toString().toInt()
                val value2: Int = edt_main2.text.toString().toInt()
                tv_result.text = calculatorPlus(value1, value2)
            }
            else{ showMessage("masukan data dengan benar") }
    }
        btn_calculator_minus.setOnClickListener {
            if (validate()) {
            val value1: Int = edt_main1.text.toString().toInt()
            val value2: Int = edt_main2.text.toString().toInt()
            tv_result.text = calculatorMinus(value1, value2)
        }
        else{ showMessage("masukan data dengan benar") }
        }
        btn_calculator_multiply.setOnClickListener {
            if (validate()) {
            val value1: Int = edt_main1.text.toString().toInt()
            val value2: Int = edt_main2.text.toString().toInt()
            tv_result.text = calculatorMultiply(value1, value2)
        }
        else{ showMessage("masukan data dengan benar") }
        }
        btn_calculator_devide.setOnClickListener {
            if (validate()) {
            val value1: Int = edt_main1.text.toString().toInt()
            val value2: Int = edt_main2.text.toString().toInt()
            tv_result.text = calculatorDevide(value1, value2)
        }
        else{ showMessage("masukan data dengan benar") }
        }
    }
    private fun showMessage(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }



}


