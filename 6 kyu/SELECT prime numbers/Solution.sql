SELECT a.n AS prime
  FROM generate_series(2, 100) AS a(n)
  WHERE NOT EXISTS (SELECT 1 FROM generate_series(2, a.n - 1) AS b(n) WHERE a.n % b.n = 0);