#!/bin/bash
echo "Please enter the ten numbers"
ncount=0
pcount=0
zcount=0
for((i=0;i<10;i++))
do
read array[$i]
if [ ${array[$i]} -eq 0 ]
then
zcount=`expr $zcount + 1`
elif [ ${array[$i]} -gt 0 ]
then
pcount=`expr $pcount + 1`
else
ncount=`expr $ncount + 1`
fi
done

echo "Positive numbers:$pcount negative numbers: $ncount zeroes: $zcount"

for((i=0;i<10;i++))
do
maxi=$i
temp1=`expr $i + 1`
for((j=$temp1;j<10;j++))
do
if [ ${array[$i]} -gt ${array[$j]} ]
then
$maxi=$j
fi
done
temp=${array[$maxi]}
array[$maxi]=${array[$i]}
array[$i]=$temp
done
echo "Numbers in ascending order"
for((i=0;i<10;i++))
do
echo ${array[$i]}
done
