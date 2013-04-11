.globl main

.text

main:

li $t0, 0
sw $t0, i_1
li $t0, 0
sw $t0, sum_1
w_start_0: 
lw $t1, i_1
lw $t3, x_1
slt $t0, $t1, $t3
beqz $t0, while_0
li $t1, 0
sw $t1, j_2
w_start_1: 
lw $t4, j_2
lw $t6, i_1
slt $t1, $t4, $t6
beqz $t1, while_1
lw $t4, j_2
li $v0, 1 # Print variable
move $a0, $t4
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
lw $t7, j_2
add $t4, $t7, 1
move $t7, $t4
sw $t7, j_2
b w_start_1
while_1: nop
lw $t8, i_1
add $t7, $t8, 1
move $t8, $t7
sw $t8, i_1
b w_start_0
while_0: nop
# Exit
li $v0, 10
syscall

.data
i_1: .word 0
sum_1: .word 0
j_2: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
