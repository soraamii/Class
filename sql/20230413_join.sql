-- 2023.04.13
-- JOIN

-- CROSS JOIN
-- 스키마를 붙이고 결과 행은 모든 경우의 수 => n * m
-- emp, dept => 14 * 4 = 56
select *
from emp, dept
;

select * 
from emp cross join dept
;

select *
from emp inner join dept
on emp.deptno = dept.deptno
;

select *
from emp join dept
on emp.deptno = dept.deptno
;

select *
from emp, dept
where emp.deptno = dept.deptno;

select e.deptno, empno, dname
from emp e, dept d
where e.deptno = d.deptno
;

-- 이름이 SCOTT인 사람의 부서명을 출력
select deptno from emp where ename = 'SCOTT';
-- 20
select dname from dept where deptno = 20;

-- JOIN으로 해결
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno 
        and e.ename = 'SCOTT' 
;

-- 사원별 급여 등급 표현
select * from salgrade;

select e.ename, s.grade, s.losal, e.sal, s.hisal
from emp e, salgrade s
where e.sal between s.losal and s.hisal
;



-- SELF JOIN : 자기 자신의 테이블을 조인하는 경우
-- OUTER JOIN : 조건을 만족하지 않는 행도 출력

-- 각 사원의 이름과 각 사원의 매니저 이름을 출력
select e.ename, nvl(m.ename, '없음')
from emp e, emp m
where e.mgr = m.empno(+)
;
