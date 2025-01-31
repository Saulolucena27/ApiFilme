package com.SENAC.ApiFilmes.controller;

import com.SENAC.ApiFilmes.entity.Pessoas;
import com.SENAC.ApiFilmes.repository.PessoasRepository;
import com.SENAC.ApiFilmes.service.PessoasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pessoas")
public class PessoasController {
    private final PessoasService pessoasService;

    public PessoasController(PessoasService pessoasService) {
        this.pessoasService = pessoasService;
    }
    @PostMapping("/adicionar")
    public ResponseEntity<Pessoas> salvarPessoas(@RequestBody Pessoas pessoas){
        return ResponseEntity.ok(pessoasService.salvarPessoas(pessoas));
    }

    @GetMapping
    public ResponseEntity<List<Pessoas>> listarPessoas(){
        return ResponseEntity.ok(pessoasService.todasPessoas());
    }
}
