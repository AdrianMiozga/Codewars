SELECT products.name,
  SUM(CASE WHEN details.detail = 'good' THEN 1 ELSE 0 END) AS good,
  SUM(CASE WHEN details.detail = 'ok' THEN 1 ELSE 0 END) AS ok,
  SUM(CASE WHEN details.detail = 'bad' THEN 1 ELSE 0 END) AS bad 
  FROM products
  INNER JOIN details ON products.id = details.product_id
  GROUP BY products.name
  ORDER BY products.name;