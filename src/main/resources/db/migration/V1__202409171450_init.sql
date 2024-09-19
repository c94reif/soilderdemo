DROP TABLE IF EXISTS soilder;
CREATE TABLE soilder (
                         id BIGINT GENERATED  Always As  IDENTITY PRIMARY KEY,
                         first_name VARCHAR(255) NOT NULL,
                         last_name VARCHAR(255) NOT NULL,
                         rank VARCHAR(255) NOT NULL,
                         age INT
)