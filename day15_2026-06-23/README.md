# 2026년 6월 23일 - DAY 9 문자열 (일일 도전 과제)

## 부분 문자열 필터링
각 원소에서 s번 인덱스부터 길이 l만큼 잘라 k보다 큰 값만 담기

### 배운 것
- `substring(s, s+l)` - s부터 l길이만큼 자르려면 끝 인덱스는 s+l
- 결과 길이를 모를 때 ArrayList → stream으로 int 배열 변환

## 부분 문자열 이어붙이기
my_strings[i]에서 parts[i][0] ~ parts[i][1] 구간을 잘라 이어붙이기

### 배운 것
- `substring`의 끝 인덱스는 해당 인덱스 **전까지** 자르므로 +1 필요
- 성능을 위해 `StringBuffer` 사용

## 뒤의 n글자
문자열의 마지막 n글자 추출

### 배운 것
- 배열: `arr.length` (괄호 없음)
- String: `str.length()` (괄호 있음!)
- `substring(length - n, length)` - 뒤의 n글자 추출하는 깔끔한 방법

## 접미사 정렬
모든 접미사를 구해 사전순 정렬

### 배운 것
- `substring(i, my_string.length())` 반복으로 모든 접미사 생성
- `list.toArray(new String[0])` - ArrayList를 String 배열로 변환
- `Arrays.sort(answer)` - 배열 사전순 정렬