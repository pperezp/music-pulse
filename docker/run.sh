docker build -t music-pulse-backend .
docker stop music-pulse-backend
docker run --rm -p 8080:8080 --name music-pulse-backend -d music-pulse-backend .
docker ps -a
docker logs -f music-pulse-backend