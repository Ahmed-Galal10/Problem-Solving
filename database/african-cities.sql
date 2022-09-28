SELECT city.name
FROM city, country
WHERE city.countryCode = country.code
AND country.continent = 'Africa';