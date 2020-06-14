package com.example.kotlinkoindemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinkoindemo.R
import com.example.kotlinkoindemo.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDemo.text = mainViewModel.getName()
    }
}