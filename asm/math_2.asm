.globl main

.text

main:

li $t2, 5
add $t1, $t2, 5
sub $t0, $t1, 3
move $t1, $t0
sw $t1, var_0
lw $t1, var_0
li $v0, 1 # Print variable
move $a0, $t1
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
# Exit
li $v0, 10
syscall

.data
var_0: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
