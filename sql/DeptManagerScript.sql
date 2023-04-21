-- DEPT MANAGER
-- 1.List
Select * from dept;

-- 2. Search
select * from dept where deptno = 10;
select * from dept where deptno = ?;
select * from dept where like '%?%';

-- 3. Insert
insert into dept values (50, 'Test', 'Seoul');
insert into dept values (?, ?, ?);

rollback;

-- 4. 수정 Update
update dept set dname = 'AAA', loc = 'BBB' where deptno = 60;
update dept set dname = ?, loc = ? where deptno = ?;

-- 5. Delete
delete from dept where deptno = 60;
delete from dept where deptno = ?;

rollback;

commit;