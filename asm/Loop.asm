.globl main

.text

main:

li $t0, 0
sw $t0, x_0
li $t0, 0
sw $t0, y_0
w_start_0: 
lw $t1, x_0
seq $t0, $t1, 0
beqz $t0, while_0
lw $t3, y_0
seq $t1, $t3, 10
beqz $t1, else_0
li $t3, 1
sw $t3, x_0
b if_0
else_0: nop
li $t3, 0
sw $t3, x_0
if_0: nop
lw $t3, y_0
li $v0, 1 # Print variable
move $a0, $t3
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
lw $t5, y_0
add $t3, $t5, 1
move $t5, $t3
sw $t5, y_0
b w_start_0
while_0: nop
# Exit
li $v0, 10
syscall

.data
x_0: .word 0
y_0: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
