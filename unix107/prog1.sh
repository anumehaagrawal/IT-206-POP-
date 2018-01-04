#!/bin/bash

echo "enter values for p ,t ,r"
read p t r

si=` expr $p \* $r \* $t `
si=` expr $si / 100 `
echo "Simple Interest is $si"
echo
echo "enter radius of circle"
read radius
area=$(echo "scale=2;3.14 * ($radius * $radius)" | bc)
echo "Area is $area"