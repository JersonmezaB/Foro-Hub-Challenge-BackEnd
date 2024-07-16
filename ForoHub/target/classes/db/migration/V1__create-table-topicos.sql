create table topicos(

    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(300) not null,
    fechaCreación datetime not null,
    status bool not null,
    autor varchar(100) not null,
    curso varchar(100) not null,

    primary key(id)

);