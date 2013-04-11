.globl main

.text

main:

li $t0, 0
sw $t0, my_0
li $t2, 2
slt $t0, $t2, 3
beqz $t0, else_0
li $t3, 1
add $t2, $t3, 1
move $t3, $t2
sw $t3, my_0
b if_0
else_0: nop
li $t3, 3
sw $t3, my_0
if_0: nop
lw $t3, my_0
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
my_0: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
