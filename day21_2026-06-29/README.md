# 2026년 6월 29일 - 기능 개발 (공동과제)

## 기능 개발
각 배포마다 몇 개의 기능이 함께 배포되는지 계산

### 풀이
1. 각 기능의 배포까지 걸리는 일수 계산 후 Queue에 저장
2. Queue를 돌며 앞 기능의 일수보다 작거나 같은 뒤 기능들을 묶어 count

### 핵심 아이디어
- `Math.ceil((100.0 - progresses[i]) / speeds[i])` - 올림으로 실제 걸리는 일수 계산
  - 2.3일 → 3일 (소수점이 있으면 하루가 더 필요하기 때문)
- 뒤 기능의 일수 ≤ 앞 기능의 일수 → 함께 배포!
- `queue.peek()` - 꺼내지 않고 맨 앞 원소 확인

### 배운 것
- `Queue<Integer> queue = new ArrayDeque<>()` - Queue 선언 방법
- `queue.offer(값)` - 삽입
- `queue.poll()` - 맨 앞 원소 꺼내기
- `queue.peek()` - 맨 앞 원소 확인 (꺼내지 않음)
- `queue.isEmpty()` - 비어있는지 확인