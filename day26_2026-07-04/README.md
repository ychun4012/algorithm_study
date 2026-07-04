# 2026년 7월 5일 - DAY 12 리스트(배열) (일일 도전 과제)

## 배열 슬라이싱
n에 따라 num_list를 다르게 슬라이싱

### 내 풀이
switch문으로 n에 따라 각 케이스를 분기해서 처리

### 더 나은 풀이
```java
int start = n == 1 ? 0 : slicer[0];
int end = n == 2 ? num_list.length - 1 : slicer[1];
int step = n == 4 ? slicer[2] : 1;
```

### 배운 것
- 조건마다 달라지는 부분(start, end, step)을 변수로 추출하면
  for문 하나로 모든 케이스를 처리 가능!
- 자연어 조건 속 규칙을 찾아 공통된 부분은 모으고
  다른 부분만 변수로 분리하는 것이 알고리즘적 사고력의 핵심
- step을 활용한 배열 길이 계산:
  `(end - start + step) / step`