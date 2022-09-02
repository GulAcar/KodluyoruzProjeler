SELECT DISTINCT (replacement_cost) from film;
SELECT COUNT (DISTINCT replacement_cost) from film;

SELECT COUNT (*) FROM film
WHERE title LIKE 'T%' AND raiting='G';

SELECT COUNT(country) FROM country
WHERE country LIKE '_____';

SELECT COUNT (city)from city
WHERE city ILIKE '%r';