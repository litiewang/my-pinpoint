
## Install
```
$ mvnw -P pinpoint-mongodb-plugin-testweb install -Dmaven.test.skip=true
```

## Run
```
$ mvnw -P pinpoint-mongodb-plugin-testweb spring-boot:start
```
You can then access here: http://localhost:18080/

## Stop
```
$ mvnw -P pinpoint-mongodb-plugin-testweb spring-boot:stop
```
