# 2026년 7월 12일 - 올바른 괄호 (공동과제)

## 올바른 괄호
괄호 문자열이 올바르게 짝지어졌는지 확인

### 풀이
- `(` 만나면 stack에 push
- `)` 만나면 pop
- 단, 스택이 비어있는데 `)` 가 나오면 바로 false
- 마지막에 스택이 비어있으면 true, 아니면 false

### 배운 것 - 스택 & 큐 & 덱 정리

## 스택 (Stack) - LIFO
```java
Stack<Integer> stack = new Stack<>();
// 또는 더 권장되는 방법
Deque<Integer> stack = new ArrayDeque<>();
```
| 메서드 | 설명 |
|--------|------|
| `push(value)` | 값 넣기 |
| `pop()` | 맨 위 값 꺼내기 |
| `peek()` | 맨 위 값 확인 (제거 안함) |
| `isEmpty()` | 비어있는지 확인 |

**사용 예시:** 뒤로가기, 괄호 짝 맞추기, 역순 처리

## 큐 (Queue) - FIFO
```java
Queue<Integer> queue = new ArrayDeque<>();
```
| 메서드 | 설명 |
|--------|------|
| `offer(value)` | 값 넣기 |
| `poll()` | 맨 앞 값 꺼내기 |
| `peek()` | 맨 앞 값 확인 (제거 안함) |
| `isEmpty()` | 비어있는지 확인 |

**사용 예시:** 순서대로 공평하게 처리할 때

## 덱 (Deque) - 앞뒤 양쪽 삽입/삭제
```java
Deque<Integer> deque = new ArrayDeque<>();
deque.addFirst(1);  // 앞에 넣기
deque.addLast(2);   // 뒤에 넣기
deque.pollFirst();  // 앞에서 꺼내기
deque.pollLast();   // 뒤에서 꺼내기
```

## 주의사항
- 비어있을 때 꺼내면 오류 → 항상 `isEmpty()` 먼저 확인!
- `pop()` - 비어있으면 예외 발생 💥
- `poll()` - 비어있으면 null 반환 (더 안전)
- Java에서 Stack보다 **ArrayDeque가 더 빠르고 권장됨**!