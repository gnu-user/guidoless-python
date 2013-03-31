Minimp Interpreter README
========================================

Building the Mimp Interpreter
----------------------------------------

1.	On Linux computers that have support for makefiles the Mimp interpreter can
	be built using the following commands.

	cd src/
	make


2.	On Windows computers the Mimp interpreter can be build using the following
	commands, the Java class path to the library file MUST be provided.

	cd src/
	jjtree Minimp.jjt
	javacc Minimp.jj
	javac -cp .;../lib/commons-collections-3.2.1.jar *.java


3.	Alternatively, you can use the pre-built JAR file, Mimp.jar, which is
	located in the src/ directory, rather than building the Mimp interpreter.




Interpreting source files using Mimp
----------------------------------------

1.	To execute Mimp and interpret source files written in Minimp navigate to
	the src/ directory and run Mimp using java and provide it the path to your 
	Minimp source file. Note, the Java class path to the library MUST be provided.


2.	On Windows the Mimp interpreter can be executed using the following
	commands. Please note the semicolon ";" used as a separator in the classpath.

		cd src/
		java -cp .;../lib/commons-collections-3.2.1.jar Mimp [source_file]

	For example, using our factorial source file:

		cd src/
		java -cp .;../lib/commons-collections-3.2.1.jar Mimp ../test/factorial.mim


3.	On Linux machines the Mimp interpreter can be executed using the following
	commands. Please note the colon ":" used as a separator in the classpath.

		cd src/
		java -cp .:../lib/commons-collections-3.2.1.jar Mimp [source_file]

	For example, using our factorial source file:

		cd src/
		java -cp .:../lib/commons-collections-3.2.1.jar Mimp ../test/factorial.mim


4.	Alternatively, the Mimp interpreter can simply be executed using the included
	Mimp.jar JAR file, which has already been built and includes the library file.

		cd src/
		java -jar Mimp.jar [source_file]

	For example, using our factorial source file:

		cd src/
		java -jar Mimp.jar ../test/factorial.mim


5.	Mimp requires that the source file provided exists and that it conforms to the Minimp
	grammar, if an error occurs Minimp will return one of the following error codes.

		-1  -- An error occurred during the lexical analysis/parsing/interpretation 
			   the source file is invalid
		-2	-- The source file provided as an argument does not exist
		-3	-- Invalid command line arguments provided to Mimp


6.	If the source file provided to Mimp conforms to the syntax and grammar and
	was parsed and interpreted succesfully, the output from the interpretation 
	will be displayed to the terimal. As well the following exit code is returned.

		 0  -- The source file is valid and was parsed successfully




Running the Mimp test suite
------------------------------

1.	Mimp includes a test suite to verify that the parser is able to parse all of the grammar
	and syntax for the Minimp language successfully.


2.	The test/ directory includes a wide variety of the default tests, which are 
	designed to test all of the various aspects of the syntax and grammar for the 
	Minimp language. The Assignment1Tests and Assignment2Tests directories contain
	the test files from assignment 1 and 2.


3.	To execute the default test suite for Mimp, on a Linux machine (using the bash
	shell) execute the test suite as follows:

		chmod +x test_suite.sh
		./test_suite.sh


4.	To execute the Mimp test suites for assignment 1 and 2, on a Linux machine 
	(using the bash shell) execute the test suite with the argument 1 or 2 such
	as the following example:

	chmod +x test_suite.sh
	./test_suite.sh 2


4.	The test suite will test the Mimp parser on all of the Minimp source file tests
	directory, all tests that passed will output a message in green "Test ... PASSED!"
 	and any tests that failed will output a message in red "Test ... FAILED!"

