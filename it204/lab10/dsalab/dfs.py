import math

class Vertex:
	def __init__(self):
		self.color='white'
		self.start=0
		self.num=0
		self.end=0
		self.pred=None
class Graph:
	def __init__(self,n=None):
		self.n=n
		self.time=0
		self.vertexlist=[]
		self.adjlist=dict()
		for i in range(n):
			self.adjlist[i]=[]
		self.labellist=dict()
		

	def adjlistm(self,index1,index2):

		l=self.adjlist.get(index1)
		l.append(index2)

		l=self.adjlist.get(index2)
		l.append(index1)

	def dfsmain(self,source):
		for i in range(self.n):
			x=Vertex()
			x.num=i

			self.vertexlist.append(x)
		self.dfs(source)


	def dfs(self,source):
		
		s=self.vertexlist[source]
		s.color='grey'
		self.time=self.time+1
		c=self.time
		s.start=self.time
		for i in self.adjlist[s.num]:
			v=self.vertexlist[i]
			if v.color is 'white':
				self.dfs(v.num)
				v.pred=s

		s.color='black'
		self.time=self.time+1
		s.end=self.time
		print(s.num,"=",c ,self.time)
def main():
	n=int(input())
	m=int(input("edges"))
	G=Graph(n)
	for i in range(m):
		var1, var2= input().split()
		G.adjlistm(int(var1),int(var2))
	G.dfsmain(2)
main()
