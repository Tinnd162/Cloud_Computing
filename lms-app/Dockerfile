# FROM maven:3.8.1-adoptopenjdk-11 as build
# RUN mkdir -p /lms-app
# WORKDIR /lms-app
# # COPY pom.xml /lms-app
# # COPY src /lms-app
# COPY . .
# RUN mvn -f pom.xml clean package

# FROM adoptopenjdk:11-jdk-hotspot
# COPY --from=build /lms-app/target/*.jar lms-app.jar
# EXPOSE 8080
# ENTRYPOINT ["java","-jar","lms-app.jar"]

FROM maven:3.8.1-adoptopenjdk-11
RUN  mkdir /lms-app
WORKDIR /lms-app
COPY . .
EXPOSE 8080
CMD ["mvn", "spring-boot:run"]