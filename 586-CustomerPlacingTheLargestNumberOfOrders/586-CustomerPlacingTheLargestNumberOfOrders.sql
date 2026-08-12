-- Last updated: 12/08/2026, 12:05:22
# Write your MySQL query statement below
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY Count(customer_number) DESC
LIMIT 1;
