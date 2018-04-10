CREATE DEFINER=`root`@`localhost` PROCEDURE `BooksCount`(OUT cnt int)
BEGIN
select count(*) into cnt from Books;
END