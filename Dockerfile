FROM openjdk:24
RUN mkdir -p /tmp/org/example
COPY src/main/java/org/example/Main.java /tmp/org/example/
COPY src/main/java/org/example/myList.java /tmp/org/example/
WORKDIR /tmp
RUN javac org/example/*.java
ENTRYPOINT ["java", "org.example.Main"]
EXPOSE 8080

