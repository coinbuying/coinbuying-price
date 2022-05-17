CREATE TABLE IF NOT EXISTS coin_price_history (
    price_id INT(10) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ticker CHAR(6) NOT NULL COMMENT '코인 종목코드',
    market VARCHAR(20) NOT NULL COMMENT '거래소',
    start_price DOUBLE(20) NOT NULL COMMENT '시가',
    end_price DOUBLE(20) NOT NULL COMMENT '종가',
    min_price DOUBLE(20) NOT NULL COMMENT '최소값',
    max_price DOUBLE(20) NOT NULL COMMENT '최대값',
    candle_interval CHAR(5) NOT NULL COMMENT '차트간격',
    update_dttm DATETIME NOT NULL COMMENT '업데이트시간'
);

CREATE TABLE IF NOT EXISTS coin_price (
    price_id INT(10) AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ticker CHAR(6) NOT NULL COMMENT '코인 종목코드',
    market VARCHAR(20) NOT NULL COMMENT '거래소',
    price DOUBLE(20) NOT NULL COMMENT '가격',
    dttm DATETIME NOT NULL COMMENT '업데이트시간'
);