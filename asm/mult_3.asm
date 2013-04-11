.globl main

.text

main:

li $t0, 0
sw $t0, my_0
lw $t1, my_0
slt $t0, $t1, 3
beqz $t0, else_0
li $t1, 1
sw $t1, my_0
b if_0
else_0: nop
lw $t3, my_0
add $t1, $t3, 2
move $t3, $t1
sw $t3, my_0
if_0: nop
w_start_0: 
lw $t4, my_0
slt $t3, $t4, 3
beqz $t3, while_0
lw $t4, my_0
li $v0, 1 # Print variable
move $a0, $t4
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
lw $t6, my_0
add $t4, $t6, 1
move $t6, $t4
sw $t6, my_0
b w_start_0
while_0: nop
# Exit
li $v0, 10
syscall

.data
my_0: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
