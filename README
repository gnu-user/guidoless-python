Minimp README
=============

Parsing source files using mimpc
--------------------------------

1.	To execute mimpc and use it to parse source files written in Minimp simply navigate to
	the src/ directory and run mimpc using java and provide it the path to your Minimp 
	source file.

		cd src/
		java mimpc [source_file]


	For example:

		java mimpc test_file.mim


2.	Mimpc requires that the source file provided exists and that it conforms to the Minimp
	grammar, if an error occurs Minimp will return one of the following error codes.

		-1  -- An error occurred during the lexical analysis/parsing, source file is invalid
		-2	-- The source file provided as an argument does not exist
		-3	-- Invalid command line arguments provided to mimpc


3.	If the source file provided to mimpc conforms to the syntax and grammar and was parsed
	successfully the following exit code is returned.

		 0  -- The source file is valid and was parsed successfully



Running the mimpc test suite
------------------------------

1.	Mimpc includes a test suite to verify that the parser is able to parse all of the grammar
	and syntax for the Minimp language successfully.

2.	The test/ directory includes a wide variety of test, which are designed to test all of the
	various aspects of the syntax and grammar for the Minimp language.

3.	To execute the test suite for mimpc, on a Linux machine (using the bash shell) execute the
	test suite as follows:

		chmod +x test_suite.sh
		./test_suite.sh

4.	The test suite will test the mimpc parser on all of the Minimp source file tests in the test/
	directory, all tests that passed will output a message in green "Test ... PASSED!" and any 
	tests that failed will output a message in red "Test ... FAILED!"

