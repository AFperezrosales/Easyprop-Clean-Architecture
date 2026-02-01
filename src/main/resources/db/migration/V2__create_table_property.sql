CREATE TABLE property_tb (
                             id VARCHAR(255) PRIMARY KEY,
                             description VARCHAR(255),
                             yard BOOLEAN,
                             bedroom_count INTEGER,
                             user_id VARCHAR(255),
                             CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES user_tb(id)
);