.globl main

.text

main:

li $t2, 5
sgt $t0, $t2, 3
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
li $t3, 5
sgt $t0, $t3, 10
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
li $t4, 5
sge $t0, $t4, 3
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
li $t5, 5
sge $t0, $t5, 10
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
li $t6, 5
slt $t0, $t6, 3
li $v0, 4 # Print string
beqz $t0, f_4
la $a0, true
b c_4
f_4: la $a0, false
c_4: nop
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $t7, 5
slt $t0, $t7, 10
li $v0, 4 # Print string
beqz $t0, f_5
la $a0, true
b c_5
f_5: la $a0, false
c_5: nop
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $t8, 5
sle $t0, $t8, 3
li $v0, 4 # Print string
beqz $t0, f_6
la $a0, true
b c_6
f_6: la $a0, false
c_6: nop
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $t9, 5
sle $t0, $t9, 10
li $v0, 4 # Print string
beqz $t0, f_7
la $a0, true
b c_7
f_7: la $a0, false
c_7: nop
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $s0, 5
seq $t0, $s0, 5
li $v0, 4 # Print string
beqz $t0, f_8
la $a0, true
b c_8
f_8: la $a0, false
c_8: nop
syscall
li $v0, 4 # Print string
la $a0 , newline
syscall
li $s1, 5
seq $t0, $s1, 10
li $v0, 4 # Print string
beqz $t0, f_9
la $a0, true
b c_9
f_9: la $a0, false
c_9: nop
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
