# spring-postgresql-docker
API SpringBoot Postgres + Docker

1. Build app & Dockerfile
mvn clean install

2. Run docker-compose
cd /Users/andrade.sampaio/Documents/GitHub/spring-postgresql-docker/

docker-compose up --build

Starts Postgresql
Starts Spring boot application

3. Test
Navigate to http://localhost:8080/book/data?id=5 and you should see: [{ID : 5,Title : SQLServer,Author :Olavo Souza }]

Docker Compose commands:
docker-compose up - create and start Docker containers
docker-compose up -d - create and start Docker cotainers in the background
docker-compose down - stop and destroy Docker cotainers
docker-compose start - start Docker containers
docker-compose stop - stop Docker containers
docker-compose logs -f - tailing logs of Docker cotainers
docker-compose ps - check status of Docker cotainers