SELECT people.*, COUNT(*) AS sale_count, RANK() OVER (ORDER BY COUNT(*)) AS sale_rank
  FROM people
  INNER JOIN sales ON people.id = sales.people_id
  GROUP BY people.id;