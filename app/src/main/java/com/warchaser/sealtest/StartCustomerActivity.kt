package com.warchaser.sealtest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import io.rong.imkit.RongIM
import io.rong.imlib.model.CSCustomServiceInfo
import kotlinx.android.synthetic.main.activity_start_customer.*

class StartCustomerActivity : AppCompatActivity(){

    private var mBuilder : CSCustomServiceInfo.Builder ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_customer)

        initialize()
    }

    private fun initialize(){

        mBuilder = CSCustomServiceInfo.Builder()
        mBuilder?.province("沈阳")
        mBuilder?.city("沈阳")

        mBtnStartCustomer.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                RongIM.getInstance().startCustomerServiceChat(this@StartCustomerActivity, "KEFU153906064758568", "在线客服", mBuilder?.build())
            }
        })
    }

}