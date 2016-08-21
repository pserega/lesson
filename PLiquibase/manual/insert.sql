--liquibase formatted sql

--changeset User3:1 
insert into item values (4,'sergey','prigozhiy')
--rollback delete from item where id = 4;