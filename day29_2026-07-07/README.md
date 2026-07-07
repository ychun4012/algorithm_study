# 2026년 7월 7일 - SELECT (SQL)

## 젊은 동물 조회
Aged가 아닌 동물 조회

### 배운 것
- `!=` 또는 `<>` - 같지 않음 조건

## 동물 아이디와 이름 조회
전체 동물을 ANIMAL_ID 오름차순으로 조회

## 이름 순 + 날짜 역순 정렬
이름이 같으면 보호 시작일이 나중인 동물을 먼저 출력

### 배운 것
- `ORDER BY NAME, DATETIME DESC` - 다중 정렬에서 컬럼마다 방향 따로 지정 가능

## 가장 먼저 들어온 동물
DATETIME이 가장 작은 동물의 이름 조회

### 배운 것
- WHERE절 서브쿼리로 MIN값과 일치하는 행 찾기
```sql
  WHERE DATETIME = (SELECT MIN(DATETIME) FROM ANIMAL_INS)
```
- `ORDER BY DATETIME LIMIT 1` 로도 가능!