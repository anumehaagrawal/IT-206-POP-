
class Graph:
	def __init__(self,n=None):
		self.n=n
		self.arr=[[0 for row in range(0,n)] for col in range(0,n)]
		self.adjlist=dict()
		

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

	

		

def main():
	n=int(input())
	G=Graph(n)
	for i in range(n):
		var1, var2 = input().split()
		G.adjmatrix(int(var1),int(var2))
		G.adjlistm(int(var1),int(var2))



	for i in range(n):
		for j in range(n):
			print(G.arr[i][j],end=' ')
		print("\n")
	for i in range(n):
		print(i,end='')
		print(G.adjlist.get(i))
main()
