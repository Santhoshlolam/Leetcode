# Write your MySQL query statement below

 
/*Explanation: 
Average selling price = Total Price of Product / Number of products sold.
Average selling price for product 1 = ((100 * 5) + (15 * 20)) / 115 = 6.96
Average selling price for product 2 = ((200 * 15) + (30 * 30)) / 230 = 16.96
*/



/*{"headers":{"Prices":["product_id","start_date","end_date","price"],"UnitsSold":["product_id","purchase_date","units"]},"rows":{"Prices":[[1,"2019-01-04","2019-01-22",8],[2,"2019-01-29","2019-02-01",1]],"UnitsSold":[[1,"2019-01-12",5],[2,"2019-02-01",4]]}}
*/

select product_id,round((sum(units*price)/sum(units)),2) as average_price from Prices natural join UnitsSold
where (start_date)<=(purchase_date) and (purchase_date)<=(end_date) group by product_id;

