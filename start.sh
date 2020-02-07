#! /bin/bash
CWD=$(pwd)

check_result() {
  if [ $1 -eq 0 ]
  then
    echo "$2 OK"
  else
    echo "$2 FAILED"
	killall java &> /dev/null
	exit $1
  fi
}

rm -f *.log
SECONDS=0;
echo "STARTING ALL...";

./mvnw clean deploy -P docker &> $CWD/build.log
check_result $? "Backend builds"

echo "Starting docker...";
docker-compose up -d &> $CWD/docker.log &

echo "FINISHED in ${SECONDS}sec";
