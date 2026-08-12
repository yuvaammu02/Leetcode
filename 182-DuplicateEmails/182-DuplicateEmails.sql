-- Last updated: 12/08/2026, 12:17:40
# Write your MySQL query statement below
SELECT email FROM Person
GROUP BY email
HAVING COUNT(email) > 1;