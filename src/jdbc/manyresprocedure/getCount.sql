create procedure getCount()
BEGIN
select count(*) from Users;
select count(*) from Books;
END