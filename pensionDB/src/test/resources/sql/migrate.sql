-- *********************************************************************
-- Update Database Script
-- *********************************************************************
-- Change Log: src/main/resources/db/environment/db.changelog-master-common.xml
-- Ran at: 31/10/15 10:24 AM
-- Against: user@jdbc:postgresql://localhost:5432/testdb
-- Liquibase version: 2.0.1
-- *********************************************************************

-- Lock Database
-- Changeset db/release/db.changelog-1.0.1.xml::1::max::(Checksum: 3:5be91851d2c28889a24a98682a3e7f24)
CREATE TABLE department (id INT NOT NULL, name VARCHAR(50) NOT NULL, active BOOLEAN DEFAULT TRUE, CONSTRAINT PK_DEPARTMENT PRIMARY KEY (id));

INSERT INTO databasechangelog (AUTHOR, COMMENTS, DATEEXECUTED, DESCRIPTION, EXECTYPE, FILENAME, ID, LIQUIBASE, MD5SUM, ORDEREXECUTED) VALUES ('max', '', NOW(), 'Create Table', 'EXECUTED', 'db/release/db.changelog-1.0.1.xml', '1', '2.0.1', '3:5be91851d2c28889a24a98682a3e7f24', 1);

-- Changeset db/release/db.changelog-1.0.1.xml::2::max::(Checksum: 3:d3b95c7b1eec38157c89fa16de6fce57)
CREATE TABLE test (id INT, name VARCHAR(50));

INSERT INTO databasechangelog (AUTHOR, COMMENTS, DATEEXECUTED, DESCRIPTION, EXECTYPE, FILENAME, ID, LIQUIBASE, MD5SUM, ORDEREXECUTED) VALUES ('max', '', NOW(), 'Create Table', 'EXECUTED', 'db/release/db.changelog-1.0.1.xml', '2', '2.0.1', '3:d3b95c7b1eec38157c89fa16de6fce57', 2);

-- Changeset db/release/db.changelog-1.0.1.xml::modify test.name to size 40::joe::(Checksum: 3:a972522c0d72ee32bceef83793090c7f)
ALTER TABLE test ALTER COLUMN name TYPE VARCHAR(40);

INSERT INTO databasechangelog (AUTHOR, COMMENTS, DATEEXECUTED, DESCRIPTION, EXECTYPE, FILENAME, ID, LIQUIBASE, MD5SUM, ORDEREXECUTED) VALUES ('joe', '', NOW(), 'Modify data type', 'EXECUTED', 'db/release/db.changelog-1.0.1.xml', 'modify test.name to size 40', '2.0.1', '3:a972522c0d72ee32bceef83793090c7f', 3);

-- Release Database Lock
-- Release Database Lock
