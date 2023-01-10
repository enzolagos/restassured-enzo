FROM maven:3.6.3-jdk-11
COPY . .
RUN mvn install -Dmaven.test.skip
CMD mvn test -q