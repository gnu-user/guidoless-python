.globl main

.text

main:

li $t0, 0
sw $t0, var_0
li $t2, 5
seq $t0, $t2, 5
beqz $t0, else_0
li $t2, 5
sw $t2, var_0
b if_0
else_0: nop
li $t2, 1
sw $t2, var_0
if_0: nop
lw $t2, var_0
li $v0, 1 # Print variable
move $a0, $t2
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
