package br.com.mdr.core.model

import kotlin.time.Instant

data class User(
    val id: String,
    val email: String,
    val createdAt: Instant
)

