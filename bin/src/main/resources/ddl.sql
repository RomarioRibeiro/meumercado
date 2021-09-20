   create table categoria (
       id integer not null auto_increment,
        descricao varchar(255),
        departamento_id integer,
        primary key (id)
    ) engine=InnoDB
 
    
    create table departamento (
       id integer not null auto_increment,
        descricao varchar(255),
        primary key (id)
    ) engine=InnoDB
 
    
    create table endereco (
       id integer not null auto_increment,
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        complemento varchar(255),
        latitude varchar(255),
        logradouro varchar(255),
        longitude varchar(255),
        numero varchar(255),
        sigla varchar(255),
        mercado_id integer,
        usuario_id integer,
        primary key (id)
    ) engine=InnoDB
 
    
    create table mercado (
       id integer not null auto_increment,
        cpf_ou_cnpj varchar(255),
        email varchar(255),
        fantasia varchar(255),
        razao_social varchar(255),
        primary key (id)
    ) engine=InnoDB
 
    
    create table pedido (
       id integer not null auto_increment,
        data_entrega date,
        hora_entrega varchar(255),
        preco_total_estimado decimal(19,2),
        status varchar(255),
        tipo_pagamento varchar(255),
        troco_para double precision not null,
        mercado_id integer,
        usuario_id integer,
        primary key (id)
    ) engine=InnoDB
 
    
    create table pedido_itens (
       preco_unitario decimal(19,2),
        quantidade integer,
        pedido_id integer not null,
        produto_id integer not null,
        primary key (pedido_id, produto_id)
    ) engine=InnoDB
 
    
    create table produto (
       id integer not null auto_increment,
        descricao varchar(255),
        imagem longblob,
        percentual_desconto decimal(19,2),
        preco decimal(19,2),
        preco_club decimal(19,2),
        promocao decimal(19,2),
        unidade_medida integer,
        categoria_id integer,
        mercado_id integer,
        primary key (id)
    ) engine=InnoDB
 
    
    create table usuario (
       id integer not null auto_increment,
        club_mercado varchar(255),
        cpf_ou_cnpj varchar(255),
        data_nascimento datetime(6),
        email varchar(255),
        endereco tinyblob,
        nome varchar(255),
        senha varchar(255),
        sexo varchar(255),
        telefone varchar(255),
        whats varchar(255),
        mercado_id integer,
        primary key (id)
    ) engine=InnoDB
 
    
    alter table categoria 
       add constraint FK4p96j3lmrc5jf8fe8o1dtma9q 
       foreign key (departamento_id) 
       references departamento (id)
 
    
    alter table endereco 
       add constraint FKbh7pl6rxjhyyxyioyoal27ayd 
       foreign key (mercado_id) 
       references mercado (id)
 
    
    alter table endereco 
       add constraint FKekdpb8k6gmp3lllla9d1qgmxk 
       foreign key (usuario_id) 
       references usuario (id)

    
    alter table pedido 
       add constraint FK7pq833jhlsq6ko3pq85a9127t 
       foreign key (mercado_id) 
       references mercado (id)
 
    
    alter table pedido 
       add constraint FK6uxomgomm93vg965o8brugt00 
       foreign key (usuario_id) 
       references usuario (id)
: 
    
    alter table pedido_itens 
       add constraint FKb5t2ga17uxph7bp32w97ssu4t 
       foreign key (pedido_id) 
       references pedido (id)
 
    
    alter table pedido_itens 
       add constraint FKg643g2v6jo93qic9tybfesskv 
       foreign key (produto_id) 
       references produto (id)
 
    
    alter table produto 
       add constraint FKopu9jggwnamfv0c8k2ri3kx0a 
       foreign key (categoria_id) 
       references categoria (id)
 
    
    alter table produto 
       add constraint FKljo50gqh7tt0ud17ps1o9uh2e 
       foreign key (mercado_id) 
       references mercado (id)
 
    
    alter table usuario 
       add constraint FKi41skw1yxqk9f8x6kd19h9hu5 
       foreign key (mercado_id) 
       references mercado (id)