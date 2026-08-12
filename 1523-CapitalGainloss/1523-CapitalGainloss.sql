-- Last updated: 12/08/2026, 11:56:24
SELECT stock_name,
       SUM(
           CASE
               WHEN operation = 'Buy' THEN -price
               WHEN operation = 'Sell' THEN price
           END
       ) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name;
