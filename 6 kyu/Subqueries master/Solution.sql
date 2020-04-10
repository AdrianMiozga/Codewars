SELECT
  CASE WHEN array_length(regexp_split_to_array(name, '\s'), 1) > 3 THEN
  SPLIT_PART(name, ' ', 1) || ' ' || SPLIT_PART(name, ' ', 2) ELSE SPLIT_PART(name, ' ', 1) END AS name,
  CASE WHEN array_length(regexp_split_to_array(name, '\s'), 1) > 3 THEN
  SPLIT_PART(name, ' ', 3) ELSE SPLIT_PART(name, ' ', 2) END AS first_lastname,
  CASE WHEN array_length(regexp_split_to_array(name, '\s'), 1) > 3 THEN
  SPLIT_PART(name, ' ', 4) ELSE SPLIT_PART(name, ' ', 3) END AS second_lastname
  FROM people;