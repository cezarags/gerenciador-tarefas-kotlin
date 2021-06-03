package br.com.gerenciador.dev

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GerenciadorApplication

fun main(args: Array<String>) {
	runApplication<GerenciadorApplication>(*args)
}
