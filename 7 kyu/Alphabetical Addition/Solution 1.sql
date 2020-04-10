SELECT
  COALESCE(CHR((((SUM(ASCII(letter) - 96) - 1) % 26 + 97)::INT)), 'z') AS letter
  FROM letters;