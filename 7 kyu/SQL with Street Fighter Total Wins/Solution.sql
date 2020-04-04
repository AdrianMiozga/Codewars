SELECT fighters.name,
  SUM(CASE WHEN winning_moves.move IN ('Hadoken', 'Shouoken', 'Kikoken') THEN 0 ELSE fighters.won END) AS won,
  SUM(CASE WHEN winning_moves.move IN ('Hadoken', 'Shouoken', 'Kikoken') THEN 0 ELSE fighters.lost END) AS lost
  FROM fighters
  INNER JOIN winning_moves ON fighters.move_id = winning_moves.id
  GROUP BY fighters.name
  ORDER BY won DESC LIMIT 6;