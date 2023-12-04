# spring-mysql-example

settings project
```
1. java version is 17, (gradle default 17, project settings java is 17)
2. docker-compose up // settings your database
```


check error
```

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class

Action:
Consider the following:
	If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.

```

clear error
```
spring:
  jpa:
    hibernate:
      ddl-auto: update
      show-sql: true
  datasource:
    url: jdbc:mysql://localhost:3306/db_example2
    username: root
    password: root
    driver-class-name: com.mysql.cj.jdbc.Driver
  properties:
    hibernate:
      dialect: org.hibernate.dialect.MySQLDialect

위와 같이 mysql 로 hibernate 설정 필요 또는
gradle 빌드시 runtimeOnly 'com.h2database:h2' //런타임 및 테스트시 개발환경에서 필요하다면 사용
위 의존성 추가
```
