#!/bin/bash
num=1
echo "enter numbers"
for((i=0;i<5;i++))
do
read nos[$i]

a=${nos[$i]}
flag[$a]=1
if [ ${count[$a]} > $num ]; then
	((count[$a]++))
else
	count[$a]=1
fi
done
for((k=0;k<5;k++))
do
	m=${nos[$k]}
	if [ ${flag[$m]} -eq 1 ]; then
		((flag[$m]++))
		if [ ${count[$m]} > $num ]; then
			echo "$m is repeated ${count[$m]} times"
		fi
	fi

	
done
small=${nos[0]}
greatest=${nos[0]}
for((i=0;i<5;i++))
do

if [ ${nos[$i]} -lt $small ]; then
small=${nos[$i]}

elif [ ${nos[$i]} -gt $greatest ]; then
greatest=${nos[$i]}

fi

done

echo "smallest number in an array is $small"
echo "greatest number in an array is $greatest"