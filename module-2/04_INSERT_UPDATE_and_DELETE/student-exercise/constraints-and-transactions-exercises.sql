-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
SELECT * FROM actor;
INSERT INTO actor(first_name, last_name)
VALUES ('Hampton Avenue', 'Lisa Byway');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

SELECT * FROM film WHERE title = 'Euclidean PI';


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor (film_id, actor_id)
VALUES (1001, 201);

INSERT INTO film_actor (film_id, actor_id)
VALUES (1001, 202);

SELECT * FROM film_actor WHERE film_id = 1001;


-- 4. Add Mathmagical to the category table.
INSERT INTO category(name)
VALUES ('Mathemagical');


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
INSERT INTO film_category (film_id, category_id)
VALUES(1001, 17);

UPDATE film_category
SET category_id = 17
WHERE film_id IN
(SELECT film_id from film where title in ('Euclidean PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE'));
 
SELECT * FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.NAME = 'Mathmagical';


-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

UPDATE film
SET rating = 'G'
WHERE film_id IN
 (SELECT film_id FROM film_category WHERE film_category.category_id = 17);
 
 SELECT * FROM film
 JOIN film_category ON film.film_id = film_category.film_id
 JOIN category ON film_category.category_id = category.category_id
 WHERE category.name = 'Mathmagical';

-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory (film_id, store_id) VALUES (1001, 1);
INSERT INTO inventory (film_id, store_id) VALUES (1001, 2);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
DELETE FROM film
WHERE film_id = 1001 AND title='Euclidean PI';
-- Did not succeed, delete "violates foreign key constraint "film_actor_film_id_fkey" on table "film_actor""

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
DELETE FROM category
WHERE name = 'Mathemagical';
-- No, it returned: "--ERROR: update or delete on table "category" violates foreign key constraint "film_category_category_id_fkey" on table "film_category"
-- Detail: Key (category_id)=(17) is still referenced from table "film_category"

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
DELETE FROM film_category
WHERE category_id in
 (SELECT category.category_id FROM category WHERE category.name = 'Mathmagical');
-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
