package com.example.fornecedores.repository;

import com.example.fornecedores.config.JDBCConnection;
import com.example.fornecedores.model.Fornecedor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorRepositor {

    public ResponseEntity<Fornecedor> criarFornecedor(Fornecedor fornecedor) {
        String sql = "INSERT INTO fornecedores (nome, endereco, telefone) VALUES (?, ?, ?)";
        try (Connection conn = JDBCConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {

            statement.setString(1, fornecedor.getNome());
            statement.setString(2, fornecedor.getEndereco());
            statement.setString(3, fornecedor.getTelefone());
            statement.executeUpdate();
            return ResponseEntity.ok(fornecedor);
        } catch (SQLException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null); // Return 400 Bad Request

        }
    }

}
