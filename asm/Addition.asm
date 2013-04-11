.globl main

.text

main:

li $t1, 2
add $t0, $t1, 2
move $t1, $t0
sw $t1, x_0
lw $t2, x_0
lw $t4, x_0
lw $t6, x_0
lw $t7, x_0
add $t5, $t6, $t7
add $t3, $t4, $t5
add $t1, $t2, $t3
move $t2, $t1
sw $t2, y_0
lw $t2, x_0
li $v0, 1 # Print variable
move $a0, $t2
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
lw $t2, y_0
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
x_0: .word 0
y_0: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
