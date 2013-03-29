#!/bin/bash
###############################################################################
# Mimpc -- Minimp parser test suite runner
# 
# Copyright (C) 2013, Joseph Heron, Jonathan Gillett, and Daniel Smullen
# All rights reserved.
#
#
# This program is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program.  If not, see <http://www.gnu.org/licenses/>.
#
###############################################################################

if [[ ${1} == "1" ]]
then
	TEST="Assignment1Tests/*"
elif [[ ${1} == "2" ]]
then
	TEST="Assignment2Tests/*"
else
	TEST="test/*.mim"
fi

SRC="src/"
OUTPUT_EXTENSION="_out.log"
JAVA_CLASS_PATH=${SRC}:lib/commons-collections-3.2.1.jar

for file in $TEST
do
	test_file=${file##*/}

	echo -e "\nTesting: $test_file"
	java -cp ${JAVA_CLASS_PATH} mimpc $file &> out/${test_file}${OUTPUT_EXTENSION}

	if [ $? -eq 0 ]
	then
		echo -en "\033[0;32mTest $test_file PASSED!"
	else
		echo -en "\033[0;31mTest $test_file FAILED!"
	fi
	echo -e "\033[0m"
done
