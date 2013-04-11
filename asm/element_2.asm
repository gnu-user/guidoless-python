.globl main

.text

main:

li $t1, 2
add $t0, $t1, 1
li $t1, 3
li $t2, 3
li $v0, 4 # Print string
la $a0, slb
syscall
li $v0, 1 # Print variable
move $a0, $t0
syscall
li $v0, 4 # Print string
la $a0, space
syscall
li $v0, 1 # Print variable
move $a0, $t1
syscall
li $v0, 4 # Print string
la $a0, space
syscall
li $v0, 1 # Print variable
move $a0, $t2
syscall
li $v0, 4 # Print string
la $a0, srb
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
