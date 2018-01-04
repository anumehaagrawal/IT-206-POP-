#!/bin/bash

echo "Enter operator"
read n
echo "enter two numbers"
read a b
ans=$(echo "scale=2;$a $n $b" | bc )
echo $ans