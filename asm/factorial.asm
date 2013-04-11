.globl main

.text

main:

li $t0, 1
sw $t0, p_1
w_start_0: 
lw $t1, x_1
sgt $t0, $t1, 1
beqz $t0, while_0
lw $t3, p_1
lw $t4, x_1
mul $t1, $t3, $t4
move $t3, $t1
sw $t3, p_1
lw $t5, x_1
sub $t3, $t5, 1
move $t5, $t3
sw $t5, x_1
lw $t5, p_1
li $v0, 1 # Print variable
move $a0, $t5
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
b w_start_0
while_0: nop
lw $t5, x_1
li $v0, 1 # Print variable
move $a0, $t5
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
# Exit
li $v0, 10
syscall

.data
p_1: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
