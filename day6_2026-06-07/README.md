# 2026년 6월 7일 - DAY 6 조건문, 반복문 (일일 도전 과제)

## 배열 원소 swap
문제 이해가 어려워 AI의 도움을 받았다.
for문으로 queries의 length만큼 돌며 arr index에 쿼리의 값을 넣어 swap하였다.

### 배운 것
- swap의 기본 패턴
```java
  temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
```
- 2차원 배열 접근: `queries[i][0]`, `queries[i][1]`