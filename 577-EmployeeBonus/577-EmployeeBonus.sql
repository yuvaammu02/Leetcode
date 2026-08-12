-- Last updated: 12/08/2026, 12:05:38
# Write your MySQL query statement below
SELECT Employee.name ,Bonus.bonus FROM Employee
LEFT JOIN Bonus ON Employee.empId = Bonus.empId
WHERE bonus < 1000 OR bonus IS  NULL;  