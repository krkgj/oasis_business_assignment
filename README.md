# 도서 API

### Spring Boot, JPA, Querydsl, H2Base, Swaager를 사용하여 제작 중입니다..

### 미완성하였습니다..

---

### 1. 도서 조회

#### Request

##### url

```http
GET /books?author="작가이름"
```

##### Response

```json
- 성공
{
  "code": "200", // 응답 코드
  "message": "OK.", // 응답 메세지
  "result": BookDto List // 도서 정보를 리턴
}
```

```json
- 실패
{
  "code": "100", // 응답 코드
  "message": "Fail" // 응답 메세지
}
```

---

### 2. 공급도서 상세조회

#### url

```http
GET /supply-books
```

#### Request

```json

```

#### Response

##### 성공

```json
{
  "code": "200", // 응답 코드
  "message": "OK", // 응답 메세지
  "result": [
      SupplyBookDto List
  ]
}
```

##### 실패

```json
{
  "code": "100", // 응답 코드
  "message": "Fail", // 응답 메세지
  "result": [
      SupplyBookDto List
  ]
}
```

.....
