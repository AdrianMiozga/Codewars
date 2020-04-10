SELECT project,
  array_to_string(regexp_split_to_array(address, '\d*'), '') AS letters,
  array_to_string(regexp_split_to_array(address, '\D*'), '') AS numbers
  FROM repositories;