package com.SENAC.ApiFilmes.service;

import com.SENAC.ApiFilmes.entity.FilmeCRUD;
import com.SENAC.ApiFilmes.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    public List<FilmeCRUD> listarTodos() {
        return filmeRepository.findAll();
    }

    public Optional<FilmeCRUD> buscarPorId(Long id) {
        return filmeRepository.findById(id);
    }

    public FilmeCRUD salvar(FilmeCRUD filme) {
        return filmeRepository.save(filme);
    }

    public void deletar(Long id) {
        filmeRepository.deleteById(id);
    }
}
