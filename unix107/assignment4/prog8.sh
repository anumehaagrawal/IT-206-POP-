#!/bin/bash

echo "Enter unix,java and Ds marks"
read unix
read javam
read ds
sump=$(echo "scale=2; ($unix + $javam +$ds)/3" | bc)
if (( $(echo "$sump > 70" | bc -l) ))
	then 
	echo "Distinction"
elif (( $(echo "$sump > 60" | bc -l) ))
	then
	echo "First Class"
elif (( $(echo "$sump > 50" | bc -l) ))
	then
	echo "Second Class"
elif (( $(echo "$sump > 40" | bc -l) ))
	then
	echo "Third Class"
else
	echo "Fail"
fi