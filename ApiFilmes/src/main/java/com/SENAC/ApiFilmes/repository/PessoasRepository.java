package com.SENAC.ApiFilmes.repository;

import com.SENAC.ApiFilmes.entity.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, Integer> {
}
