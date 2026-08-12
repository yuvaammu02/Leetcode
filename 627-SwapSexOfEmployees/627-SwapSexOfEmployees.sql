-- Last updated: 12/08/2026, 12:04:03
# Write your MySQL query statement below
update Salary
SET sex = CASE
         WHEN sex = 'f' THEN 'm'
         Else 'f'
         END;