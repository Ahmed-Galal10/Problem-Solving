SELECT ROUND(LONG_W, 4)
FROM station
WHERE LAT_N IN (SELECT MAX(LAT_N)
                FROM station
                WHERE LAT_N < 137.2345);