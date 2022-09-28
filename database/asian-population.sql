SELECT SUM(city.population)
FROM city, country
WHERE city.countryCode = country.code
AND country.continent = 'Asia';