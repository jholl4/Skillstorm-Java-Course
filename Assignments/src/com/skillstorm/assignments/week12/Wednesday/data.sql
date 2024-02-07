INSERT INTO bookstore.bookstorelocation (name, address)
VALUE ('Penguin Bookshop', '417 Beaver St, Sewickley, PA 15143'),
('Equip Books', '1001 Franklin Ave, Aliquippa, PA 15001'),
('Barnes & Noble', '800 Settlers Ridge Center Dr, Pittsburgh, PA 15205');

INSERT INTO bookstore.book (title, author, genre, price, ISBN, BookstoreLocation_BusinessID)
VALUE ('Clean Code', 'Robert C. Martin', 'Software Design', 40.00, '978-0132350884', 1),
('Python for Everybody', 'Dr. Charles Severance', 'Programming Languages', 14.00, '978-1530051120', 2),
('Battle Angel Alita Complete Boxed Set', 'Yukito Kishiro', 'Manga', 120.00, 978-1632367112, 3);

INSERT INTO bookstore.customer (first_name, last_name, address)
VALUE ('Josh', 'Holland', '123 Pitt Dr. Pittsburgh, PA 38122'),
('Flynn', 'Holland', '123 Pitt Dr. Pittsburgh, PA 38122'),
('Weird', 'Weirdo', '1234 Pitt Dr. Pittsburgh, PA 38122');