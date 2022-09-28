SELECT country.continent, FLOOR(AVG(city.population))
FROM country, city
WHERE country.code = city.countryCode
GROUP BY country.continent;