package com.ifpr.androidapptemplate.baseclasses



data class Item(
    var endereco: String? = null,
    var nome: String? = null,
    var objetivo: String? = null,
    var descricao: String? = null,
    var prazo: String? = null,
    var meta: String? = null,
    var categoria: String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null


)



