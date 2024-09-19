package com.example.fornecedores.service;

import com.example.fornecedores.model.Fornecedor;
import com.example.fornecedores.repository.FornecedorRepositor;
import com.example.fornecedores.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;
    private FornecedorRepositor fornecedorRepositor;

    public ResponseEntity<Fornecedor> criarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepositor.criarFornecedor(fornecedor);
    }

    public Iterable<Fornecedor> listarFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor atualizarFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public void excluirFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }
}

