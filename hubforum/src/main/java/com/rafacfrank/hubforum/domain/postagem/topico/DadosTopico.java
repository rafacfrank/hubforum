package com.rafacfrank.hubforum.domain.postagem.topico;

import com.rafacfrank.hubforum.domain.autor.DadosAutor;
import com.rafacfrank.hubforum.domain.postagem.Curso;

import java.time.LocalDateTime;

public record DadosTopico(Long id,
                          String titulo,
                          String mensagem,
                          LocalDateTime data,
                          Boolean duvidaResolvida,
                          DadosAutor autor,
                          Curso curso) {
}