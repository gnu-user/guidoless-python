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
lw $t4, my_0
lw $t5, my_0
add $t3, $t4, $t5
li $v0, 1 # Print variable
move $a0, $t3
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
lw $t4, my_0
mul $t3, $t4, 2
move $t4, $t3
sw $t4, dude_1
li $t7, 4
slt $t4, $t7, 5
beqz $t4, else_1
lw $t8, dude_1
add $t7, $t8, 1
li $v0, 1 # Print variable
move $a0, $t7
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
b if_1
else_1: nop
lw $t7, my_0
li $v0, 1 # Print variable
move $a0, $t7
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $t9, 2
slt $t7, $t9, 5
beqz $t7, else_2
li $v0, 1 # Print integer
li $a0, 2
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
b if_2
else_2: nop
li $v0, 1 # Print integer
li $a0, 1
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
if_2: nop
if_1: nop
b if_0
else_0: nop
li $t9, 1
sw $t9, my_0
li $s0, 3
add $t9, $s0, 2
move $s0, $t9
sw $s0, cool_1
if_0: nop
w_start_0: 
lw $s1, my_0
slt $s0, $s1, 1
beqz $s0, while_0
li $s1, 1
sw $s1, toool_1
lw $s1, my_0
li $v0, 1 # Print variable
move $a0, $s1
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
b w_start_0
while_0: nop
# Exit
li $v0, 10
syscall

.data
my_0: .word 0
dude_1: .word 0
cool_1: .word 0
toool_1: .word 0
newline: .asciiz "\n"
true: .asciiz "true"
false: .asciiz "false"
slb: .asciiz "["
srb: .asciiz "]"
space: .asciiz " "
