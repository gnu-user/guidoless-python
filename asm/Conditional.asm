.globl main

.text

main:

li $t0, 0
sw $t0, x_0
lw $t1, x_0
seq $t0, $t1, 0
beqz $t0, else_0
li $v0, 1 # Print integer
li $a0, 10
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
b if_0
else_0: nop
li $t1, 0
sw $t1, x_0
if_0: nop
lw $t3, x_0
seq $t1, $t3, 1
beqz $t1, else_1
li $v0, 1 # Print integer
li $a0, 11
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
b if_1
else_1: nop
li $t3, 0
sw $t3, x_0
if_1: nop
li $t3, 1
sw $t3, x_0
lw $t5, x_0
seq $t3, $t5, 0
beqz $t3, else_2
li $v0, 1 # Print integer
li $a0, 10
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
b if_2
else_2: nop
li $t5, 1
sw $t5, x_0
if_2: nop
lw $t7, x_0
seq $t5, $t7, 1
beqz $t5, else_3
li $v0, 1 # Print integer
li $a0, 11
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
b if_3
else_3: nop
li $t7, 1
sw $t7, x_0
if_3: nop
# Exit
li $v0, 10
syscall

.data
x_0: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
