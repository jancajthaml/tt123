#!/bin/bash

printf " Started assignment at : \e[0;33m`cat START.md`\e[0m\n"
printf "Finished assignment at : \e[0;33m`cat END.md`\e[0m\n"

printf "\n\e[0;32mTest 1 and 2 (scala)\e[0m\n\n"

command -v sbt > /dev/null 2>&1 && {
  sbt test
} || {
  echo "missing binary \"sbt\" ... skipping test"
}

printf "\n\e[0;32mTest 3 (python + bash)\e[0m\n\n"

command pushd t3 > /dev/null

sh t3.sh | less

command popd > /dev/null
