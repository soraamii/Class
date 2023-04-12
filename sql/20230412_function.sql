-- 2023.04.12
-- 함수

desc dual;
select * from dual;

-- 단일행 함수 / 집합(그룹) 함수
-- 단일행 함수 : 숫자, 문자, 날짜, 변환, 기타 함수

-- 숫자 함수
-- 절대값 abs
select 10, -10, abs(-10), abs(10) from dual;

-- floor : 소수점 아래를 절삭
select 2.1, 2.9, floor(2.1), floor(2.9) from dual;

-- round : 지정 위치에서 반올림
select 1234.567, round(1234.567), round(1234.567, 1), round(1234.567, -1), round(1234.567, -2) from dual;

-- trunc : 특정 자리수 아래를 절삭
select 1234.567, trunc(1234.567), trunc(1234.567, 1), trunc(1234.567, -2) from dual;

-- mod : 나머지 연산
-- mod(3,0) sql에서 예외가 발생하진 않음, 논리적인 결과를 끄집어 내는 것
select mod(1,3), mod(2,3), mod(0,3), mod(3,0) from dual;

-- 문자 함수
-- 문자열 모두를 소문자로 변경
select 'SCOTT', lower('SCOTT') from dual;
select dname, lower(dname)from dept;
-- 대문자 변경
select * from emp where ename = upper('scott');
select 'scott', upper('scott') from dual;

select initcap('scott') from dual;

-- 문자열을 추출 : substr(원본, 시작 위치), substr(원본, 시작 위치, 반환할 문자의 개수)
select '안녕하세요. 강백호입니다.', 
substr('안녕하세요. 강백호입니다.', 7),
substr('안녕하세요. 강백호입니다.', 2, 8)
from dual;

-- 문자열의 개수 : length(원본 문자열)
select length('안녕하세요.!!!!') from dual;

-- 문자열에서 특정 자릿수 지정하고 자리에 데이터가 없을 때 패턴을 입력
-- 00010
select '10', lpad('10', 10, '0'), rpad('11', 5, '*') from dual;
select deptno, lpad(deptno, 5, '0') from dept;

-- trim() : 공백 제거
select '     ABC     ', 
        trim('     ABC     '),
        trim('     ABC'),
        trim('ABC     ')
from dual;

select 'Steven King',
        replace('Steven King', 'Steven', 'S.'),
        replace('Steven King', 'Steven ', '')
from dual;


-- 날짜 함수
select sysdate from dual;

select sysdate, months_between('23/12/12', sysdate) from dual;
select add_months(sysdate, 8) from dual;
select add_months(sysdate, -1) from dual;
select add_months(sysdate, -3) from dual;
select add_months(sysdate, -6) from dual;
select next_day(sysdate, 1) from dual;
select last_day(sysdate) from dual;
select round(sysdate) from dual;
select trunc(sysdate) from dual;

-- 변환 함수
-- DATE -> CHAR
-- to_char(원본, '패턴')
select sysdate,
        to_char(sysdate, 'YYYY-MM-DD'),
        to_char(sysdate, 'YYYY.MM.DD.'),
        to_char(sysdate, 'YYYY-MM-DD DAY'),
        to_char(sysdate, 'YYYY.MM.DD HH24:MI:SS')
from dual;

-- number -> char
select 123456789, 
        to_char(123456789, '000000000000'),
        to_char(123456789, '000,000,000,000'),
        to_char(123456789, '999999999999'),
        to_char(123456789, '999,999,999,999'),
        to_char(123456789, 'L999,999,999,999'),
        to_char(3456789, '999,999') -- 원본보다 자릿수가 적으면 제대로 표현하지 못함
from dual;

select ename, sal, to_char(sal*1300, 'L999,999,999') as wonSAL
from emp;

-- char -> date
-- to_date('문자열', '패턴')
select * 
from emp
where hiredate = to_date('19810220', 'YYYYMMDD')
-- to_date('19810220', 'YYYYMMDD')
;

insert into emp values(9999, 'SON', 'MANAGER', 7782, to_date('2023-04-12', 'YYYY-MM-DD'), 4000, null, 10);
select * from emp;
rollback; -- 마지막 commit 시점으로 복귀

-- char -> number
- to_number('문자열', '패턴') => 숫자 타입으로 변경
select '20000' - '10000'  -- 자동 형변환
from dual;

select '20,000' - '10,000'
from dual;

select to_number('20,000', '999,999,999') - to_number('10,000', '99,999')
from dual;

-- decode 함수 => 비교 연산 후 결과 출력하는 함수 switch-case
select ename, deptno,
        decode(deptno,
                    10, 'ACCOUNTING',
                    20, 'researtch',
                    30, 'SALE',
                    40, 'OPERATION'
            )as dname
from emp

order by deptno;




-- exam
select empno, ename, job, sal,
    nvl(decode (job,
            'ANALYST', sal*1.05,
            'SALESMAN', sal*1.1,
            'MANAGER', sal*1.15,
            'CLERK', sal*1.2
            ),sal) as upsal

from emp;

select ename, deptno,
        decode(deptno,
                    10, 'ACCOUNTING',
                    20, 'researtch',
                    30, 'SALE',
                    40, 'OPERATION'
            )as dname,
            case when deptno = 10 then 'ACCOUNTING'
                when deptno = 20 then 'RESEARCH'
                when deptno = 30 then 'SALSE'
                else 'OPERATIONS'
            end as dname2
            
from emp
order by deptno;



-- 그룹함수, 집합함수, 집계함수, 다중행함수
-- 하나의 행이 아닌 다중행을 그룹으로 묶어서 처리
-- sum, avg, count, max, min

-- 급여 총액
select sum(sal), to_char(sum(sal), 'L999,999')
from emp;

-- 커미션의 총합
select sum(comm), count(comm), avg(comm)
from emp;

select comm from emp where comm is not null;

-- 평균 급여
select avg(sal), trunc(avg(sal)), round(avg(sal), 2)
from emp;

-- 최대 급여 - max, 최소 급여 - min
select max(sal), min(sal)
from emp;

-- count() => row 개수
-- 전체 사원의 수
select count(*)
from emp;

-- 10번 부서의 사원 수
select count(*) from emp where deptno = 10;

-- 부서의 개수
select count(*) from dept;

select distinct job from emp
order by job;

select count(distinct job)
from emp;

select count(comm)
from emp;


select * from emp order by deptno;


-- group by => 행 단위로 그룹핑
select deptno, count(*) as "사원의 수", 
                sum(sal) as "총급여액", 
                trunc(avg(sal)) as "평균급여액",
                max(sal) as "최고 급여액",
                min(sal) as "최소 급여액",
                count(comm) as "커미션을 받는 사원 수"
from emp
group by deptno
-- 그룹의 평균 급여가 2000 이상
--having avg(sal) >= 2000   --그룹핑 된 데이터의 집합 함수 결과를 조건식으로 만들 때 사용
-- 총 급여액이 10000 넘어가는 그룹
having sum(sal) > 10000
order by deptno;

select job, count(*), trunc(avg(sal)), sum(sal), max(sal), min(sal), max(sal)-min(sal)
from emp
group by job;