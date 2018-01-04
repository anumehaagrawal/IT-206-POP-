n = int(input())
var = []
for i in range(n):
	k = int(input())
	var.append(k)
def selectiont(var):
	for j in range(len(var)):
		mini=j
		for k in range(j+1,len(var)):
			if (var[k]<var[mini]):
				mini=k
		temp=var[j]
		var[j]=var[mini]
		var[mini]=temp
	return var
def bubble(var):
	for i in range(len(var)):
		for m in range(0,(len(var)-i-1)):
			if(var[m]>var[m+1]):
				temp=var[m]
				var[m]=var[m+1]
				var[m+1]=temp
	return var
print (bubble(var))
print (selectiont(var))
