--liquibase formatted sql
--changeset sergey_prig:1 create_TEST splitStatements:false stripComments:false

CREATE OR REPLACE PACKAGE TEST AS
/* * �ਬ�� ��ଫ���� ���� (PL/SQL package) * @author Prigozhiy * @version 1 (29.09.2013) * @headcom * ��� ���짮��⥫� �� EMS */  

/* ��楤��, ����� �����頥� ⥪�� * @author Prigozhiy * @version 2 (29.05.2013) * @param in_text# ⥪�� �� �室 * @param out_text# ⥪�� �� ��室 */ 
 FUNCTION PLUS (a number,b number) RETURN NUMBER; 

END TEST;
--rollback drop package TEST

--changeset sergey_prig:2 create_BODY_TEST splitStatements:false stripComments:false

CREATE OR REPLACE PACKAGE BODY TEST AS

  FUNCTION PLUS (a number,b number) RETURN NUMBER AS
  c number;
  BEGIN
  c:=a+b;
  RETURN c;

  END PLUS;

END TEST;
--rollback drop package body TEST