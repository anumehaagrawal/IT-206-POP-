#!/bin/bash

echo Enter username
read name
echo enter password
stty -echo
read password
stty echo
echo Your details entered are :-
echo $name
echo $password