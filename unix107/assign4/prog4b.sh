#!/bin/bash
grep -c "^$" address.lst
sed  -i '1i <html>' address.lst
sed -i -e '$a </html>' address.lst
cat address.lst