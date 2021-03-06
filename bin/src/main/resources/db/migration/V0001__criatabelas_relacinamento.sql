create table categoria (
       id integer not null auto_increment,
        descricao varchar(255),
        departamento_id integer,
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
 
    
    create table departamento (
       id integer not null auto_increment,
        descricao varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
 
    
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
    ) engine=InnoDB default charset=utf8MB4;
 
    
    create table mercado (
       id integer not null auto_increment,
        cpf_ou_cnpj varchar(255),
        email varchar(255),
        fantasia varchar(255),
        razao_social varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
 
    
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
    ) engine=InnoDB default charset=utf8MB4;
 
    
    create table pedido_itens (
       preco_unitario decimal(19,2),
        quantidade integer,
        pedido_id integer not null,
        produto_id integer not null,
        primary key (pedido_id, produto_id)
    ) engine=InnoDB default charset=utf8MB4;
 
    
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
    ) engine=InnoDB default charset=utf8MB4;
 
    
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
    ) engine=InnoDB default charset=utf8MB4;
 
    
    alter table categoria 
       add constraint FKDepartamento_Categoria 
       foreign key (departamento_id) 
       references departamento (id);
 
    
    alter table endereco 
       add constraint FKMercado_Endereco 
       foreign key (mercado_id) 
       references mercado (id);
 
    
    alter table endereco 
       add constraint FKUsuario_endereco
       foreign key (usuario_id) 
       references usuario (id);
       
       
         alter table pedido 
       add constraint FK7Mercado_Pedido 
       foreign key (mercado_id) 
       references mercado (id);

    alter table pedido 
       add constraint FK6Usuario_Pedido
       foreign key (usuario_id) 
       references usuario (id);

    alter table pedido_itens 
       add constraint FKbPedido_Itens_pedido 
       foreign key (pedido_id) 
       references pedido (id);

    alter table pedido_itens 
       add constraint FKProduto_itens_pedido 
       foreign key (produto_id) 
       references produto (id);

    alter table produto 
       add constraint FKCategoria_Produto
       foreign key (categoria_id) 
       references categoria (id);

    alter table produto 
       add constraint FKMercado_Produto 
       foreign key (mercado_id) 
       references mercado (id);
       
        
    alter table usuario 
       add constraint FKMercado_usuario 
       foreign key (mercado_id) 
       references mercado (id);
    