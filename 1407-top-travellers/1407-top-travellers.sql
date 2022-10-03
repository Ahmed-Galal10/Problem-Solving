SELECT name, ifNull(SUM(r.distance), 0) AS travelled_distance
FROM users AS u
LEFT JOIN rides AS r
ON u.id = r.user_id
GROUP BY r.user_id
ORDER BY travelled_distance DESC, name;