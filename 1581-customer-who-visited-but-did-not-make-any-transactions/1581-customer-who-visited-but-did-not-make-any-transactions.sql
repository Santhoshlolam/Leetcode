# Write your MySQL query statement below


/*+----------+-------------+
| visit_id | customer_id |
+----------+-------------+
| 1        | 23          |
| 2        | 9           |
| 4        | 30          |
| 5        | 54          |
| 6        | 96          |
| 7        | 54          |
| 8        | 54          |
+----------+-------------+  */



SELECT vv.customer_id, COUNT(vv.visit_id) AS count_no_trans 
from Visits vv
LEFT JOIN Transactions t 
ON vv.visit_id = t.visit_id  
WHERE t.transaction_id IS NULL 
GROUP BY vv.customer_id; 