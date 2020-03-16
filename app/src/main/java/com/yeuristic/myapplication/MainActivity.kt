package com.yeuristic.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_to_dynamic_activity.setOnClickListener {
            Intent().setClassName(
                BuildConfig.APPLICATION_ID,
                "com.yeuristic.dynamicfeature.DynamicMainActivity"
            ).let {
                startActivity(it)
            }
        }
    }
}
