package com.rafacfrank.hubforum.domain.autor;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroAutor(@NotBlank
                                 String nome) {
}