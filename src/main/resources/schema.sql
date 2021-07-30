drop table user if exists;


create table user (
    id bigint auto_increment,
    create_time timestamp,
    update_time timestamp,
    first_name varchar(255),
    last_name varchar(255),
    age int,
    primary key (id)
);

