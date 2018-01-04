import queue as q 

class vertex:
	def __init__(self,key=None):
		self.dist=None
		self.val=key
		self.pred=None
		self.color='white'

class Graph:
	def __init__(self,n=None):
		self.n=n
		self.arr=[[0 for row in range(0,n)] for col in range(0,n)]
		self.adjlist=dict()
		self.vertexlist=[]
		self.conn=0
		self.connecteddict=dict()
		

	def adjmatrix(self,index1,index2):
		self.arr[index2][index1]=1
		self.arr[index1][index2]=1

	def adjlistm(self,index1,index2):

		if not index1 in self.adjlist:
			self.adjlist[index1]=[]
		l=self.adjlist.get(index1)
		l.append(index2)
		if not index2 in self.adjlist:
			self.adjlist[index2]=[]
		l1=self.adjlist.get(index2)
		l1.append(index1)

	def connect(self,source):
		bfsarray=[]
		for i in range(self.n):
			temp=vertex(i)
			self.vertexlist.append(temp)
		s=self.vertexlist[source]
		s.dist=0
		s.color='grey'
		Q=q.Queue()
		Q.put(s)
		while not Q.empty():
			u=Q.get()
			a=u.val
			#print(u.val,end=' ')
			bfsarray.append(u.val)
			adju=self.adjlist.get(a)
			for i in adju:
				ver=self.vertexlist[i]
				if ver.color is 'white':
					ver.dist=u.dist+1
					ver.color='grey'
					ver.pred=u
					Q.put(ver)
			u.color='black'
		bfsarray.sort()
		if not bfsarray in self.connecteddict.values():
			self.connecteddict[self.conn]=bfsarray
			self.conn=self.conn+1


	def reset(self):
		for i in self.vertexlist:
			i.dist=None
			i.pred=None
			i.color='white'

	


def main():
	n=int(input())
	G=Graph(n)
	e=int(input("No.of edges"))
	for i in range(e):
		var1, var2 = input().split()
		G.adjlistm(int(var1),int(var2))
	for i in range(n):
		G.connect(i)
		G.reset()
	print(G.connecteddict)
	
main()