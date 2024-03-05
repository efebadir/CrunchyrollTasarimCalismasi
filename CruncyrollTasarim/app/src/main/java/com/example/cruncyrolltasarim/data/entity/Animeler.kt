package com.example.cruncyrolltasarim.data.entity

import java.io.Serializable

data class Animeler(var id:Int,
                    var ad:String,
                    var resim:String,
                    var aciklama:String,
                    var episode:String) : Serializable {
}