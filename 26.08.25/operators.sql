CREATE DATABASE Comp;
USE Comp;
CREATE TABLE Employees (
    EmpID INT PRIMARY KEY,
    Namee VARCHAR(50),
    Age INT,
    Department VARCHAR(30),
    Salary DECIMAL(10,2),
    City VARCHAR(30)
);

INSERT INTO employees (EmpID,Namee, Age, Department, Salary, City) VALUES
(1,'Alice', 25, 'Finance', 45000, 'Mumbai'),
(2,'Bob', 32, 'IT', 60000, 'Delhi'),
(3,'Charlie', 28, 'HR', 40000, 'Mumbai'),
(4,'David', 35, 'Finance', 75000, 'Bangalore'),
(5,'Eva', 29, 'IT', 55000, 'Chennai'),
(6,'Vrank', 40, 'HR', 380000, 'Delhi'),
(7,'Grace', 26, 'Finance', 50000, 'Mumbai'),
(8,'Henry', 31, 'IT', 62000, 'Bangalore');


#Usage of Comparison Operators
select * from employees where salary>50000  and department='Finance';
select * from employees where city!='Mumbai' and city!='Bangalore';
select * from employees where age>=30 and age<40;
select * from employees where department='Finance' or department='IT';
select * from employees where EmpID in(1,4,8) and department='Finance';
select * from employees where EmpID not in(1,3,5,7) and age>=20;

#Find workers not in HR or Finance with salary between 70000 and 300000
select * from employees where Salary not between 70000 and 300000 or department not in('HR','Finance');
# Find workers not in Finance with salary < 100000.
select * from employees where department not in('Finance',salary<100000);
# Find workers with first name starting with 'V' and salary greater than or equal to 200000.
select * from employees where namee like 'V%' and salary>=200000;
# Find the average salary in the Admin department
select avg(salary)
from employees where department=('Finance');

# Total salary for HR and Admin departments combined.
select sum(salary)
from employees where department in ('HR','Finance');

#Count employees whose first name starts with 'V'
select count(namee)
from employees where namee like ('V%');

# Total salary of employees with salary between 50000 and 200000.
select sum(salary)
from employees where salary between 50000 and 200000;

#union
select salary,department
from employees
where department='IT'
union
select salary,department
from employees
where department='Finance';

#union all
select salary,department
from employees
where department='IT'
union all
select salary,department
from employees
where department='Finance';

#case
select namee,salary,
case 
when salary >=300000 then "rich"
when salary >=100000 and salary<300000 then "middle"
else"poor"
end
as 
statusbasedonsalary
from employees;




