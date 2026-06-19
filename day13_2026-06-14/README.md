# 2026년 6월 14일 - DAY 8 조건문, 문자열 (일일 도전 과제)

## 구간 뒤집기
queries의 각 [s, e] 범위를 순서대로 뒤집어 문자열에 반영

### 배운 것
- `new StringBuilder(string).reverse().toString()` - 문자열 뒤집기
- `StringBuilder.substring(s, e + 1)` - 구간 추출
- `StringBuilder.replace(s, e + 1, 새문자열)` - 구간 교체
- String은 불변이라 수정할 때 StringBuilder로 변환해서 작업하기!