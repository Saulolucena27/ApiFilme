package com.SENAC.ApiFilmes.repository;

import com.SENAC.ApiFilmes.entity.FilmeCRUD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeCRUD, Long> {

}

