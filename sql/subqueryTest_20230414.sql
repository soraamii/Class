-- subquery Test

select deptno, (select dname from dept where dept.deptno = emp.deptno) as dname from emp where ename = 'SCOTT';


-- 마당서점의 고객별 판매액을 보이시오(결과는 고객이름과 고객별 판매액을 출력).
select (select name from customer c where c.custid = o.custid) as name, sum(saleprice) as total
from orders o
group by custid;