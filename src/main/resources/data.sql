INSERT INTO cargo
    (nome)
VALUES
    ('ADMINISTRADOR'),
    ('USER');

-- a senha é: 'senha'
INSERT INTO usuario
    (cargo_id, nome, apelido, email, senha, ativo)
VALUES
    (
        (SELECT id FROM cargo WHERE nome = 'ADMINISTRADOR'),
        'ADMINISTRADOR',
        'admin',
        'administrador@email.com',
        '$2a$10$L9CP7W3JIKhVz5J/WiMP/.LEqvAMC915HxxON98MFtyJzXbIEnajS',
        1
    );
