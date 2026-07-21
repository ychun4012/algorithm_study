-- 코드를 입력하세요
SELECT count(user_id) users
from user_info
where year(joined) = 2021 and age between 20 and 29;

-- 코드를 작성해주세요
select id, email, first_name, last_name
from DEVELOPER_INFOS 
where 'Python' in (SKILL_1, SKILL_2, SKILL_3)
order by id;

-- 코드를 작성해주세요
select count(id) fish_count
from fish_info
where length is null;