.globl main

.text

main:

li $t2, 5
mul $t1, $t2, 5
mul $t0, $t1, 2
li $v0, 1 # Print variable
move $a0, $t0
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $t2, 10
div $t1, $t2, 5
div $t0, $t1, 2
li $v0, 1 # Print variable
move $a0, $t0
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $t1, 100
li $t3, 100
li $t5, 50
li $t7, 1
mul $t6, $t7, 10
div $t4, $t5, $t6
div $t2, $t3, $t4
mul $t0, $t1, $t2
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
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
