package com.warchaser.sealtest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

//KEFU153906064758568
//KEFU153906064758568
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialize()
    }

    private fun initialize(){

        mBtnCustomer.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Intent(this@MainActivity, StartCustomerActivity::class.java).apply {
                    startActivity(this)
                }
            }
        })
    }
}
