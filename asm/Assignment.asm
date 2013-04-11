.globl main

.text

main:

li $t0, 10
sw $t0, x_0
lw $t0, x_0
li $v0, 1 # Print variable
move $a0, $t0
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $t0, 100
sw $t0, y_0
lw $t0, y_0
li $v0, 1 # Print variable
move $a0, $t0
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
