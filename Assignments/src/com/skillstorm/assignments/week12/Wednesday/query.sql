SELECT * FROM bookstore.book;

SELECT * FROM bookstore.customer;

SELECT * FROM bookstore.bookstorelocation;

SELECT * FROM bookstore.bookstorelocation
INNER JOIN bookstore.book ON book.BookstoreLocation_BusinessID = bookstorelocation.BusinessID;