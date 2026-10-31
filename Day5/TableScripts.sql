-- 계정 생성
CREATE USER `oraclejava`@`%` IDENTIFIED BY 'oraclejava';

-- 계정 생성 확인
SELECT Host, User, Password FROM mysql.user;

-- 데이터베이스 생성
CREATE DATABASE web;

-- oraclejava 사용자에 web 데이터베이스에 대해 모든 권한을 부여
GRANT ALL PRIVILEGES ON web.* TO `oraclejava`@`%`;

-- 권한 확인
SHOW GRANTS FOR `oraclejava`@`%`;

-- 권한 적용
FLUSH PRIVILEGES;

-- 회원 관련 테이블
CREATE TABLE `user` (
    `no` INT AUTO_INCREMENT PRIMARY KEY,
    `username` VARCHAR(30) NOT NULL UNIQUE,
    `password` VARCHAR(100) NOT NULL,
    `nickname` VARCHAR(15) NOT NULL,
    `email` VARCHAR(100),
    `status` CHAR(1) DEFAULT 'Y' CHECK(STATUS IN('Y', 'N')),
    `created_at` DATE DEFAULT CURDATE(),
    `updated_at` DATE DEFAULT CURDATE()
);

-- 테스트 데이터 삽입
INSERT INTO `user` (`username`, `password`, `nickname`, `email`)
VALUES('admin', '1234', '관리자', 'admin@gmail.com');

INSERT INTO `user` (`username`, `password`, `nickname`, `email`)
VALUES('hong', '1234', '길동이', 'hong@gmail.com');
