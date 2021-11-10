package com.example.setimageurl

import android.widget.ImageView
import com.squareup.picasso.Picasso

object SetImageUrl {

    fun setImageUrl(url:String,imageView: ImageView){
        Picasso.get().load(url).into(imageView)
    }
}