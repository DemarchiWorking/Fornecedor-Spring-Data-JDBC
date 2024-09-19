package com.example.fornecedores.repository;

import com.example.fornecedores.model.Fornecedor;
import org.springframework.data.repository.CrudRepository;

public interface FornecedorRepository extends CrudRepository<Fornecedor, Long> {
}