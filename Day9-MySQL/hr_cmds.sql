use hr;
show tables;
# Display the first name, last name, department name, and city of all employees.

# JOINS QUESTIONS

# 1. Joining / retrieving info from 3 different tables

SELECT 
    e.first_name,
    e.last_name,
    d.department_name,
    l.city
FROM employees e
JOIN departments d 
    ON e.department_id = d.department_id
JOIN locations l 
    ON d.location_id = l.location_id;


# 2. List all employees along with their manager’s name.

select e1.first_name as employee, e2.first_name as manager 
from employees e1 
JOIN employees e2 
on e1.manager_id = e2.employee_id;

#subQuery
# 3. Find the names of employees who work in the same department as ‘Nancy Greenberg’.

SELECT e.first_name, e.last_name
FROM employees e
WHERE e.department_id = (
    SELECT department_id
    FROM employees
    WHERE first_name = 'Nancy'
      AND last_name = 'Greenberg'
);


# 4. Show employees who work in the same city as their manager.

SELECT 
    e.first_name AS employee,
    m.first_name AS manager
FROM employees e
JOIN employees m 
    ON e.manager_id = m.employee_id
JOIN departments ed 
    ON e.department_id = ed.department_id
JOIN departments md 
    ON m.department_id = md.department_id
WHERE ed.location_id = md.location_id;

# 5. List all employees whose job title is the same as their manager’s.

SELECT 
    e.first_name AS employee,
    m.first_name AS manager,
    e.job_id
FROM employees e
JOIN employees m 
    ON e.manager_id = m.employee_id
WHERE e.job_id = m.job_id;

######################################################################################

# AGGREGATE FUNCTION QUESTIONS

#1. Display the avg sal for each job title, only for jobs with more than 3 employees

SELECT j.job_title, AVG(e.salary) AS avg_salary
FROM employees e
JOIN jobs j 
    ON e.job_id = j.job_id
GROUP BY j.job_title
HAVING COUNT(e.employee_id) > 3;

#2. Find the department that has the highest salary

SELECT d.department_name, MAX(e.salary) AS Max_sal
FROM employees e
JOIN departments d
	ON e.department_id = d.department_id
GROUP BY department_name
ORDER BY Max_sal desc
limit 1;

#3. List each location's total employee count and average salary

SELECT count(e.employee_id) AS EMP_COUNT, avg(e.salary) AS AVG_SAL , l.city AS LOC
FROM employees e
JOIN departments d
ON e.department_id = d.department_id
JOIN locations l
	ON d.location_id = l.location_id
GROUP BY l.city;

#4. Show the top 3 departments by total salary expenditure.

SELECT d.department_name, SUM(e.salary) AS TOTAL_SAL_EXPENSE
FROM employees e
JOIN departments d
	ON e.department_id = d.department_id
GROUP BY department_name
ORDER BY TOTAL_SAL_EXPENSE DESC limit 3;

#######################################################################

# SUBQUERIES QUESTIONS

#1. Find employees who earn more than the avg salary of their department

select e1.first_name, e1.salary
from employees e1
where e1.salary > (select AVG(e2.salary) 
				   FROM employees e2 
                   WHERE e2.department_id = e1.department_id);

#2. Display employees whose salary is greater than all salaries of the employees in the 'IT' department

SELECT e.first_name, e.salary, d.department_name
FROM employees e
JOIN departments d 
	ON e.department_id = d.department_id
WHERE e.salary > (
    SELECT MAX(e2.salary)
    FROM employees e2
    JOIN departments d2 ON e2.department_id = d2.department_id
    WHERE d2.department_name = 'IT'
);

#3. List departments that have no employees.

/* SELECT d.department_name
FROM departments d
LEFT JOIN employees e ON d.department_id = e.department_id
GROUP BY d.department_name
HAVING COUNT(e.employee_id) = 0;
*/

SELECT department_name
FROM departments
WHERE department_id NOT IN (
    SELECT DISTINCT department_id
    FROM employees
    WHERE department_id IS NOT NULL
);

#4. Display all the employees hired after the employee with the highest salary was hired.

SELECT e.first_name, e.hire_date
FROM employees e
WHERE e.hire_date > (SELECT e2.hire_date
					 FROM employees e2
                     ORDER BY e2.salary DESC LIMIT 1);
# (OR)

#Corelated SubQuery

SELECT e.first_name, e.hire_date
FROM employees e
WHERE e.hire_date > (SELECT hire_date
					 FROM employees
                     WHERE salary = (SELECT MAX(salary) FROM employees));






    
    
    
    
    
    
    
    
    