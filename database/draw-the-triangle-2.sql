DECLARE @number INT = 1
WHILE (@number < 21)
BEGIN
    SELECT REPLICATE('* ', @number)
    SET @number = @number + 1
END;