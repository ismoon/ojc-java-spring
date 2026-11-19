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
    `role` VARCHAR(10) DEFAULT 'ROLE_USER',
    `nickname` VARCHAR(15) NOT NULL,
    `email` VARCHAR(100),
    `status` CHAR(1) DEFAULT 'Y' CHECK(STATUS IN('Y', 'N')),
    `created_at` DATE DEFAULT CURDATE(),
    `updated_at` DATE DEFAULT CURDATE()
);

-- 테스트 데이터 삽입
INSERT INTO `user` (`username`, `password`, `role`, `nickname`, `email`)
VALUES('admin', '1234', 'ROLE_ADMIN', '관리자', 'admin@gmail.com');

INSERT INTO `user` (`username`, `password`, `role`, `nickname`, `email`)
VALUES('hong', '1234', 'ROLE_USER', '길동이', 'hong@gmail.com');

-- 패스워드 암호화 버전
INSERT INTO `user` (`username`, `password`, `role`, `nickname`, `email`)
VALUES('admin', '$2a$10$mEv9zKtzD7OtM6TmiS5hM.AnYNBOXHNJkd6NbJ2hjbpX8jlMK0biS', 'ROLE_ADMIN', '관리자', 'admin@gmail.com');

INSERT INTO `user` (`username`, `password`, `role`, `nickname`, `email`)
VALUES('hong', '$2a$10$wAuM6IoC542z8Fg4o.3TvOshYDrJH8WW/dg1Emd8D75gCLLd2dPAa', 'ROLE_USER', '길동이', 'hong@gmail.com');

-- TODO 관련 테이블
CREATE TABLE todo (
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `title` VARCHAR(2000),
    `importance` INT,
    `urgency` INT,
    `deadline` DATE DEFAULT CURDATE(),
    `done` CHAR(1) DEFAULT 'N' CHECK(STATUS IN('Y', 'N'))
);

insert into todo values (DEFAULT, '고양이 목욕시키기', 0, 0, '2025-01-01', 'N');
insert into todo values (DEFAULT, '스프링수업', 0, 1, '2024-11-30', 'N');
insert into todo values (DEFAULT, '고양이 사료확인', 1, 0, '2024-10-31', 'N');
insert into todo values (DEFAULT, 'buy cellphone', 0, 0, '2025-12-31', 'N');
