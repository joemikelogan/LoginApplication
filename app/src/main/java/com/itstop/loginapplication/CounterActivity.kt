package com.itstop.loginapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CounterActivity : AppCompatActivity() {
    lateinit var tvCounter: TextView
    lateinit var etContact: EditText
    var counter = 0

    private val LOG_TAG: String = CounterActivity::class.java.getSimpleName()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        tvCounter = findViewById(R.id.tvCounter)
        etContact = findViewById(R.id.etContact)
        var name = intent.getStringExtra("nkey")
        tvCounter.setText(name)
    }

    override fun onStart() {
        super.onStart()
        Log.d(LOG_TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(LOG_TAG, "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d(LOG_TAG, "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(LOG_TAG, "onStop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d(LOG_TAG, "onDestroy")
    }

    fun updateCounter(view: View) {
        var currentValue = Integer.parseInt(tvCounter.text.toString())
        tvCounter.setText("" + counter++)
    }

    fun showToast(view: View) {
        var contact = etContact.text.toString()
        var intent = Intent();
        intent.putExtra("ckey", contact)
        setResult(RESULT_OK, intent)
        Log.d(LOG_TAG, "End CounterActivity")
        finish()
        //Toast.makeText(this,"" + counter++, Toast.LENGTH_SHORT).show()
    }
}