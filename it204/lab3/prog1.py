s=input()
s=s.split()
l=[]
for i in range(len(s)):
	if s[i].isnumeric():
		l.append(s[i])
		
	else:
		m=l.pop()
		k=l.pop()
		if s[i]== '+':
			summ=int(k)+int(m)
		elif s[i]=='*':
			summ=summ=int(k)*int(m)
		elif s[i]=='-':
			summ=summ=int(k)-int(m)
		elif s[i]=='/':
			summ=summ=int(k)/int(m)

		l.append(summ)
		
print (l.pop())