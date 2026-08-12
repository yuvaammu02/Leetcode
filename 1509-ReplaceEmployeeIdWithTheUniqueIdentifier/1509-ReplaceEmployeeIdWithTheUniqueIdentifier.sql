-- Last updated: 12/08/2026, 11:56:29
SELECT eu.unique_id,
       e.name
FROM Employees e
LEFT JOIN EmployeeUNI eu
ON e.id = eu.id;
