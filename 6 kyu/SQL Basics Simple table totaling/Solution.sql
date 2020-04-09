SELECT RANK() OVER (ORDER BY SUM(POINTS) DESC) AS rank,
  COALESCE(NULLIF(clan, ''), '[no clan specified]') AS clan,
  SUM(POINTS) AS total_points,
  COUNT(name) AS total_people
  FROM people
  GROUP BY clan
  ORDER BY SUM(POINTS) DESC;