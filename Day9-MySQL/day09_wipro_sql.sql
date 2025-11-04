# create database wipro;
show databases;
use wipro;

# Write an SQL query to create a table named Students with columns: 
# student_id (INT, Primary Key), name (VARCHAR(50)), age (INT), course (VARCHAR(30))

CREATE TABLE Students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    course VARCHAR(30)
);
drop table Students;

desc Students;

insert into Students (student_id, name, age, course)
values
(1, 'Veda', 23, 'Python'),
(2, 'Vishnu', 22, 'Java'),
(3, 'Datta', 21, '.net'),
(4, 'Nikhil', 24, 'front-end');

insert into Students values(5, 'Karthikeyan', 22, 'SolidWorks');

ALTER TABLE Students
ADD email VARCHAR(100);

ALTER TABLE Students
MODIFY age SMALLINT;

select * from Students;

# Write a command to rename the table Students to CollegeStudents.
# Write a command to remove the column course from the Students table.
# Insert 5 Rows In the table =- ALready done
# Write an SQL query to delete all data from the CollegeStudents table but keep the structure.

RENAME TABLE Students to CollegeStudents;

alter table CollegeStudents
drop column course;

SET SQL_SAFE_UPDATES = 0;

TRUNCATE TABLE CollegeStudents;

desc collegestudents;

select * from collegestudents;












