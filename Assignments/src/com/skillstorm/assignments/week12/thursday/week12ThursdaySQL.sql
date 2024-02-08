#ORDER BY QUERY Practice
#1. Retrieve all customers from the "customer" table, ordered by last name in descending order:
SELECT last_name, first_name
FROM sakila.customer
ORDER BY last_name DESC;

#2. Get the titles of all films from the "film" table, ordered by release year in ascending order
SELECT title, release_year
FROM sakila.film
ORDER BY release_year ASC;

#3. Retrieve the first name, last name, and email of all customers, ordered by last name in ascending order and then by first name in ascending order:
SELECT first_name, last_name, email
FROM sakila.customer
ORDER BY last_name ASC;

SELECT first_name, last_name, email
FROM sakila.customer
ORDER BY first_name ASC;

#4. Get the rental ID, rental date, and return date from the "rental" table, ordered by rental date in descending order:
SELECT rental_id, rental_date, return_date
FROM sakila.rental
ORDER BY rental_date DESC;

#5. Retrieve the first name, last name, and phone number of customers whose last name starts with "S", ordered by last name in descending order:
SELECT first_name, last_name, phone
FROM sakila.customer c
INNER JOIN sakila.address a
ON c.address_id = a.address_id
WHERE last_name LIKE "S%"
ORDER BY last_name DESC;



#JOIN QUERY Practice
#1. Retrieve the film title and the language name it is in.
SELECT title, name AS 'language'
FROM sakila.film f
INNER JOIN sakila.language l
ON f.language_id = l.language_id;

#2. Retrieve the staff member's first name and the store they work at.
SELECT first_name, store.store_id
FROM sakila.staff
LEFT JOIN sakila.store
ON staff.store_id = store.store_id;

#3. Retrieve the customer's first name and the rental date of the films they have rented.
SELECT first_name, rental_date
FROM sakila.customer c
LEFT JOIN sakila.rental r
ON c.customer_id = r.customer_id
ORDER BY rental_date;

#4. Get the staff member's first name and the number of customers they have assisted.
SELECT first_name, COUNT(customer_id) AS 'Customers Assisted'
FROM sakila.staff s
INNER JOIN sakila.rental r
ON s.staff_id = r.staff_id
GROUP BY r.staff_id;

#5. Get the customer's first name and the total amount they have paid in payments.
SELECT first_name, SUM(amount) AS 'Total paid'
FROM sakila.customer c
INNER JOIN sakila.payment p
ON c.customer_id = p.customer_id
GROUP BY c.customer_id;

#6. Get the customer's first name, last name, and the film titles they have rented.
SELECT first_name, last_name, title AS 'Title Rented'
FROM sakila.customer c
LEFT JOIN sakila.rental r
ON c.customer_id = r.customer_id
INNER JOIN sakila.inventory i
ON r.inventory_id = i.inventory_id
INNER JOIN sakila.film f
ON i.film_id = f.film_id
ORDER BY last_name;

# Or using nested subqueries

SELECT first_name, last_name, title
FROM sakila.customer
LEFT JOIN (
	SELECT rental.inventory_id, rental.customer_id, title
    FROM sakila.rental
    INNER JOIN (
		SELECT inventory.film_id, inventory.inventory_id, title
        FROM sakila.inventory
        INNER JOIN (
			SELECT title, film_id
            FROM sakila.film
            ) AS flm ON flm.film_id = inventory.film_id
        ) AS inv ON rental.inventory_id = inv.inventory_id
	) AS rntl ON rntl.customer_id = customer.customer_id;
