# 2026년 6월 6일 - DAY 6 조건문, 반복문 (일일 도전 과제)

## 마지막 원소 추가
num_list.length를 많이 사용하길래 변수에 담았다.
num_list보다 길이가 하나 더 큰 answer 배열에 num_list를 담고
조건에 따라 값을 추가하는 삼항연산자를 작성하였다.
다들 나와 비슷하게 했다 잘한듯 😊

### 배운 것
- 배열에 원소 추가할 때 기존보다 길이 +1인 새 배열 만들어서 복사하는 방식

## 조작 제어
control을 char 배열로 변환한 뒤 for문으로 원소들을 돌며
switch문으로 문자에 따라 n에 변화를 주었다.
오랜만에 switch문을 작성하니 작성법을 까먹어 문서들을 뒤져보았다.

### 배운 것
```java
switch(ch) {
    case 'w' -> n += 1;  // 화살표 방식 switch문
}
```

## 조작 복원
배열의 앞 원소와의 차이를 변수에 넣어두고
조건에 맞게 switch문으로 문자를 append했다.

### 배운 것
- `StringBuffer.append()` - 문자열 추가
- `StringBuffer.toString()` - String으로 변환 후 return
- 차이값(diff)을 switch의 조건으로 활용하는 아이디어!