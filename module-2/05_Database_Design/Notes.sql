CREATE TABLE students (
    student_id varchar(32) primary key,
    first_name carchar(35) not null,
    last_name varchar(25) not null
)

select * from students

INSERT INTO students VALUES('ABC', 'John', 'Fulton');



CREATE TABLE ourtable (
  id serial primary key,
  name varchar(10)
);

-- Can select the next sequence to use using nextval()
SELECT nextval('outrable_id_seq');

-- Can use nextval() as a subquery in an insert
INSERT INTO ourtable (id, name) VALUES ( (nextval('ourtable_id_seq')), 'Steve');

-- Can use DEFAULT to get the next value
INSERT INTO ourtable(id, name) VALUES (DEFAULT, 'John');

-- Can ignore the column to get the next sequence
INSERT INTO ourtable (name) VALUES ('Andrew');

-- Can add the next number manually
INSERT INTO ourtable (ID, NAME) values (14, 'Stephanie');

-- But if the number you use has not yet been in the sqeuence, it will cause a confluct when that number is used in the dequence
INSERT INTO ourtable (name) VALUES ('Rachelle');

-- Create a custom sequence and optionally set its initial value
CREATE SEQUENCE our_custom_sequence START 101;

SELECT nextval('our_custom_sequence');

-- Can alter a sequence to restart it OR chance its increment
ALTER SEQUENCE our_custom_sequence RESTARD 1000 INCREMENT BY 2;

-- Drop a sequence
DROP SEQUENCE our_custom_sequence;

START TRANSACTION;
        INSERT INTO ourtable (name) VALUES ('Ben');
ROLLBACK
        
SELECT * FROM ourtable;