SELECT people.id, people.name, COUNT(*) AS toy_count
  FROM toys
  INNER JOIN people ON toys.people_id = people.id
  GROUP BY people.id;