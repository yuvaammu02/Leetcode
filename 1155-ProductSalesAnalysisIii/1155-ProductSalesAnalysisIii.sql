-- Last updated: 12/08/2026, 11:58:53
# Write your MySQL query statement below
SELECT s.product_id,
       s.year AS first_year,
       s.quantity,
       s.price
FROM Sales s
JOIN(
    SELECT product_id,
    MIN(year) AS first_year
    FROM Sales
    Group BY product_id
) t
ON s.product_id = t.product_id
AND s.year = t.first_year;