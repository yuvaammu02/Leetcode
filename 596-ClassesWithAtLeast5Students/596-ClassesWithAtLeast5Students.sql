-- Last updated: 12/08/2026, 12:05:08
# Write your MySQL query statement below
select class from courses
group by class having count(student)>=5;