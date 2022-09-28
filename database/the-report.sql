SELECT IF(g.grade >= 8, s.name, NULL), g.grade, s.marks
FROM students AS s, grades AS g
WHERE s.marks BETWEEN g.min_mark AND g.max_mark
ORDER BY g.grade DESC, s.name;