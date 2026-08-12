-- Last updated: 12/08/2026, 11:59:11
# Write your MySQL query statement below

SELECT  customer_id FROM Customer GROUP BY customer_id
HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product)