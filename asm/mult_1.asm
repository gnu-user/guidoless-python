.globl main

.text

main:

li $t1, 1
li $t3, 3
div $t2, $t3, 3
mul $t0, $t1, $t2
move $t1, $t0
sw $t1, first_0
li $t3, 2
add $t1, $t3, 3
move $t3, $t1
sw $t3, second_0
lw $t3, first_0
li $v0, 1 # Print variable
move $a0, $t3
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
lw $t3, second_0
li $v0, 1 # Print variable
move $a0, $t3
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
# Exit
li $v0, 10
syscall

.data
first_0: .word 0
second_0: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
