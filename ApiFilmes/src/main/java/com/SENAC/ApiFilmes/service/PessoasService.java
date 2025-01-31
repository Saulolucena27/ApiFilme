package com.SENAC.ApiFilmes.service;

import com.SENAC.ApiFilmes.entity.Pessoas;
import com.SENAC.ApiFilmes.repository.PessoasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PessoasService {
    private final PessoasRepository pessoasRepository;

    public PessoasService(PessoasRepository pessoasRepository) {
        this.pessoasRepository = pessoasRepository;
    }

    public Pessoas SalvarPessoas(Pessoas pessoa) {
        return pessoasRepository.save(pessoa);
    }

    public List<Pessoas> todasPessoas() {
        return pessoasRepository.findAll();
    }
}
