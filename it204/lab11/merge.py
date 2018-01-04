
class sort:
	def __init__(self,p):
		self.a=p
		self.var=0

	def mergeSort(self,low,high):

		if(low<high):
			mid=int((low+high)/2)
			self.mergeSort(low,mid)
			self.mergeSort(mid+1,high)
			self.merge(low,mid,high)
		print(self.a)
	def merge(self,low,mid,high):
		l=0
		L=[0]*(mid-low+1)
		R=[0]*(high-mid)
		r=0
		for i in range(0,mid-low+1):
			L[i]=self.a[i+low]
			
		for j in range(0,high-mid):
			R[j]=self.a[j+mid+1]
		
		self.var=low

		while(l<mid-low+1 and r<high-mid):
			if(L[l]>R[r]):
				self.a[self.var]=R[r]
				r+=1
			else:
				self.a[self.var]=L[l]
				l+=1
			
			self.var=self.var+1
		
		while(l<mid-low+1):
				self.a[self.var]=L[l]
				self.var=self.var+1
				l=l+1
		while(r<high-mid):
				self.a[self.var]=R[r]
				self.var=self.var+1
				r=r+1
def main():
	
	p=[9,3,4,6,2]
	S=sort(p)
	S.mergeSort(0,4)
main()

