-- Last updated: 12/08/2026, 11:59:03
# Write your MySQL query statement below
select actor_id,director_id
from ActorDirector 
group by actor_id,director_id
Having count(timestamp)>=3;