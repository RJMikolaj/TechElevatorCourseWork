DROP TABLE IF EXISTS employee
DROP TABLE IF EXISTS department
DROP TABLE IF EXISTS project


CREATE TABLE employee (
	employee_number integer NOT NULL,
	job_title integer NOT NULL,
	first_name varchar(32) NOT NULL,
	last_name varchar(32) NOT NULL,
	gender varchar(16),
	birthday integer NOT NULL,
	hire_date integer NOT NULL,
	department_id integer NOT NULL,
	CONSTRAINT pk_employees_employee_number PRIMARY KEY (employee_number),
	CONSTRAINT fk_employees_job_title_id FOREIGN KEY (job_title_id) REFERENCES job_titles (id),
	CONSTRAINT fk_employees_birthday_id FOREIGN KEY (birthday_id) REFERENCES dates (id),
	CONSTRAINT fk_employees_hire_date_id FOREIGN KEY (hire_date_id) REFERENCES dates (id),
	CONSTRAINT fk_employees_department_id FOREIGN KEY (department_id) REFERENCES departments (department_number)
);

CREATE TABLE department (
        department_number integer NOT NULL
        name varchar(32) NOT NULL
        employee_count(99) integer NOT NULL

CREATE TABLE project (
	project_number integer NOT NULL,
	name varchar(64) NOT NULL,
	start_date integer NOT NULL,
	employee_count(99) integer NOT NULL
	CONSTRAINT pk_projects_project_number PRIMARY KEY (project_number)
);


INSERT INTO departments (department_number, name) VALUES (1, 'Daypersons');
INSERT INTO departments (department_number, name) VALUES (2, 'NightPersons');
INSERT INTO departments (department_number, name) VALUES (3, 'Masters of Karate');

SELECT setval(pg_get_serial_sequence('departments', 'department_number'), 4);

INSERT INTO dates (id) VALUES (1);
INSERT INTO dates (id) VALUES (2);
INSERT INTO dates (id) VALUES (3);
INSERT INTO dates (id) VALUES (4);

INSERT INTO project (project_number, name, start_date_id) VALUES (1, 'Karate', 1);
INSERT INTO project (project_number, name, start_date_id) VALUES (2, 'Friendship', 2);
INSERT INTO project (project_number, name, start_date_id) VALUES (3, 'Doing Good for Strangers', 3);
INSERT INTO project (project_number, name, start_date_id) VALUES (4, 'Karate But With The Mind', 4);

SELECT setval(pg_get_serial_sequence('project', 'project_number'), 5);

INSERT INTO job_titles (id, title) VALUES (1, 'Friendship Ninja');
INSERT INTO job_titles (id, title) VALUES (2, 'Chief Executive Pal ');
INSERT INTO job_titles (id, title) VALUES (3, 'Accountabilibuddy');
INSERT INTO job_titles (id, title) VALUES (4, 'Master of the Custodial Arts');

SELECT setval(pg_get_serial_sequence('job_titles', 'id'), 5);


INSERT INTO employee (employee_number, job_title, first_name, last_name, gender, birthday, hire_date, department_id) VALUES (1, 1, 'Byron', 'Sirknee', 'Male', 5, 5, 1);
INSERT INTO employee (employee_number, job_title, first_name, last_name, gender, birthday, hire_date, department_id) VALUES (2, 1, 'Annie', 'Tao', 'Female', 6, 6, 1);
INSERT INTO employee (employee_number, job_title, first_name, last_name, gender, birthday, hire_date, department_id) VALUES (3, 2, 'Graze', 'Hooper', 'Female', 7, 7, 1);
INSERT INTO employee (employee_number, job_title, first_name, last_name, gender, birthday, hire_date, department_id) VALUES (4, 2, 'Aldon', 'Touring', 'Male', 8, 8, 1);
INSERT INTO employee (employee_number, job_title, first_name, last_name, gender, birthday, hire_date, department_id) VALUES (5, 4, 'Jerry', 'Dialson', 'Male', 9, 9, 2);
INSERT INTO employee (employee_number, job_title, first_name, last_name, gender, birthday, hire_date, department_id) VALUES (6, 4, 'Nina', 'McNetwork', 'Female', 10, 10, 2);
INSERT INTO employee (employee_number, job_title, first_name, last_name, gender, birthday, hire_date, department_id) VALUES (7, 3, 'Pablo', 'Powerpoint', 'Male', 11, 11, 3);
INSERT INTO employee (employee_number, job_title, first_name, last_name, gender, birthday, hire_date, department_id) VALUES (8, 3, 'Dominique', 'DeMemo', 'Female', 12, 12, 3);

SELECT setval(pg_get_serial_sequence('dates', 'id'), 13);
SELECT setval(pg_get_serial_sequence('employees', 'employee_number'), 9);

INSERT INTO projects_employees (projects_id, employees_id) VALUES (1, 5);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (1, 8);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (2, 3);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (2, 1);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (3, 4);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (3, 7);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (3, 6);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (4, 2);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (4, 8);

COMMIT;

select * from employees
join job_titles on employees.job_title_id = job_titles.id
join departments on employees.department_id = departments.department_number;

select * from project
join employees on projects_employees.employees_id = employees.employee_number
join projects on projects_employees.projects_id = projects.project_number;