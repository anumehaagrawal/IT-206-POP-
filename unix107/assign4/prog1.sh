#!/bin/bash
echo "Enter n"
read n
for ((i=0;i<n;i++))
do
    echo -n "Enter name:"
    read name
    echo $name >> address.lst
    echo -n "Enter address:"
    read address
    echo $address >> address.lst
done
cat address.lst