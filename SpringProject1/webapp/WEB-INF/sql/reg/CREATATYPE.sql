-- PROCEDRE PROC_PDS_INSERT 안에서 사용할 
-- 사용자 타입을 정의하기 위해 FILE_ARRAY 타입을 생성
--  IN_FILENAME   IN    FILE_ARRAY,
-- CREATE TYPE -  새로운타입 정의

-- oracle plsql 문법에 is table of : 1차원 배열로 해석
-- oracle 배열 : 크기를 정하지 않은 뱌열
CREATE OR REPLACE TYPE FILE_ARRAY
    AS TABLE OF
        VARCHAR2(4000);
        
-- SEQUENCE : 자동번호 증가 - 글번호
--CREATE SEQUENCE  BRDSEQ;        
