#!/usr/bin/env bash

APPLICATION_JAR="${APPLICATION_JAR:-./target.jar}";
APPLICATION_LOG="${APPLICATION_LOG:-./server.log}";
APPLICATION_PID="${APPLICATION_PID:-./server.pid}";

function stop(){
  echo '--start of stop---'
  kill `cat $APPLICATION_PID`
  echo '--  end of stop---'
}

function start(){
  echo '--start of start--'
  java -Dserver.port=8082 -jar $APPLICATION_JAR > $APPLICATION_LOG 2>&1 &
  SERVER_PID=$!
  echo $SERVER_PID > $APPLICATION_PID
  echo '--  end of start--'
}

if [[ $# -ne 1 ]]; then
  echo "usage : $0 command ";
  echo "command : start stop restart";
elif [ $1 == 'start' ]; then
  start;
elif [ $1 == 'stop' ]; then
  stop;
elif [ $1 == 'restart' ]; then
  stop;
  start;
else
  echo "no command";
fi;
