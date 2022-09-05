SELECT city, country FROM country
LEFT JOIN city 
ON city.country_id = country.country_id;

SElECT payment.payment_id, customer.first_name, customer.last_name FROM payment
LEFT JOIN customer ON customer.customer_id= payment.customer_id;

SElECT rental.rental_id, customer.first_name, customer.last_name FROM customer
FULL JOIN rental ON customer.customer_id= rental.rental_id;