package com.example.androidarchitecturemvvm.ui.gallery

import androidx.lifecycle.ViewModel
import com.example.androidarchitecturemvvm.data.UnsplashRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GalleryViewModel @Inject constructor(
    private val repository: UnsplashRepository
) : ViewModel()


