FROM maven:3.8-openjdk-17

WORKDIR /automation

COPY . .

RUN mvn dependency:resolve

CMD ["mvn", "test"]
