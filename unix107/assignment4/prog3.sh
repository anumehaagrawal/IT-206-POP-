#!/bin/bash

echo "enter two file names"
read file1
c=0

read file2
if [ -f $file1 ]
	then 
	echo "file1 exists"
	((c++))
else
	echo "doesnt exist"
fi
if [ -f $file2 ]
	then 
	echo "file2 exists"
	((c++))
else
	echo "doesnt exist"
fi
if [ $c -eq 2 ]
	then
	cat $file1 >> $file2
	cat $file2
fi