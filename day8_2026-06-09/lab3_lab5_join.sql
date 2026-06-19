========================================
		JOIN
========================================

1.직원들의 이름과 직급명(job_title)을 조회하시오.
select first_name || ' ' || last_name 이름, job_title
from employees join jobs using(job_id);




2.부서이름과 부서가 속한 도시명(city)을 조회하시오.
select department_name, city
from departments join locations using(location_id);




3. 직원의 이름과 근무국가명을 조회하시오. (employees, departments, locations,countries)
select first_name || ' ' || last_name 이름, country_name
from employees join departments using(department_id)
                join locations using (location_id)
                join countries using (country_id);


4. 직책(job_title)이 'manager' 인 사람의 이름, 직책, 부서명을 조회하시오.
select first_name || ' ' || last_name 이름, job_title, department_name
from employees join jobs using (job_id)
                join departments using (department_id)
where job_title like '%Manager';



5. 직원들의 이름, 입사일, 부서명을 조회하시오.
select first_name || ' ' || last_name 이름, hire_date, department_name
from employees join departments using (department_id);


6. 직원들의 이름, 입사일, 부서명을 조회하시오.
단, 부서가 없는 직원이 있다면 그 직원정보도 출력결과에 포함시킨다.
select first_name || ' ' || last_name 이름, hire_date, department_name
from employees left join departments using (department_id);



7. 직원의 이름과 직책(job_title)을 출력하시오.
단, 사용되지 않는 직책이 있다면 그 직책정보도 출력결과에 포함시키시오.
select first_name || ' ' || last_name 이름, job_title
from employees right join jobs using (job_id);


-- SELF JOIN
1. 직원의 이름과 관리자 이름을 조회하시오.
select 직원.first_name || ' ' || 직원.last_name 직원이름, 관리자.first_name || ' ' || 관리자.last_name 관리자이름
from employees 직원 join employees 관리자 on(직원.manager_id = 관리자.employee_id);



2. 직원의 이름과 관리자 이름을 조회하시오.
관리자가 없는 직원정보도 모두 출력하시오.
select 직원.first_name || ' ' || 직원.last_name 직원이름, 관리자.first_name || ' ' || 관리자.last_name 관리자이름
from employees 직원 left join employees 관리자 on(직원.manager_id = 관리자.employee_id);



3. 관리자 이름과 관리자가 관리하는 직원의 수를 조회하시오.
단, 관리직원수가 3명 이상인 관리자만 출력되도록 하시오.
select 관리자.first_name || ' ' || 관리자.last_name 관리자이름, count(직원.employee_id)
from employees 직원 join employees 관리자 on(직원.manager_id = 관리자.employee_id)
group by 관리자.first_name || ' ' || 관리자.last_name
having count(직원.employee_id) >= 3;



