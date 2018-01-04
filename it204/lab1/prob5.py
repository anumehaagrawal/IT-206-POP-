strs=input("enter 1")
str2=input("enter 2")
str3=input("enter 3")
k=""
str1=strs.split()
for a in str1:
	if (a == str2):
		k=k+" " +str3
		
	else:
		k=k+" "+a
print (k)