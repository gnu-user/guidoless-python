###############################################################################
#
#  Mimpc -- Minimp parser makefile
#
#  Copyright (C) 2013, Joseph Heron, Jonathan Gillett, and Daniel Smullen
#  All rights reserved.
# 
# 
#  This program is free software: you can redistribute it and/or modify
#  it under the terms of the GNU General Public License as published by
#  the Free Software Foundation, either version 3 of the License, or
#  (at your option) any later version.
# 
#  This program is distributed in the hope that it will be useful,
#  but WITHOUT ANY WARRANTY; without even the implied warranty of
#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#  GNU General Public License for more details.
# 
#  You should have received a copy of the GNU General Public License
#  along with this program.  If not, see <http://www.gnu.org/licenses/>.
#
###############################################################################

# Name of targe
TARGET_NAME := Minimp

# Source files
JJTREE_SOURCE_FILE := Minimp.jjt
JAVACC_SOURCE_FILE := Minimp.jj
JAVA_SOURCE_FILES := *.java
JAVA_CLASS_PATH := .:../lib/commons-collections-3.2.1.jar

# Class files for make clean
CLASS_FILES := *.class

# Remove alias
RM := rm -rf

# Default target
default: Minimp

# All target
all: Minimp

# Make invocation
Minimp:
	@echo 'Building target with JJTree: $@'
	jjtree $(JJTREE_SOURCE_FILE)
	@echo ''
	@echo 'Building target with JavaCC: $@'
	javacc $(JAVACC_SOURCE_FILE)
	@echo ''
	@echo 'Building final target with Java: $@'
	javac -cp $(JAVA_CLASS_PATH) $(JAVA_SOURCE_FILES)
	@echo ''
	@echo -e '\e[0;32mFinished building target: $@ \e[0m'

# Test Minimp with default tests
test:
	@echo "Testing: $(TARGET_NAME)"
	@cd ..; ./test_suite.sh

# Test Minimp with assignment 1 tests
test1:
	@echo "Testing: $(TARGET_NAME)"
	@cd ..; ./test_suite.sh 1

# Test Minimp with assignment 2 tests
test2:
	@echo "Testing: $(TARGET_NAME)"
	@cd ..; ./test_suite.sh 2

# Clean
clean:
	@$(RM) $(CLASS_FILES)

