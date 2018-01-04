#!/bin/bash

sed -n '1,3p' c.txt > xyz.txt
sed -i -e 's/:/|/g' xyz.txt
cat xyz.txt