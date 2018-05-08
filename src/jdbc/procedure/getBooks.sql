CREATE DEFINER=`root`@`localhost` PROCEDURE `getBooks`(bookId int)
BEGIN
select * from books where id = bookId;
END