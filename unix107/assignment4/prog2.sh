#!/bin/bash
echo "enter name"
read name
if [ -d $name ]
	then
	echo "its a directory"
	ls
elif [ -f $name ]
	then
	
	echo "its a file"
		cat $name
else
	echo "Incorrect name"
	
fi

