SELECT s.name 
FROM salesPerson AS s
WHERE s.sales_id NOT IN (
                SELECT o.sales_id
                FROM orders AS o, company AS c
                WHERE o.com_id = c.com_id
                AND c.name = 'RED'
               );