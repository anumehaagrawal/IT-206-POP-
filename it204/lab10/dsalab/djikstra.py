import math
class minHeap:

	def __init__(self):
		self.a=[]
		self.c=[]
		self.n=0
	def insert(self,x):
	
		self.a.append(x.dist)
		self.c.append(x.num)
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
			self.c[i],self.c[smallest]=self.c[smallest],self.c[i]
			self.heapify(smallest)
		
	def buildHeap(self):
		num=math.floor((self.n)/2)
		for i in range(num,-1,-1):
			self.heapify(i)

	def updatePriority(self,vertix):
		index=self.c.index(vertix.num)
		self.a[index]=vertix.dist
		
	def extractmin(self):
		self.buildHeap()
		maxe=self.a[0]
		maxnum=self.c[0]
		last=self.n-1

		self.a[0]=self.a[self.n-1]
		self.c[0]=self.c[self.n-1]
		self.a.pop()
		self.c.pop()
		self.n=self.n-1
		self.buildHeap()
		return maxnum
	

class Vertex:
	def __init__(self):
		self.dist=99
		self.num=None
class Graph:
	def __init__(self,n=None):
		self.n=n
		self.vertexlist=[]
		self.adjlist=dict()
		self.labellist=dict()

	def adjlistm(self,index1,index2,dist):

		if not index1 in self.adjlist:
			self.adjlist[index1]=[]
		l=self.adjlist.get(index1)
		c=[]
		c.append(index2)
		c.append(dist)
		l.append(c)
		
	def djkstra(self,source):
		for i in range(self.n):
			x=Vertex()
			x.dist=99
			x.num=i
			self.vertexlist.append(x)
		s=self.vertexlist[source]
		s.dist=0
		
		H=minHeap()
		for i in range(self.n):
			H.insert(self.vertexlist[i])
		while len(H.a) > 0:
			w=H.extractmin()
			v=self.adjlist.get(w)
			
			if v is not None:
				
				for i in range(len(v)):
					
					if self.vertexlist[w].dist + v[i][1] < self.vertexlist[v[i][0]].dist:
						self.vertexlist[v[i][0]].dist=self.vertexlist[w].dist + v[i][1]
						H.updatePriority(self.vertexlist[v[i][0]])
						self.labellist[self.vertexlist[v[i][0]].num]=self.vertexlist[v[i][0]].dist


				H.buildHeap()
		print(self.labellist)
	

		
def main():
	n=int(input())
	m=int(input("edges"))
	G=Graph(n)
	for i in range(m):
		var1, var2, var3= input().split()
		G.adjlistm(int(var1),int(var2),int(var3))
	G.djkstra(2)

main()