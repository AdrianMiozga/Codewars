CREATE VIEW members_approved_for_voucher AS
  SELECT members.id, members.name, members.email, SUM(products.price) AS total_spending
  FROM sales
  INNER JOIN members ON sales.member_id = members.id
  INNER JOIN products ON sales.product_id = products.id
  WHERE sales.department_id IN
    (SELECT department_id
    FROM sales
    INNER JOIN products ON sales.product_id = products.id
    GROUP BY sales.department_id
    HAVING SUM(products.price) > 10000)
  GROUP BY members.id
  HAVING SUM(products.price) > 1000
  ORDER BY id;
  
SELECT * FROM members_approved_for_voucher;