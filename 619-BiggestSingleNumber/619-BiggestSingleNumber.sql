-- Last updated: 12/08/2026, 12:04:18
# Write your MySQL query statement below
SELECT MAX(num) AS num
FROM MyNumbers
WHERE num IN(
    SELECT num 
    FROM MyNumberS
    GROUP BY  num
    HAVING COUNT(*) = 1
);