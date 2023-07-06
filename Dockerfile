# Stage 1: Build the application
FROM gradle:7.3.1-jdk17 as build

WORKDIR /home/gradle/project

COPY . .

RUN gradle build -x test

# Stage 2: Run the application
FROM eclipse-temurin:17-jre

WORKDIR /opt/techcampus

COPY --from=build /home/gradle/project/build/libs/jeju-backend-0.0.1-SNAPSHOT.jar .

USER nobody

EXPOSE 3000

ENV DATABASE_URL=jdbc:mariadb://localhost:3306/kakao

CMD ["java", "-jar", "kakao-0.0.1-SNAPSHOT.jar"]
