# Write your MySQL query statement below
select uNique_id,name from EmployeeS as e left outer join EmployeeUNI as c on e.id=c.id;