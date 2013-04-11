.globl main

.text

main:

li $t1, 5
add $t0, $t1, 3
move $t1, $t0
sw $t1, var_0
lw $t3, var_0
lw $t4, var_0
add $t2, $t3, $t4
lw $t3, var_0
mul $t1, $t2, $t3
li $v0, 1 # Print variable
move $a0, $t1
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
lw $t2, var_0
lw $t6, var_0
div $t5, $t6, 2
sub $t1, $t2, $t5
move $t2, $t1
sw $t2, var_0
lw $t2, var_0
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
var_0: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
