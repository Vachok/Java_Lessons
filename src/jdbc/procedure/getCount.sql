CREATE PROCEDURE `getCount` ()
BEGIN
select count(*) from Users;
select count(*) from Books;
END
