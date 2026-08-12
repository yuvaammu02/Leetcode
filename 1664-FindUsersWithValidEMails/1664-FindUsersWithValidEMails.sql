-- Last updated: 12/08/2026, 11:55:41
# Write your MySQL query statement below
SELECT *
FROM Users
WHERE mail REGEXP  '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$'
AND mail LIKE BINARY '%@leetcode.com';
