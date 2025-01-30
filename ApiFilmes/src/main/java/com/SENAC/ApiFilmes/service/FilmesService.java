package com.SENAC.ApiFilmes.service;

import com.SENAC.ApiFilmes.entity.Filmes;
import com.SENAC.ApiFilmes.repository.FilmesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesService {
    private final FilmesRepository filmesRepository;

    public FilmesService(FilmesRepository filmesRepository) {
        this.filmesRepository = filmesRepository;
    }

    public List<Filmes> todosFilmes(){
        return filmesRepository.findAll();
    }
}
