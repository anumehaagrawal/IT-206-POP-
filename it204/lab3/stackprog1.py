class  Stack:
	def __init__(self):
		self.elements=[]
		self.top=-1
	def push(self,x):
		self.top=self.top+1
		self.elements.append(x)
	def pops(self):
		self.top=self.top-1
		self.elements.pop()
		
	def tope(self):
		return self.elements[self.top]
	def isEmpty(self):
		if self.top == -1:
			return True
		else:
			return False
def main():
	l=Stack()
	s=input()
	s=s.split()

	for i in range(len(s)):
		if s[i].isnumeric():
			l.push(int(s[i]))
			l.tope()
		else:
			m=l.tope()
			l.pops()
			k=l.tope()
			l.pops()
			if s[i]== '+':
				summ=int(k)+int(m)
			elif s[i]=='*':
				summ=int(k)*int(m)
			elif s[i]=='-':
				summ=int(k)-int(m)
			elif s[i]=='/':
				summ=int(k)/int(m)
			l.push(summ)
		
	print (l.tope())
if __name__ == '__main__':
    main()