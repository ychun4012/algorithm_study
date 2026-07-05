-- 코드를 입력하세요
SELECT user_id, product_id 
from ONLINE_SALE
GROUP BY user_id, product_id
HAVING count(*) > 1
order by user_id, product_id desc;

-- 코드를 입력하세요
SELECT *
from ANIMAL_INS
order by ANIMAL_ID;

-- 코드를 입력하세요
SELECT name, datetime
from ANIMAL_INS
order by ANIMAL_ID desc;

-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
from ANIMAL_INS
where INTAKE_CONDITION = 'Sick'
order by ANIMAL_ID;