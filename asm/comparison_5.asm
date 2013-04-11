.globl main

.text

main:

li $t0, 1
sw $t0, var_0
lw $t1, var_0
seq $t0, $t1, 2
beqz $t0, else_0
li $t1, 5
sw $t1, var_0
b if_0
else_0: nop
li $t1, 0
sw $t1, var_0
if_0: nop
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
