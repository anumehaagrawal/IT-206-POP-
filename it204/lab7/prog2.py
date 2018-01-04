import math
class maxHeap:
	def __init__(self):
		self.a=[]
		self.n=0
	def insert(self,x):
		self.a.append(x)
		self.n=self.n+1
	
	def heapify(self,i):
		l=2*i
		r=(2*i)+1
		largest=i
		if(l<self.n and self.a[l]>self.a[i]):
			largest=l
		if(r<self.n and self.a[r]>self.a[i]):
			largest=r
		if(largest!=i):
			self.a[i],self.a[largest]=self.a[largest],self.a[i]
			self.heapify(largest)
	def buildHeap(self):
		num=math.floor((self.n)/2)
		for i in range(num,-1,-1):
			self.heapify(i)
		
	def maxnum(self):
		self.buildHeap()
		print(self.a[0])
	def extractmax(self):
		self.buildHeap()
		maxe=self.a[0]
		last=self.n-1
		self.a[0]=self.a[self.n-1]
		self.a.pop()
		self.n=self.n-1
		self.buildHeap()

		return maxe
	def heapSort(self):
		heap=[]
		num=math.floor((self.n)/2)
		for i in range(self.n-1,-1,-1):
			e=self.extractmax()
			heap.append(e)
		print(heap)
	





def main():
	
	c=maxHeap()
	c.insert(6)
	c.insert(7)
	c.insert(8)
	c.insert(9)
	c.insert(3)

	c.heapSort()
main()