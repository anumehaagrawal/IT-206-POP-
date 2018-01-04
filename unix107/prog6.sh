#!/bin/bash

echo "enter length and breadth"
read l b
area=` expr $l \* $b `
echo "Area is $area"
cirn=` expr $l + $b `
cirn=` expr $cirn \* 2 `
echo
echo "Circumference is $cirn"