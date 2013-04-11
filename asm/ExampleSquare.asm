.globl main

.text

main:

lw $t1, x_1
lw $t2, x_1
mul $t0, $t1, $t2
li $v0, 1 # Print variable
move $a0, $t0
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $v0, 1 # Print integer
li $a0, <function square at 0x568097598>
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
