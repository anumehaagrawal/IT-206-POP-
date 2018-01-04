import math
class Node:
	def __init__(self,key):
		self.key=key
		self.parent=None
		self.left=None
		self.right=None

class Tree:
	def __init__(self,r):
		self.root=r
		self.temp=self.root
	def print(self):
		print(self.root.right.key)
	def countNodes(self,r):
		if(r is None):
			return 0
		else:
			return(1+self.countNodes(r.left)+self.countNodes(r.right))
	def completeTree(self,r,index,num):
		if(r is None):
			return True
		if (index>=num):
			return False
		return (self.completeTree(r.right,2*index+2,num) and self.completeTree(r.left,2*index+1,num))
	def isHeap(self,r):
		if(r.right is None and r.left is None):
			return True
		if (r.right is None):
			return r.key >= r.left.key
		if(r.key>=r.left.key and r.key>=r.right.key):
			return (self.isHeap(r.left) and self.isHeap(r.right))
		else:
			return False
	def checkHeap(self,r):
		if r is None:
			return True
		number=self.countNodes(r)
		if(self.completeTree(r,0,number) is True and self.isHeap(r) is True):
			return True
		else:
			return False




def main():
	root=Node(9)
	root.right=Node(7)
	root.left=Node(8)
	root.left.left=Node(1)
	root.left.right=Node(6)
	tree=Tree(root)
	a=tree.checkHeap(root)
	print(a)
main()