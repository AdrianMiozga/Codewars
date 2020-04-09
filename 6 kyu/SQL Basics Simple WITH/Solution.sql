WITH special_sales AS (SELECT * FROM sales WHERE price > 90)
  SELECT DISTINCT departments.id, departments.name
  FROM departments, special_sales
  WHERE departments.id IN (special_sales.department_id)
  ORDER BY id;