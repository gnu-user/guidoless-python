.globl main

.text

main:

li $t1, 5
add $t0, $t1, 5
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
