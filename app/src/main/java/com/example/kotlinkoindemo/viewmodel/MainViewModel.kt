package com.example.kotlinkoindemo.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kotlinkoindemo.repository.Repository

/**
 * Created by gauravgoel on 14/June/2020
 */
class MainViewModel(private var remoteRepository: Repository): ViewModel() {

    fun getName(): String {
        return remoteRepository.getName()
    }
}