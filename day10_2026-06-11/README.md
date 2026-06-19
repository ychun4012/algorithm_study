# 2026년 6월 11일 - SELECT (SQL)

## 2021년 인문 도서 조회
연도와 카테고리 조건으로 도서 조회

### 배운 것
- `EXTRACT(YEAR FROM 날짜컬럼)` - 날짜에서 연도 추출
- `ORDER BY 2` - 컬럼 번호로 정렬 가능

## 3월생 여성 회원 조회
전화번호 NULL 제외, 생일 월 조건 필터링

### 배운 것
- `IS NOT NULL` - NULL 제외 조건
- `EXTRACT(MONTH FROM 날짜컬럼)` - 날짜에서 월 추출

## 진료과 의사 조회
흉부외과 또는 일반외과 의사 조회

### 배운 것
- `IN ('cs', 'gs')` - 여러 값 조건을 OR 대신 간단하게

## 12세 이하 여자 환자 조회
전화번호 없으면 'NONE' 출력

### 배운 것
- `COALESCE(컬럼, '대체값')` - NULL이면 대체값으로 출력

## 2022년 10월 게시글 + 댓글 조회
두 테이블 조인해서 게시글과 댓글 함께 조회

### 배운 것
- `BETWEEN '날짜1' AND '날짜2'` - 날짜 범위 조건
- 같은 컬럼명이 두 테이블에 있을 때 테이블 별칭으로 구분 (`b.BOARD_ID`, `r.WRITER_ID`)

## 강원도 식품공장 조회
주소 문자열로 지역 필터링

### 배운 것
- `LIKE '강원도%'` - 특정 문자열로 시작하는 조건

## 서울 식당 평균 리뷰 점수 조회
식당별 평균 점수를 서브쿼리로 구해서 JOIN

### 배운 것
- FROM절에서 서브쿼리로 집계한 결과를 JOIN할 수 있다!
```sql
  JOIN (
      SELECT REST_ID, ROUND(AVG(REVIEW_SCORE), 2) SCORE
      FROM REST_REVIEW
      GROUP BY REST_ID
  ) r ON (info.REST_ID = r.REST_ID)
```
- SELECT절 서브쿼리보다 FROM절 서브쿼리가 GROUP BY가 필요한 집계에 더 적합