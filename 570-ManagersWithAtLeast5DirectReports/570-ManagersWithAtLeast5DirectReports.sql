-- Last updated: 12/08/2026, 12:05:55
# Write your MySQL query statement below
SELECT e.name
FROM Employee e
JOIN(
    SELECT managerId
    FROM Employee
    WHERE managerId IS NOT NULL
    GROUP BY managerId
    HAVING count(*) >=5
) m
ON e.id = m.managerID;