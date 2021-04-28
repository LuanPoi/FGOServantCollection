package com.example.fgoservantcollection.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fgoservantcollection.R

class EntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)

        Log.d("ScreenSizeInDP", "Width: " + getResources().getConfiguration().screenWidthDp.toString())
        Log.d("ScreenSizeInDP", "Height: " + getResources().getConfiguration().screenHeightDp.toString())
        Log.d("ScreenSizeInDP", "Density Dpi: " + getResources().getConfiguration().densityDpi.toString())

        val intent: Intent = Intent(this@EntryActivity, MainActivity::class.java)
        startActivity(intent)
    }
}