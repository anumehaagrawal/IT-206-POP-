x = int(input())
def fib(n):
	if(n<=1):
		return 1
	else:
		return fib(n-1) + fib(n-2)
def fibi(n):
	previous=1
	current=1
	nextn=1
	print(previous,end=" ")
	print(nextn,end=" ")
	for i in range(3,n+2):
		nextn=previous+current
		previous=current
		current=nextn
		print (nextn,end=" ")

for i in range(0,x+1):
	print (fib(i),end=" ")
print()
fibi(x)