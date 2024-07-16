package com.rafacfrank.hubforum.domain.postagem.topico;

import com.rafacfrank.hubforum.domain.postagem.Curso;
import jakarta.validation.constraints.NotNull;

public record DadosCriacaoTopico(@NotNull
                                 String titulo,
                                 @NotNull
                                 String mensagem,
                                 @NotNull
                                 Long idAutor,
                                 @NotNull
                                 Curso curso) {
}