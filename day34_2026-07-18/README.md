# 2026년 7월 18일 - 프로세스 (공동과제)

## 프로세스
우선순위 기반 큐에서 특정 프로세스가 몇 번째로 실행되는지 찾기

### 풀이
1. queue에 `[원래인덱스, 우선순위]` 배열로 넣어 location 추적
2. 맨 앞 프로세스를 꺼내 queue에 남은 것 중 더 높은 우선순위가 있으면 다시 넣기
3. 없으면 실행(answer++) 후 location과 일치하면 return

### 핵심 아이디어
- Queue에 int[]를 넣어 인덱스 정보를 함께 관리!
```java
  queue.offer(new int[]{i, priorities[i]});
  // [0] = 원래 인덱스, [1] = 우선순위
```
- current[0] == location 으로 내가 찾는 프로세스인지 확인

### 배운 것
- Queue에 기본 타입 외에 배열도 넣을 수 있다
- for-each로 Queue 순회하며 최댓값 탐색 가능
```java
  for (int[] p : queue) {
      if (p[1] > max) max = p[1];
  }
```
- 문제 이해는 됐는데 코드로 옮기는 게 어려울 땐
  추적할 정보를 어떻게 저장할지부터 생각하기!