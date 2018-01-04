x = int(input())
def iter(n):
	num=1
	for i in range(1,n+1):
		num*=i
	return num
def rec(n):
	if n==0:
		return 1
	else:
		return n*rec(n-1)
print ("iteratively",iter(x))
print ("recursively",rec(x))