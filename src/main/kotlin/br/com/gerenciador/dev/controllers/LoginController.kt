package br.com.gerenciador.dev.controllers

import br.com.gerenciador.dev.dtos.ErroDTO
import br.com.gerenciador.dev.dtos.LoginRequestDTO
import br.com.gerenciador.dev.dtos.LoginResponseDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RequestMapping("api/login")
@RestController
class LoginController {

    private val LOGIN_MOCK = "ADMIN@ADMIN.COM.BR"
    private val PASSWORD_MOCK = "123"


    @PostMapping
    fun efetuarLogin(@RequestBody dto: LoginRequestDTO): ResponseEntity<Any> {
        try {
            if (dto == null || dto.login.isNullOrBlank() || dto.login.isNullOrEmpty() || dto.password.isNullOrEmpty() || dto.password.isNullOrBlank() || dto.login != LOGIN_MOCK ||
                    dto.password != PASSWORD_MOCK ){
                return ResponseEntity(
                    ErroDTO(HttpStatus.BAD_REQUEST.value(), "Parametros de entrada invalidos"),
                    HttpStatus.BAD_REQUEST
                )
            }
            //throw RuntimeException("Testando uma Excessão")
            val usuarioTeste = LoginResponseDTO("Usuario Teste", LOGIN_MOCK,)
            return ResponseEntity(usuarioTeste, HttpStatus.OK)
        } catch (e: Exception) {
            return ResponseEntity(
                ErroDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Não foi possivel efetuar o login"),
                HttpStatus.INTERNAL_SERVER_ERROR
            )
        }

    }
}

