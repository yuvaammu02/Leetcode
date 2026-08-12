-- Last updated: 12/08/2026, 12:16:46
# Write your MySQL query statement below
SELECT today.id 
FROM Weather yesterday 
CROSS JOIN Weather today
WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1
   AND today.temperature > yesterday.temperature;