#!/bin/bash
select k in month Date Tty Whoami Who quit
do 
	case $k in
		month) cal;;
		Date) date;;
		Tty) tty;;
		Whoami) whoami;;
		Who) who;;

		quit) echo bye
			exit ;;
				*) echo Pleas try ;;
		esac
done

