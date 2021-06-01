package br.com.gerenciador.dev.controllers

import br.com.gerenciador.dev.dtos.ErroDTO
import br.com.gerenciador.dev.dtos.LoginDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.Exception
import java.lang.RuntimeException

@RequestMapping("api/login")
@RestController
class LoginController {

    @PostMapping
    fun efetuarLogin(@RequestBody dto : LoginDTO): ResponseEntity<Any>{
        try {
            throw RuntimeException("Testando uma Excessão")
        }catch (e: Exception){
            return ResponseEntity(ErroDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Não foi possivel efetuar o login"),
            HttpStatus.INTERNAL_SERVER_ERROR)
        }

    }
}