CREATE SEQUENCE SEQ_COMMEN

-- 테이블 생성
CREATE TABLE commen (   
    ghost INT PRIMARY KEY,
    num INT NOT NULL,
    writer  VARCHAR2(20) NOT NULL,
    content CLOB,
    regtime VARCHAR2(20) NOT NULL,
    hits    INT NOT NULL,
    likes   INT NOT NULL
);

INSERT INTO COMMEN (GHOST, NUM, WRITER, CONTENT, REGTIME, HITS, LIKES)
VALUES(SEQ_COMMEN.nextval, 1, 'admin', '댓글 내용1', SYSDATE, 0 ,0)