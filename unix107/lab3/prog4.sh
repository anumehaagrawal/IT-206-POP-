#!/bin/bash
echo "enter numbers"
a=0
b=0
c=0
for((i=0;i<10;i++))
do
read nos[$i]
if [ ${nos[$i]} -eq 0 ] ; then
	((a++))
elif [ ${nos[$i]} -gt 0 ]; then
	((b++))
else
	((c++))
fi

done
echo " number of zeros is $a"
echo "number of positives $b"
echo "number of negatives $c"
for (( i = 0; i <10; i++ ))
do
   for (( j = $i; j < 10; j++ ))
   do
      max=${nos[$j]} 
      val=${nos[$i]}
      

      if [ ${nos[$i]} -gt $max ]; then
           t=${nos[$i]}
           nos[$i]=$max 
           nos[$j]=$t
      fi
   done
done
echo -e "\nSorted Numbers in Ascending Order:"
for (( i=0; i <= 9; i++ )) 
do
  echo ${nos[$i]}
done