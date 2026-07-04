# 2026년 7월 3일 - 완주하지 못한 선수 (공동과제)

## 완주하지 못한 선수
participant 중 completion에 없는 선수 한 명 찾기

### 풀이
1. participant를 HashMap에 저장 (key: 이름, value: 명수)
2. completion을 돌며 완주한 사람의 value -1
3. value가 1 이상인 사람이 완주 못한 선수

### 핵심 아이디어
- 동명이인 처리를 위해 단순 contains가 아닌 HashMap의 count 활용
- 완주한 사람은 value가 0, 못한 사람은 1

### 배운 것
- `map.getOrDefault(key, 0)` - key가 없으면 기본값 0 반환
- `map.containsKey(key)` - key 존재 여부 확인
- `map.keySet()` - map의 모든 key 순회
- HashMap은 중복 카운팅이 필요할 때 유용!
- 해시를 언제 써야하는지 다음 스터디에서 더 파악하기