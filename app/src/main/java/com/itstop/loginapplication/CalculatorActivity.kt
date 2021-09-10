package com.itstop.calculator

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class CalculatorActivity : AppCompatActivity() {

    lateinit var etInput: EditText
    lateinit var tvResult: TextView
    lateinit var calculator: Calculator

    private val LOG_TAG: String = CalculatorActivity::class.java.getSimpleName()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        tvResult = findViewById(R.id.tvResult)
        etInput = findViewById(R.id.etInput)

        calculator = Calculator(this, applicationContext)
    }



    fun clear(view: android.view.View) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "clear()...");

        //var inputValue = Integer.parseInt(etInput.text.toString())
        //var currentValue = Integer.parseInt(tvResult.text.toString())
        tvResult.setText(""+0)
        etInput.setText(""+0)
    }

    fun equals(view: android.view.View) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "equals()...");

        var currentValue = Integer.parseInt(tvResult.text.toString())
        var newValue = Integer.parseInt(etInput.text.toString())

        //tvResult.setText(""+0)
    }

    fun add(view: android.view.View) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "add()...");

        var currentValue = Integer.parseInt(tvResult.text.toString())
        var newValue = Integer.parseInt(etInput.text.toString())

        val calcResult = Calculator.add(currentValue, newValue)

        tvResult.setText("" + calcResult)
        etInput.setText("")
    }

    fun subtract(view: android.view.View) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "subtract()...");

        var currentValue = Integer.parseInt(tvResult.text.toString())
        var newValue = Integer.parseInt(etInput.text.toString())

        val calcResult = Calculator.subtract(currentValue, newValue)

        tvResult.setText("" + calcResult)
        etInput.setText("")
    }

    fun multiply(view: android.view.View) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "multiply()...");

        var currentValue = Integer.parseInt(tvResult.text.toString())
        var newValue = Integer.parseInt(etInput.text.toString())

        val calcResult = Calculator.multiply(currentValue, newValue)

        tvResult.setText("" + calcResult)
        etInput.setText("")
    }

    fun divide(view: android.view.View) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "divide()...");

        var currentValue = Integer.parseInt(tvResult.text.toString())
        var newValue = Integer.parseInt(etInput.text.toString())

        val calcResult = Calculator.divide(currentValue, newValue)

        tvResult.setText("" + calcResult)
        etInput.setText("")
    }
}