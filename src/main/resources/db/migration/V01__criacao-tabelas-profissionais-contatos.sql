CREATE TABLE IF NOT EXISTS profissionais (
    id int4 not null primary key generated by default as identity,
    nome varchar not null,
    cargo varchar(20) not null,
    nascimento date not null,
    created_date timestamp not null
);

CREATE TABLE IF NOT EXISTS contatos (
    id int4 not null primary key generated by default as identity,
    nome varchar not null,
    contato varchar not null,
    created_date timestamp not null,
    profissional int4 not null,
    constraint profissional_fk foreign key (profissional) references public.profissionais(id)
);