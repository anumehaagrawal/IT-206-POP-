#!/bin/bash
select k in add del find exit
do
    case $k in
        add)
            echo -n "Enter Roll no: "
            read roll_no
            echo -n "Enter name: "
            read name
            echo -n "Enter semester: "
            read semester
            echo "Enter marks in 3 sub: "
            read m1
            read m2
            read m3
            p="it$roll_no|$name|$semester|$m1:$m2:$m3"
            echo $p >> stu.lst;;

        del) echo -n "Enter roll no to be deleted: "
             read n
             grep "$n" stu.lst;;
           
        find) echo hello;;
        exit) echo bye
                exit;;
esac
done
