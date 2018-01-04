#!/bin/bash

echo Enter String
read s 
n=$(echo "$s" | rev)
if [ $s = $n ]
	then
	echo Palindrome
else
	echo Not Palindrome
fi