.globl main

.text

main:

li $t0, 0
sw $t0, var_0
w_start_0: 
lw $t1, var_0
slt $t0, $t1, 5
beqz $t0, while_0
lw $t3, var_0
add $t1, $t3, 1
move $t3, $t1
sw $t3, var_0
w_start_1: 
lw $t4, var_0
slt $t3, $t4, 6
beqz $t3, while_1
lw $t6, var_0
add $t4, $t6, 1
move $t6, $t4
sw $t6, var_0
b w_start_1
while_1: nop
b w_start_0
while_0: nop
lw $t6, var_0
li $v0, 1 # Print variable
move $a0, $t6
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
