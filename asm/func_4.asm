.globl main

.text

main:

li $t1, 1
add $t0, $t1, 2
lw $t2, x_1
add $t1, $t2, 2
move $t2, $t1
sw $t2, x_1
lw $t3, x_1
lw $t4, x_1
mul $t2, $t3, $t4
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
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
