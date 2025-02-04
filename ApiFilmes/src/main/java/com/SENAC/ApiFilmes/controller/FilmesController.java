package com.SENAC.ApiFilmes.controller;

import com.SENAC.ApiFilmes.entity.Filmes;
import com.SENAC.ApiFilmes.exception.FilmeInvalidoException;
import com.SENAC.ApiFilmes.service.FilmesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/filmes")
public class FilmesController {

    private final FilmesService filmesService;

    public FilmesController(FilmesService filmesService) {
        this.filmesService = filmesService;
    }

    @GetMapping
    public ResponseEntity<List<Filmes>> todosFilmes() {
        return new ResponseEntity<>(filmesService.todosFilmes(), HttpStatus.OK);
    }

    @PostMapping("/filmes")
    public ResponseEntity<Filmes> cadastrarFilme(@RequestBody Filmes filme) {
        if (filme == null || filme.getTitle() == null || filme.getTitle().trim().isEmpty() ||
                filme.getGenres() == null || filme.getGenres().isEmpty()) {
            throw new FilmeInvalidoException("O filmes informado é inválido. Verifique os campos obrigatórios.");
        }

        Filmes novoFilme = filmesService.salvarFilme(filme);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoFilme);
    }

}
