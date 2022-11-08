SELECT AVG(rental_rate) FROM film;

SELECT COUNT(film) FROM film
WHERE title LIKE 'C%';

select MAX(length) FROM film
WHERE rental_rate=0.99;

SELECT DISTINCT (replacement_cost) FROM film
WHERE length>150;