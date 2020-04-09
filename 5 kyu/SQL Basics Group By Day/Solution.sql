SELECT created_at::date AS day, description, COUNT(*) AS count
  FROM events
  WHERE name LIKE '%trained%'
  GROUP BY created_at::date, description
  ORDER BY created_at::date, description;