package br.com.gerenciador.dev.utils

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.stereotype.Component

@Component
class JWTUtils {

    private val chaveSeguranca = "MinhaChaveDeSegurancaKoltinNaoCompartilhar"

    fun gerarToken(idUsuario: String) : String{
        return Jwts.builder()  //construa
            .setSubject(idUsuario) //com o id de usuari
            .signWith(SignatureAlgorithm.HS512, chaveSeguranca.toByteArray()) // com o hash e chave
            .compact() // compacta tudo em uma string

    }
}