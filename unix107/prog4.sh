#!/bin/bash

echo "enter n"
read n
suma=0
c=$n
while [ $c -gt 0 ]
do 
	suma=` expr $suma + $c`
	c=` expr $c - 1 `
done
echo $suma