# Write your MySQL query statement below


/*select name,sum(amount) as balance from Users natural join Transactions where sum(amount)>10000 group by name; */

select name,sum(amount) as balance from Users natural join Transactions group by name having sum(amount)>10000;


