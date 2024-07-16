package com.rafacfrank.hubforum.domain.autor;


public record DadosAutor(
        Long id,
        String nome) {

    public DadosAutor(Autor autor) {
        this(autor.getId(), autor.getNome());
    }

}