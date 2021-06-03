package br.com.gerenciador.dev.dtos

data class LoginResponseDTO (val login: String, val email: String, val token: String = null ?: "Return default")
