#!/bin/bash
h=`date +%H`
#m=`date +%M`
if [ $h -gt 0 ] && [ $h -lt 12 ];
	then
	echo "Good Morning"
elif [ $h -gt 11 ] && [ $h -lt 18 ];
	then
	echo "Good Afternoon"
elif [ $h -gt 17 ] && [ $h -lt 20];
	then
	echo "Good Evening"
else
	echo "Good Night"
fi