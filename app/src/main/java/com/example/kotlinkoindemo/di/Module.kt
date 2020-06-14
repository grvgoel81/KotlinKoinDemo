package com.example.kotlinkoindemo.di

import com.example.kotlinkoindemo.repository.Repository
import com.example.kotlinkoindemo.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by gauravgoel on 14/June/2020
 */
val mainModule = module {
    single {
        Repository()
    }
    viewModel {
        MainViewModel(get())
    }
}