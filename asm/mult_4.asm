.globl main

.text

main:

li $t0, 1
sw $t0, my_0
lw $t1, my_0
sgt $t0, $t1, 3
beqz $t0, else_0
li $t3, 1
add $t1, $t3, 1
move $t3, $t1
sw $t3, my_0
b if_0
else_0: nop
li $t5, 2
seq $t3, $t5, 2
beqz $t3, else_1
li $t5, 3
sw $t5, my_0
b if_1
else_1: nop
li $t5, 0
sw $t5, my_0
if_1: nop
if_0: nop
lw $t5, my_0
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
my_0: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
