-- DDL / DML exam

create table phoneInfo_basic (
    idx number(6) constraint PK_phoneInfo_basic_idx primary key,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate date default sysdate
);

create table phoneInfo_univ (
    idx number(6) constraint PK_phoneInfo_univ_idx primary key,
    fr_u_major varchar2(20) default 'N' not null,
    fr_u_year number(1) default 1 check(0 < fr_u_year and fr_u_year < 5) not null,
    fr_ref number(7) constraint REF_phoneInfo_univ_fr_ref references phoneInfo_basic(idx) not null
    
);

create table phoneInfo_com (
    idx number(6) constraint PK_phoneInfo_com_idx primary key,
    fr_c_company varchar2(20) default 'N' not null,
    fr_ref number(6) constraint REF_phoneInfo_com_fr_ref references phoneInfo_basic(idx) not null
);

-- 1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL

-- select
select * from phoneInfo_basic;

--insert
insert into phoneInfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address, fr_regdate)
values (seq_pbasic_idx.nextval, 'KBH', '010-1234-5050', 'KBH@gmail.com', '경기도 수원시', default);

insert into phoneInfo_basic (idx, fr_name, fr_phonenumber)
values (seq_pbasic_idx.nextval, 'SHJ', '010-1234-3030');

insert into phoneInfo_basic (idx, fr_name, fr_phonenumber)
values (seq_pbasic_idx.nextval, 'KYP', '010-1234-1111');

insert into phoneInfo_basic (idx, fr_name, fr_phonenumber)
values (seq_pbasic_idx.nextval, 'JWY', '010-1234-1212');

insert into phoneInfo_basic (idx, fr_name, fr_phonenumber)
values (seq_pbasic_idx.nextval, 'BJD', '010-1234-2727');

-- update
update phoneInfo_basic
set fr_phonenumber = '010-3030-3030'
where fr_name = 'SHJ';

-- delete
delete from phoneInfo_basic where fr_name = 'SHJ';


-- 2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL

-- insert
insert into phoneInfo_univ (idx, fr_u_major, fr_u_year, fr_ref)
values (seq_puniv_idx.nextval, '야구', 3, seq_pbasic_idx.currval);

insert into phoneInfo_univ (idx, fr_u_major, fr_u_year, fr_ref)
values (seq_puniv_idx.nextval, '축구', 2, seq_pbasic_idx.currval);

insert into phoneInfo_univ (idx, fr_u_major, fr_u_year, fr_ref)
values (seq_puniv_idx.nextval, '야구', 4, seq_pbasic_idx.currval);

insert into phoneInfo_univ (idx, fr_u_major, fr_u_year, fr_ref)
values (seq_puniv_idx.nextval, '야구', 3, seq_pbasic_idx.currval);

insert into phoneInfo_univ (idx, fr_u_major, fr_u_year, fr_ref)
values (seq_puniv_idx.nextval, '야구', 4, seq_pbasic_idx.currval);

-- select 
select * from phoneInfo_univ;

-- update
update phoneInfo_univ set fr_u_year = 2;

-- delete
delete from phoneInfo_univ where fr_u_major = '축구';

-- 3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL

-- insert
insert into phoneInfo_com (idx, fr_c_company, fr_ref)
values (seq_pcom_idx.nextval, 'KT', seq_pbasic_idx.currval);

insert into phoneInfo_com (idx, fr_c_company, fr_ref)
values (seq_pcom_idx.nextval, 'KT', seq_pbasic_idx.currval);

insert into phoneInfo_com (idx, fr_c_company, fr_ref)
values (seq_pcom_idx.nextval, 'LG', seq_pbasic_idx.currval);

insert into phoneInfo_com (idx, fr_c_company, fr_ref)
values (seq_pcom_idx.nextval, 'KT', seq_pbasic_idx.currval);




-- select
select * from phoneInfo_com;
select fr_c_company from phoneInfo_com where fr_ref = 111111;

-- update
update phoneInfo_com 
set fr_c_company = (select fr_c_company from phoneInfo_com where fr_ref = 111111)
where fr_c_company = 'LG';

-- delete
delete from phoneInfo_com where fr_ref = 111115;

-- drop
drop table phoneInfo_basic;
drop table phoneInfo_univ;
drop table phoneInfo_com;


-- sequence 생성
create sequence seq_pbasic_idx;
create sequence seq_puniv_idx;
create sequence seq_pcom_idx;
