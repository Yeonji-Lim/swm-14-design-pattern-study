# State Pattern

### 4개의 상태(`State`)

- `OFF` : 조명이 꺼져 있는 상태
- `level 1` : 조명이 1단계 밝기로 켜져 있는 상태
- `level 2` : 조명이 2단계 밝기로 켜져 있는 상태
- `level 3` : 조명이 3단계 밝기로 켜져 있는 상태

### 상태 변화
![img.png](img.png)
- `power`
  - 불이 켜져 있는 상태(`on`)라면 불이 꺼져 있는 상태(`off`)로
  - 불이 꺼져 있는 상태(`off`)라면 불이 켜져 있는 상태(`on`)로 변환해준다.
- `up`
  - 불이 켜져있는 상태라면 `level 1` → `level 2` → `level 3` → `level 1` → ... 로 변화한다.
  - 불이 꺼져있는 상태라면 아무런 변화가 발생하지 않는다.
