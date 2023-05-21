# Write your MySQL query statement below
#select product_id,store1,store2,store3,price from Products where store1 is not null or store2 is not null or store3 is not null   group by product_id;

select product_id, 'store1' AS store, store1 AS price
FROM Products
WHERE store1 IS NOT NULL
UNION ALL
SELECT product_id, 'store2' AS store, store2 AS price
FROM Products
WHERE store2 IS NOT NULL
UNION ALL
SELECT product_id, 'store3' AS store, store3 AS price
FROM Products
WHERE store3 IS NOT NULL




