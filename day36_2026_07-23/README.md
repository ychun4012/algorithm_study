# 2026년 7월 23일 - 더 맵게 (공동과제)

## 더 맵게
모든 음식의 스코빌 지수를 K 이상으로 만들기 위한 최소 섞기 횟수

### 풀이
1. PriorityQueue(최소 힙)에 전체 스코빌 지수 넣기
2. 맨 앞(최솟값)이 K 미만이면 두 개 꺼내 섞어서 다시 넣기
3. size가 1인데 K 미만이면 -1 return

### 핵심 아이디어
- 항상 가장 작은 두 값이 필요 → **PriorityQueue(최소 힙)** 사용!
- 꺼낸 값을 변수에 저장하지 않고 바로 offer로 넣어 코드 간결화
```java
  pq.offer(pq.poll() + (pq.poll() * 2));
```

### 배운 것
- `PriorityQueue<Integer> pq = new PriorityQueue<>()` - 기본이 최소 힙
- 최댓값 힙이 필요하면 `new PriorityQueue<>(Collections.reverseOrder())`
- 자연어로 로직을 먼저 정리하고 코드로 옮기는 습관 계속 유지하기!