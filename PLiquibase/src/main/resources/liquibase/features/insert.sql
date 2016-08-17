--liquibase formatted sql

--changeset sergey_prig:insert-1 
insert into item values (5,'sergey5','prigozhiy5')
--rollback delete from item where id = 5;