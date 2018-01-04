x = int(input())
def primen(n):
	for i in range(2,n):
		if (n%i==0):
			flag=0
			return 0
		else:
			flag=1
	if (flag==1):
		return 1
num = primen(x)
if (num==1):
	print("True")
else:
	print("False")