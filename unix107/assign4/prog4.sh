#!/bin/bash
for filename in *;

do
	echo $filename >> total.lst
done
grep  "^[AaEeIiOuoU]" total.lst;