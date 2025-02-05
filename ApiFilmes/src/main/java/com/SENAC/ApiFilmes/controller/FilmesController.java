package com.SENAC.ApiFilmes.controller;

import com.SENAC.ApiFilmes.entity.FilmeCRUD;
import com.SENAC.ApiFilmes.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/filmes")
public class FilmesController {
    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<FilmeCRUD> listarTodos() {
        return filmeService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<FilmeCRUD> buscarPorId(@PathVariable Long id) {
        return filmeService.buscarPorId(id);
    }

    @PostMapping
    public FilmeCRUD salvar(@RequestBody FilmeCRUD filme) {
        return filmeService.salvar(filme);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        filmeService.deletar(id);
    }
}
