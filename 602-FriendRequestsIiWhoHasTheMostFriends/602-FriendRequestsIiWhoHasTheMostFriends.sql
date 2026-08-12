-- Last updated: 12/08/2026, 12:04:49

WITH ids AS (
(SELECT
    accepter_id,
    COUNT(accept_date) AS num
FROM requestaccepted
GROUP BY accepter_id
)-- This above query COUNT accept_date(rows) for each accepter_id
-- Group by accepter_id Divides COUNT For accepter_id

UNION ALL

   (SELECT
   requester_id,
   (COUNT(accept_date) ) AS num
FROM requestaccepted
GROUP BY requester_id)-- This above query COUNT accept_date(rows) for each requester_id
-- Group by requester_id Divides COUNT For accepter_id
)

SELECT accepter_id AS id,
SUM(num) AS num
FROM ids
GROUP BY id 
ORDER BY num DESC LIMIT 1;