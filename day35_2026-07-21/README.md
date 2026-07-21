# 2026년 7월 21일 - SELECT (SQL)

## 2021년 가입한 20대 회원 수
2021년 가입 + 나이 20~29세 회원 수 조회

### 배운 것
- `YEAR(날짜컬럼)` - 날짜에서 연도 추출
- `BETWEEN 20 AND 29` - 범위 조건

## Python 스킬 보유 개발자 조회
SKILL_1, SKILL_2, SKILL_3 중 하나라도 Python이면 조회

### 배운 것
- `'Python' IN (SKILL_1, SKILL_2, SKILL_3)` - 여러 컬럼 중 하나와 일치하는지 확인
  OR 조건 여러 개 대신 깔끔하게 처리 가능!

## 10cm 이하 물고기 수
길이가 10cm 이하인 물고기는 LENGTH가 NULL이므로 NULL 개수 카운트

### 배운 것
- 문제 조건을 잘 읽기! 10cm 이하 = LENGTH IS NULL
- `COUNT(컬럼)` 은 NULL을 세지 않으므로
  NULL인 행을 세려면 `WHERE LENGTH IS NULL` 후 COUNT 사용