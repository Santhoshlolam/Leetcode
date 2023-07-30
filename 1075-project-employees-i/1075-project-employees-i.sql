# Write your MySQL query statement below
/*+-------------+---------------+
| project_id  | average_years |
+-------------+---------------+
| 1           | 2.00          |
| 2           | 2.50          |
+-------------+---------------+
Explanation: The average experience years for the first project is (3 + 2 + 1) / 3 = 2.00 and for the second project is (3 + 2) / 2 = 2.50   */


select project_id,round((sum(experience_years)/count(project_id)),2) as average_years from Project natural join Employee group by project_id;

