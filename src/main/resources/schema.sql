CREATE TABLE fornecedores(
                              id INT PRIMARY KEY,
                              nome VARCHAR(100),
                              endereco VARCHAR(255),
                              telefone VARCHAR(20)
);
INSERT INTO fornecedores (id, nome, endereco, telefone) VALUES (1, 'Fornecedor Exemplo', 'Endereço Exemplo', '123456789');