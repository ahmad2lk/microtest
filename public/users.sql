create table users
(
    id       bigint       not null
        primary key,
    email    varchar(255),
    lastname varchar(255),
    password varchar(255),
    role     varchar(255)
        constraint users_role_check
            check ((role)::text = ANY ((ARRAY ['USER'::character varying, 'ADMIN'::character varying])::text[])),
    username varchar(255) not null
);

alter table users
    owner to postgres;

