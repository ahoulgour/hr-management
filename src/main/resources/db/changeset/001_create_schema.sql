CREATE TABLE PUBLIC.DEPARTMENT (ID INT AUTO_INCREMENT NOT NULL, CODE VARCHAR NOT NULL, DESCRIPTION VARCHAR NOT NULL, CONSTRAINT PK_DEPARTMENT PRIMARY KEY (ID));
CREATE TABLE PUBLIC.CATEGORY (ID INT AUTO_INCREMENT NOT NULL, CODE VARCHAR NOT NULL, DESCRIPTION VARCHAR NOT NULL, CONSTRAINT PK_CATEGORY PRIMARY KEY (ID));
CREATE TABLE PUBLIC.CONTRACT_TYPE (ID INT AUTO_INCREMENT NOT NULL, CODE VARCHAR NOT NULL, DESCRIPTION VARCHAR NOT NULL, CONSTRAINT PK_CONTRACT_TYPE PRIMARY KEY (ID));
CREATE TABLE PUBLIC.EMPLOYEE (
    ID INT AUTO_INCREMENT NOT NULL,
    DOCUMENT_ID VARCHAR NOT NULL,
    FIRST_NAME VARCHAR NOT NULL,
    MIDDLE_NAME VARCHAR,
    LAST_NAME VARCHAR NOT NULL,
    BIRTH_DATE VARCHAR NOT NULL,
    NATIONALITY VARCHAR NOT NULL,
    DEPARTMENT INT NOT NULL,
    CONSTRAINT PK_EMPLOYEE PRIMARY KEY (ID),
    CONSTRAINT FK_DEPARTMENT FOREIGN KEY (DEPARTMENT) REFERENCES DEPARTMENT(ID)
 );

CREATE TABLE PUBLIC.CONTRACT (
    ID INT AUTO_INCREMENT NOT NULL,
    START_DATE VARCHAR NOT NULL,
    FINISH_DATE VARCHAR NOT NULL,
    SALARY INT NOT NULL,
    CONTRACT_TYPE INT NOT NULL,
    CATEGORY INT NOT NULL,
    EMPLOYEE INT NOT NULL,
    CONSTRAINT PK_CONTRACT PRIMARY KEY (ID),
    CONSTRAINT FK_CONTRACT_TYPE FOREIGN KEY (CONTRACT_TYPE) REFERENCES CONTRACT_TYPE(ID),
    CONSTRAINT FK_CATEGORY FOREIGN KEY (CATEGORY) REFERENCES CATEGORY(ID),
    CONSTRAINT FK_EMPLOYEE FOREIGN KEY (EMPLOYEE) REFERENCES EMPLOYEE(ID)
);