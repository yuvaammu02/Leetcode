-- Last updated: 12/08/2026, 12:18:23
# Write your MySQL query statement below
Select (
    Select DISTINCT salary 
    from Employee
    Order by  salary DESC
    Limit 1 Offset 1
)AS SecondHighestSalary;