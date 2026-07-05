# Write your MySQL query statement below
SELECT EmployeeUNI.unique_id  as unique_id,Employees.name from Employees
LEFT join EmployeeUNI on Employees.id = EmployeeUNI.id;