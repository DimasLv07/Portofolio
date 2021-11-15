package com.dimas.aplikasi.ui.android

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load
import com.dimass.myapplication.data.android.Android

@BindingAdapter("androidTitle")
fun TextView.setTitleAndroid(data: Android?){
    data?.let {
        text = data.title
    }
}

@BindingAdapter("androidImage")
fun ImageView.setAndroidImage(data: Android){
    load(data.poster){
        crossfade(1000)
    }
}