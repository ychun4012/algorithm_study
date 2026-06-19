# 2026년 6월 8일 - DAY 7 반복문 (일일 도전 과제)

## 숫자 범위 배열
answer 배열의 크기를 지정하고 for문으로 배열에 숫자를 차례대로 담았다.

### 배운 것
- 따로 index 변수를 만들지 않고 i를 index로 활용하는 방법
```java
  answer[i] = start + i;
```

## 콜라츠 수열
길이를 모르기 때문에 ArrayList를 사용했다.
먼저 list에 n을 더하고 조건에 따라 n이 1이 될 때까지 while문으로 반복.
마지막에 stream을 사용해 list를 int 배열로 변환하였다.

### 배운 것
- 길이를 모를 때는 `ArrayList` 사용!
- `list.stream().mapToInt(Integer::intValue).toArray()` - ArrayList를 int 배열로 변환