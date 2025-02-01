package com.SENAC.ApiFilmes.exception;


public class PessoaNaoEncontradaException extends RuntimeException {
    public PessoaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}
