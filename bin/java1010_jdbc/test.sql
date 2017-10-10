SELECT d.department_id, d.department_name, e.employee_id, e.first_name, e.salary
FROM departments d, employees e
WHERE d.department_id = e.department_id
ORDER BY d.department_id

SELECT e.employee_id, e.first_name, e.salary, d.department_id, d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id
ORDER BY e.department_id