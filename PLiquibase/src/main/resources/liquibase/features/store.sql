--liquibase formatted sql

--changeset sergey_prig:1 create table
create table item (
  id int not null primary key,
  name varchar(255) not null,
  description varchar(255)
);
--rollback drop table item
