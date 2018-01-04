#!/bin/bash

sum=0
i="y"

echo " Enter numbers"
read n1 n2
while [ $i = "y" ]
do
echo "1.Addition"
echo "2.Subtraction"
echo "3.Multiplication"
echo "4.Division"
echo "Enter your choice"
read ch
case $ch in
    1)sum=$(echo "scale=2;$n1 + $n2" | bc )
     echo "Sum ="$sum;;
    2)sum=$(echo "scale=2;$n1 - $n2" | bc )
     echo "Sub = "$sum;;
    3)sum=$(echo "scale=2;$n1 * $n2" | bc )
     echo "Mul = "$sum;;
    4)sum=$(echo "scale=2;$n1 / $n2" | bc )
     echo "Divi is $sum" ;;
    *)echo "Invalid choice";;
esac
echo "Do u want to continue ?(y/n)"
read i
if [ $i != "y" ]
then
    exit
fi
done   