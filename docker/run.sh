docker build -t music-pulse-backend .
docker stop mpback
docker run --rm -p 8080:8080 --name mpback -d music-pulse-backend .
docker ps -a
docker logs -f mpback