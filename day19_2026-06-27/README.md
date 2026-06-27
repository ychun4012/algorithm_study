# 2026년 6월 27일 - DAY 11 리스트(배열) (일일 도전 과제)

## 감소하는 수 배열
start_num에서 end_num까지 1씩 감소하는 수 배열 만들기

### 풀이
ArrayList로 선언 후 i-- 로 감소하며 add

### 배운 것
- int 배열로 받으면 길이 계산 + 이중 for문 필요 → ArrayList가 더 깔끔!
- ArrayList → int 배열 변환 이제 외우기!
```java
  list.stream().mapToInt(Integer::intValue).toArray();
```