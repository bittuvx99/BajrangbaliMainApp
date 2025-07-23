package com.bajrangbali.mainapp.model

data class Notice(
    val title: String = "",
    val description: String = "",
    val imageUrl: String? = null,
    val date: String = "",
    val expiryDate: String = "",
    val pinned: Boolean = false
)
