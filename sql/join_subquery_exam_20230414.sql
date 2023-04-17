-- join & sub query exam

-- 1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
-- (5) 박지성이 구매한 도서의
-- 출판사수
select count(distinct b.publisher)
from orders o inner join book b
on o.bookid = b.bookid
where o.custid = 1;

-- (6) 박지성이 구매한 도서의 이름, 가격, 정가와 판매 가격의 차이
select b.bookname, b.price, b.price - o.saleprice as pricegap
from orders o, book b
where o.bookid = b.bookid and o.custid = 1;

-- (7) 박지성이 구매하지 않은 도서의 이름
-- 구매한 도서를 찾고 해당 범위 반전
select bookname
from book b
where not exists(select * from orders o where o.bookid = b.bookid and o.custid =1)
;

-- 다른 풀이

select distinct bookid from orders o, customer c where o.custid = c.custid and c.name = '박지성';

select bookname
from book
where bookid not in (select distinct bookid from orders o, customer c where o.custid = c.custid and c.name = '박지성')
;

-- 2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
-- (8) 주문하지 않은 고객의 이름(부속질의사용)
select name
from customer c
where not exists (select custid from orders o where o.custid = c.custid)
;

-- 다른 풀이
select distinct custid from orders;
select name
from customer
where custid not in (select distinct custid from orders)
;

-- 구매 이력이 있는 고객
select name
from customer c
where exists (select * from orders o where c.custid = o.custid) -- select의 결과가 1행이라도 있으면 참
;

-- (9) 주문 금액의 총액과 
-- 주문의 평균 금액
select sum(saleprice) total, round(avg(saleprice)) avgsaleprice
from orders
;

-- (10) 고객의 이름과 고객별 구매액
select c.name, sum(o.saleprice)
from orders o, customer c
where o.custid = c.custid
group by c.name
;

-- 다른 풀이
-- group by, c.custid, c.name
-- orders, customer
select c.name, sum(o.saleprice) as total
from orders o, customer c
where o.custid = c.custid
group by c.custid, c.name
order by c.custid
;

-- (11) 고객의 이름과 고객이 구매한 도서목록
select c.name, b.bookname
from orders o, customer c, book b
where o.custid = c.custid and o.bookid = b.bookid
order by c.name
;


-- (12) 도서의 가격(Book 테이블)과 
-- 판매 가격(Orders 테이블)의 차이가 가장 많은 주문
select *
from orders o, book b
where o.bookid = b.bookid 
and (b.price - o.saleprice) = (select max(b.price - o.saleprice) 
                                from orders o, book b
                                where o.bookid = b.bookid)
;


-- (13) 도서의 판매액 평균보다
-- 자신의 구매액 평균이 더 높은 고객의 이름
select c.name
from customer c, orders o
where c.custid =  o.custid
group by c.name
having avg(saleprice) > (select avg(saleprice) from orders)
;

-- 다른 풀이
select c.custid, c.name, avg(o.saleprice)
from orders o, customer c
where o.custid = c.custid
group by c.custid, c.name
having avg(o.saleprice) > (select avg(saleprice) from orders)
order by c.custid
;


-- 3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
-- (1) 박지성이 구매한 도서의 출판사와 
-- 같은 출판사에서 도서를 구매한 고객의 이름

select c.name
from customer c , book b, orders o
where b.bookid = o.bookid and o.custid = c.custid
and b.publisher in (select b.publisher from book b, orders o
 where b.bookid = o.bookid and o.custid = 1)
and c.name != '박지성'
order by c.name desc
;

-- 조금 다른 풀이
select distinct b.publisher
from orders o, customer c, book b
where o.bookid = b.bookid and o.custid = c.custid and c.name = '박지성'
;

select c.name
from orders o, customer c, book b
where o.bookid = b.bookid and o.custid = c.custid
and b.publisher in (select distinct b.publisher
from orders o, customer c, book b
where o.bookid = b.bookid and o.custid = c.custid and c.name = '박지성')
and c.name != '박지성'
;

-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select c.name
from customer c, orders o, book b
where c.custid = o.custid 
and b.bookid = o.bookid
group by c.name, c.custid
having count(distinct b.publisher) >= 2
;


-- 두 개 이상의 출판사의 책을 구매한 회원 아이디
select *
from customer
where custid in (select o.custid
                from orders o, book b
                where o.bookid = b.bookid
                group by o.custid
                having count(distinct b.publisher) > 1)
;

select o.custid, count(distinct b.publisher)
from orders o, book b
where o.bookid = b.bookid
group by o.custid
having count(distinct b.publisher) > 1
;


