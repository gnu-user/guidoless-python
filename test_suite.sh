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
	TEST="tests/assignment_1/Example*[^~]"
elif [[ ${1} == "2" ]]
then
	TEST="tests/assignment_2/Example*[^~]"
elif [[ ${1} == "3" ]]
then
	TEST="tests/assignment_3/*.mimp"
else
	TEST="tests/*.mim"
fi

SRC="src/"
OUTPUT_EXTENSION="_out.log"
TEST_DIR=${TEST%/*}
JAVA_CLASS_PATH=${SRC}:lib/commons-collections-3.2.1.jar

for file in $TEST
do
	test_file=${file##*/}
	file_name=${test_file%.*} 	# Filename without extension
	asm_file=${file_name}.asm	# Output assembly file

	echo -e "\nTesting: $test_file"
	java -cp ${JAVA_CLASS_PATH} Mimp $file asm/${asm_file} &> out/${test_file}${OUTPUT_EXTENSION}

	if [ $? -eq 0 ]
	then
		# Verify that the assembly output is correct using diff
		spim -noquiet -exception -file asm/${asm_file} > out/${file_name}.out 2>&1
		diff -sbBaq ${TEST_DIR}/${file_name}.out out/${file_name}.out > /dev/null

		# If the executed assembly file output differs, test failed
		if [ $? -eq 0 ]
		then
			echo -en "\033[0;32mTest $test_file PASSED!"
		else
			echo -en "\033[0;33mAssembly Output $asm_file FAILED!"
		fi
	else
		echo -en "\033[0;31mTest $test_file FAILED!"
	fi
	echo -e "\033[0m"
done
