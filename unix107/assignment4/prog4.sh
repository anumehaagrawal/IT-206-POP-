#!/bin/bash
echo "Enter num"
read num
flag=0
declare -a unix=('zero' 'one' 'two' 'three' 'four' 'five' 'six' 'seven' 'eight' 'nine');
for i in `seq 0 9`
do
	if [ $num -eq $i ]
		then 
		echo ${unix[$i]}
		flag=1
	fi

done

if [ $flag -eq 0 ]
	then
	echo "invalid"
fi