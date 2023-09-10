create table users(
    id bigserial primary key not null,
    name varchar(255),
    email varchar(255),
    created_date timestamp
)