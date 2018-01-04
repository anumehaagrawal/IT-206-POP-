import time
from random import randint
global sums
def main():
	
	sums=0
	for i in range(5,100):
		var=[]
		for j in range(i):
			k=randint(0,20)
			var.append(k)
		bubbles(var)
	sums=sums
	print(sums)

main()

def bubbles(var):
	bubt=time.time()
	for i in range(len(var)):
		for m in range(0,(len(var)-i-1)):
			if(var[m]>var[m+1]):
				temp=var[m]
				var[m]=var[m+1]
				var[m+1]=temp
	ft=time.time()-bubt
	sums+=ft
	print(sums)
	print(ft)
	
	
