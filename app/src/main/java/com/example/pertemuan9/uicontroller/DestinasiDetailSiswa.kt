package com.example.pertemuan9.uicontroller

import com.example.pertemuan9.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "item_details"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}