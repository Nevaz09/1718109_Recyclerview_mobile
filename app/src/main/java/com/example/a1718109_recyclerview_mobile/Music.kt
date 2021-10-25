package com.example.a1718109_recyclerview_mobile


import androidx.versionedparcelable.VersionedParcelize

@VersionedParcelize
data class Music(
    val imgMusic: Int,
    val nameMusic: String,
    val descMusic: String
)