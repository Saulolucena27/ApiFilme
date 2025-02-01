package com.SENAC.ApiFilmes.service;

import com.SENAC.ApiFilmes.entity.Pessoas;
import com.SENAC.ApiFilmes.exception.PessoaNaoEncontradaException;
import com.SENAC.ApiFilmes.repository.PessoasRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PessoasService {
    private final PessoasRepository pessoasRepository;

    public PessoasService(PessoasRepository pessoasRepository) {
        this.pessoasRepository = pessoasRepository;
    }
    public Pessoas salvarPessoas(Pessoas pessoas) {
        return pessoasRepository.save(pessoas);
    }
    public List<Pessoas> todasPessoas() {
        return pessoasRepository.findAll();
    }

    public Pessoas buscarPessoaPorId(Integer id) {
        return pessoasRepository.findById(id).orElseThrow(()-> new PessoaNaoEncontradaException("Pessoa com id" + id + "não encontrada!"));
    }


}
