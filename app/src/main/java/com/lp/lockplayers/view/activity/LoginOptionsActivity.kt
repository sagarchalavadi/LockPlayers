package com.lp.lockplayers.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.lp.lockplayers.R

class LoginOptionsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<com.lp.lockplayers.databinding.LoginOptionsActivityBinding>(
            this, R.layout.activity_login_options)
    }
}