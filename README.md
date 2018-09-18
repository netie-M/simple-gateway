# simple-gateway

Actuator:
若需要正确返回值，需要保证endpoint已开启且已允许暴露该链接


management:
  endpoint:
    env:
      enabled: false  #是否开启指定endpoint
  endpoints:
    enabled-by-default: true  #是否启用各endpoint的默认值，
    web:
      exposure:
        include: "*"  #是否允许暴露链接，默认值为：info, health
		
		
		
参考链接：
https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html