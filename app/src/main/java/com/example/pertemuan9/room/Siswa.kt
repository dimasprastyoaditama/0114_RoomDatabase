package com.example.pertemuan9.room

import androidx.room.Entity

@Entity(tableName = "tblSiswa")
data class Siswa(
    val id: Int = 0,
    val nama: String,
    val alamat: String,
    val telpon: String
)