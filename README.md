## Avro schema inferrer

This tool can infer Avro schemas from a JSON payload. To build, run
```shell
mvn clean package -DskipTests
java -jar target/avro-schema-inferrer-1.0-SNAPSHOT.jar <input json>
```
