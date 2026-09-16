# Write your MySQL query statement below
select e.name
from Employee e
join Employee r
on e.id = r.managerId
group by
e.id, e.name
having count(r.id) >= 5;