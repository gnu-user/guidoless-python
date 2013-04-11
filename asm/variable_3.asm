.globl main

.text

main:

li $t0, 9
sw $t0, var_0
lw $t0, var_0
li $v0, 1 # Print variable
move $a0, $t0
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
