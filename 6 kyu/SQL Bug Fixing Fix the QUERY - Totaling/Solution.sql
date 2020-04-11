SELECT 
  sale.transaction_date::date AS day,
  department.name AS department,
  COUNT(sale.id) AS sale_count
  FROM department
    INNER JOIN sale ON department.id = sale.department_id
  GROUP BY department.name, day
  ORDER BY day, department.name;