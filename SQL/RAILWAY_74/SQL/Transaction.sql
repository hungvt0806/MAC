-- 1. Start a new transaction  
  
START TRANSACTION;  
  
-- 2. Get the highest income  
  
SELECT @income:= MAX(income) FROM employees;  
  
-- 3. Insert a new record into the employee table  
  
INSERT INTO employees(emp_id, emp_name, emp_age, city, income)   
VALUES (111, 'Alexander', 45, 'California', 70000);  
  
-- 4. Insert a new record into the order table  
  
INSERT INTO Orders(order_id, prod_name, order_num, order_date)   
VALUES (6, 'Printer', 5654, '2020-01-10');  
  
-- 5. Commit changes      
COMMIT;  