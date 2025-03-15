-- region case テスト用
CREATE TABLE IF NOT EXISTS house (
    house_id INTEGER NOT NULL PRIMARY KEY,
    region CHAR(32) NOT NULL
);

-- city case テスト用
CREATE TABLE IF NOT EXISTS city (
    population INTEGER NOT NULL,
    city CHAR(32) NOT NULL,
    CONSTRAINT pk_City PRIMARY KEY (city)
);