# Write your MySQL query statement below
select e.name from employee e
inner join employee m 
on e.id=m.managerId
group by m.managerId
having count(m.managerId)>=5;