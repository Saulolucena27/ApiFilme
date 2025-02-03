package com.SENAC.ApiFilmes.exception;

public class FilmeInvalidoException extends RuntimeException {
    public FilmeInvalidoException(String mensagem) {
        super(mensagem);
    }
}
