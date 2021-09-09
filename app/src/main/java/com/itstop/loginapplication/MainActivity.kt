package com.itstop.loginapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var tvRes: TextView

    private val LOG_TAG = MainActivity::class.java.simpleName


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(LOG_TAG, "-------");
        Log.d(LOG_TAG, "onCreate");

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etName)
        tvRes = findViewById(R.id.tvResult)
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

    fun clickHandler(view: View) {
        startCounterActivity()
        //startDialer()
    }

    private fun startDialer() {
        var dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:9880979732"))
        startActivity(dialIntent)
    }

    private fun startCounterActivity() {
        var intent = Intent(this, CounterActivity::class.java) //explicit intent
        var name = etName.text.toString()
        //tvRes.setText(name)
        intent.putExtra("nkey", name)
        startActivityForResult(intent, 123)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, dataIntent: Intent?) {
        super.onActivityResult(requestCode, resultCode, dataIntent)
        var contact = dataIntent?.getStringExtra("ckey")
        tvRes.setText(contact)
    }

}