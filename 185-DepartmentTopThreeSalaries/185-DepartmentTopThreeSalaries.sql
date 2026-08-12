-- Last updated: 12/08/2026, 12:17:13
# Write your MySQL query statement below
SELECT d.name AS Department ,e1.name AS Employee,e1.salary
FROM Employee e1
JOIN department d 
ON e1.departmentId = d.Id
WHERE 3 > (SELECT count(distinct (e2.salary))
           FROM Employee e2
           WHERE e2.salary > e1.salary
           AND e1.departmentId = e2.departmentId)