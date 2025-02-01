package com.SENAC.ApiFilmes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExeceptionHander {
    @ExceptionHandler(PessoaNaoEncontradaException.class)
    public ResponseEntity<String> tratarPessoaNaoEncontradaException(PessoaNaoEncontradaException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
