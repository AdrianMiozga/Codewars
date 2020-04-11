SELECT
  player_name,
  games,
  RPAD(ROUND(hits::NUMERIC / at_bats::NUMERIC, 3)::text, 5, '0') AS batting_average
  FROM yankees
  WHERE at_bats >= 100
  ORDER BY batting_average DESC;