SELECT country FROM country
where country LIKE 'A%a';

SELECT country FROM country
WHERE country LIKE '%______%n';

SELECT title FROM film
WHERE title ILIKE '%t%t%t%t%';

SELECT * FROM film
WHERE title LIKE 'C%' AND length>90 AND rental_rate=2.99;