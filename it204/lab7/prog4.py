import math
class minHeap:
	def __init__(self):
		self.a=[]
		self.n=0
	def insert(self,x):
		self.a.append(x)
		self.n=self.n+1
	
	def heapify(self,i):
		l=2*i
		r=(2*i)+1
		smallest=i
		if(l<self.n and self.a[l]<self.a[i]):
			smallest=l
		if(r<self.n and self.a[r]<self.a[i]):
			smallest=r
		if(smallest!=i):
			self.a[i],self.a[smallest]=self.a[smallest],self.a[i]
			self.heapify(smallest)
		print(self.a)
	def buildHeap(self):
		num=math.floor((self.n)/2)
		for i in range(num,-1,-1):
			self.heapify(i)
		print(self.a)
	def minnum(self):
		self.buildHeap()
		print(self.a[0])
	def extractmin(self):
		self.buildHeap()
		maxe=self.a[0]
		last=self.n-1
		self.a[0]=self.a[self.n-1]
		self.a.pop()
		self.n=self.n-1
		self.buildHeap()
		print(self.a)
		return maxe
	
def main():
	
	c=minHeap()
	c.insert(6)
	c.insert(7)
	c.insert(8)
	c.insert(9)
	c.insert(3)
	c.insert(1)
	c.buildHeap()
main()