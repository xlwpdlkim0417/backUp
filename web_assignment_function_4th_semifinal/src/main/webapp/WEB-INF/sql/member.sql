CREATE TABLE member (
    id     VARCHAR2(20) PRIMARY KEY,
    email  VARCHAR2(50) NOT NULL,
    name   VARCHAR2(20) NOT NULL
);

INSERT INTO MEMBER ( ID, EMAIL, NAME)
VALUES ('admin', 'admin@korea.com', '관리자')