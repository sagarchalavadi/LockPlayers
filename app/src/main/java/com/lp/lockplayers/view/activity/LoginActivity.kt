package com.lp.lockplayers.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.lp.lockplayers.R
import com.lp.lockplayers.viewmodel.LoginViewModel

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<com.lp.lockplayers.databinding.LoginActivityBinding>(
            this, R.layout.activity_login).apply {
            lifecycleOwner = this@LoginActivity
        }
        ViewModelProviders.of(this).get(LoginViewModel::class.java).apply {
            lifecycle.addObserver(this)
            binding.viewModel = this
        }
    }
}