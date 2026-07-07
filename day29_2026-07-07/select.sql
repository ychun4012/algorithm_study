-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
from ANIMAL_INS
where INTAKE_CONDITION != 'Aged';

-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
from ANIMAL_INS
order by ANIMAL_ID;

-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, DATETIME
from ANIMAL_INS
order by NAME, DATETIME desc;

-- 코드를 입력하세요
SELECT name
from animal_ins
where datetime = (select min(datetime) from animal_ins);