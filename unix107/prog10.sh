#!/bin/bash

echo Enter number
read n
summ=$(echo "scale=2;($n*($n+1))/2" | bc)
echo $summ