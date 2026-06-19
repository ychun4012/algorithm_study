SELECT BOOK_ID, PUBLISHED_DATE
from book
where extract(year from PUBLISHED_DATE) = 2021 and CATEGORY = '인문'
order by 2;

SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_OF_BIRTH
from MEMBER_PROFILE
where TLNO is not null and extract(month from DATE_OF_BIRTH) = 3 and gender = 'w';

SELECT DR_NAME, DR_ID, MCDP_CD, HIRE_YMD
from DOCTOR
where MCDP_CD in ('cs', 'gs')
order by HIRE_YMD desc, DR_NAME;

SELECT PT_NAME, PT_NO, GEND_CD, AGE, COALESCE(TLNO, 'NONE')
from patient
where age <= 12 and GEND_CD = 'W'
order by age desc, PT_NAME;

SELECT TITLE, b.BOARD_ID, REPLY_ID, r.WRITER_ID, r.CONTENTS, r.CREATED_DATE
from USED_GOODS_BOARD b join USED_GOODS_REPLY r on (b.BOARD_ID = r.BOARD_ID)
where b.CREATED_DATE between '2022-10-01' and '2022-10-31'
order by r.CREATED_DATE, TITLE;

SELECT FACTORY_ID, FACTORY_NAME, ADDRESS
from FOOD_FACTORY
where ADDRESS like '강원도%'
order by 1;

SELECT distinct info.REST_ID, REST_NAME, FOOD_TYPE, FAVORITES, ADDRESS, r.SCORE 평균점수
from REST_INFO info join (
                            select REST_ID, round(avg(REVIEW_SCORE), 2) SCORE
                            from REST_REVIEW
                            group by REST_ID
                            ) r on (info.REST_ID = r.REST_ID)
where ADDRESS like '서울%'
order by 평균점수 desc, FAVORITES desc;