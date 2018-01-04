#!/bin/bash
echo "The list of File Names in the curent directory."
echo "Which have Read,Write  permisions. "
for  file  in *
do
if [ -f  $file  ]
then
if [ -r  $file -a -w  $file ]
then
ls -l  $file
fi
fi
done