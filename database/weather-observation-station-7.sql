SELECT DISTINCT city
FROM station
WHERE RIGHT(city, 1) IN ('a', 'e', 'i', 'o', 'u');
-- WHERE SUBSTR(city, LENGTH(city), 1) IN ('a', 'e', 'i', 'o', 'u');