#!/bin/bash
n=1
while [ $n -le 999 ]
do
sum=0
p=$n
while [ $p -ne 0 ]
do

tmp=`expr $p \% 10`

p=`expr $p \/ 10`

q=`expr $tmp \* $tmp \* $tmp`

sum=`expr $sum + $q`

done
if [ $sum = $n ]
then
echo $n
fi
n=`expr $n + 1`
done