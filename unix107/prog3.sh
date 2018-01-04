#!/bin/bash

echo "enter n"
read n
echo Enter $n numbers
suma=0
c=$n
while [ $c -gt 0 ]
do 
	read a
	suma=` expr $suma + $a `
	c=` expr $c - 1 `
done
suma=$(echo "scale=2;1.0 * $suma / $n" | bc)
echo Average is
echo $suma