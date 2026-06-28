# 2026년 6월 28일 - DAY 11 리스트(배열) (일일 도전 과제)

## 인덱스 글자 삭제
indices에 해당하는 인덱스의 글자를 지우고 이어 붙이기

### 풀이
앞에서부터 지우면 index가 밀리는 문제 발생
→ Arrays.sort()로 오름차순 정렬 후 **뒤에서부터** 삭제!

### 배운 것
- `deleteCharAt(i)` - StringBuffer/StringBuilder에서 i번째 글자 삭제
- 앞에서 삭제하면 뒤 인덱스가 밀리므로 **뒤에서부터 삭제**하는 것이 핵심!
- `Arrays.sort(indices)` - int 배열 오름차순 정렬