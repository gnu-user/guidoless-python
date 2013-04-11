.globl main

.text

main:

li $t2, 5
li $t4, 5
mul $t3, $t4, 5
mul $t1, $t2, $t3
add $t0, $t1, 10
li $v0, 1 # Print variable
move $a0, $t0
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $v0, 1 # Print integer
li $a0, 135
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $t4, 10
div $t2, $t4, 10
mul $t1, $t2, 10
sub $t0, $t1, 1
li $v0, 1 # Print variable
move $a0, $t0
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $v0, 1 # Print integer
li $a0, 9
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
