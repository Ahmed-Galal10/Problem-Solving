DECLARE @number INT = 20;
WHILE (@number > 0)
BEGIN
    SELECT REPLICATE('* ', @number)
    SET @number = @number - 1
END;