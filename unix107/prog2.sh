#!/bin/bash

echo "Enter basic salary"
read basic
dp=$(echo "scale=2;50 * $basic / 100" | bc)
summ=$(echo "scale=2;($dp + $basic)" | bc)
dp=$(echo "scale=2;50 * $basic / 100" | bc)
tot=$(echo "scale=2;46 * $summ / 100" | bc)
pf=$(echo "scale=2;10 * $summ / 100" | bc)
finaldp=$(echo "scale=2;($dp + $tot - $pf)" | bc)
echo $finaldp