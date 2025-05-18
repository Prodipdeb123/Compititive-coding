# Write your MySQL query statement below
select E.name,B.bonus
from 
    employee E
    left join bonus B on 
    E.empid = B.empid
where 
    bonus <1000 or bonus is null