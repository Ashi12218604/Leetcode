# Write your MySQL query statement below
select u.user_id, Concat(upper(substr(u.name,1,1)),lower(substr(u.name,2))) as name
from users u
order by 
u.user_id;