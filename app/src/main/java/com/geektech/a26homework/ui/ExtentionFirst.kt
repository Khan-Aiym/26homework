package com.geektech.a26homework.ui

import android.widget.ImageView

fun ImageView.loadImage(url: String?) {
    Glide.with(this.context).load(url).into(this)
}