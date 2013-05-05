Guidoless Python Interpreter and Compiler
=========================================

This project is our implementation of a subset of Python called Guidoless Python (Python sans Guido!), 
which we created for our course, ENGR 3960U -- Programming Languages and Compilers.


Summary
-----------------------------------------

This project implements a subset of Python called Minimp, which we refer to as "Guidoless Python", currently
we have two branches, master and asm. The master branch contains the main interpreter, and the asm branch
contains the compiler, which supports generating MIPS32 assembly code which can be assembled using the 
[SPIM MIPS Simulator](http://pages.cs.wisc.edu/~larus/spim.html).

Currently we have Guidless Python supports a lot the functionality that Python has, such as functions, 
iteration, conditions, print, and operations on booleans and integers. For a complete listing of the
supported functionality and more information on our implementation pleases see the assignment 1 - 3
reports in the [documentation](doc/) directory.

In addition, we have also included a test suite, [test_suite.sh](test_suite.sh), which can be used to 
automatically test the compiler against a list of test files we have created. If you would like to 
see examples of source files written for the Guidoless Python programming language, please see the
test files located in the [test](test/) and [AssignmentTests](Assignment2Tests/) directories.


Authors
-----------------------------------------

* Joseph Heron
* Jonathan Gillett
* Daniel Smullen


Copyright (Really Copyleft)
---------------------------

All of the source code in this repository, where the copyright notice is indicated in the source
code, is licensed under the [GNU General Public License, Version 3](http://www.gnu.org/licenses/gpl.html)
