SELECT pokemon.pokemon_name, pokemon.str * multipliers.multiplier AS modifiedStrength, multipliers.element
  FROM pokemon
  INNER JOIN multipliers ON pokemon.element_id = multipliers.id
  WHERE pokemon.str * multipliers.multiplier >= 40
  ORDER BY pokemon.str * multipliers.multiplier DESC;