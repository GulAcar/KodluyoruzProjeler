SELECT city, country FROM city
INNER JOIN country 
ON city.country_id = country.country_id;

SElECT payment.payment_id, customer.first_name, customer.last_name FROM customer
INNER JOIN payment ON customer.customer_id= payment.customer_id;

SElECT rental.rental_id, customer.first_name, customer.last_name FROM customer
INNER JOIN rental ON customer.customer_id= rental.rental_id;