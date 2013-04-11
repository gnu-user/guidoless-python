.globl main

.text

main:

li $t0, 5
sw $t0, x_0
lw $t1, x_0
slt $t0, $t1, 5
li $v0, 4 # Print string
beqz $t0, f_0
la $a0, true
b c_0
f_0: la $a0, false
c_0: nop
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
lw $t1, x_0
slt $t0, $t1, 6
li $v0, 4 # Print string
beqz $t0, f_1
la $a0, true
b c_1
f_1: la $a0, false
c_1: nop
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
lw $t1, x_0
li $t6, 6
sub $t5, $t6, 2
slt $t0, $t1, $t5
li $v0, 4 # Print string
beqz $t0, f_2
la $a0, true
b c_2
f_2: la $a0, false
c_2: nop
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $t6, 10
li $t8, 10
sub $t7, $t8, 20
slt $t0, $t6, $t7
li $v0, 4 # Print string
beqz $t0, f_3
la $a0, true
b c_3
f_3: la $a0, false
c_3: nop
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
# Exit
li $v0, 10
syscall

.data
x_0: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
