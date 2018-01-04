class TrieNode:
	def __init__(self):
		self.children=[None]*28
		self.isLeaf=False
		self.indices=[]
class Trie:
	def __init__(self):
		self.root=TrieNode()

	def toAscii(self,ch):
		return ord(ch)-ord('a')

	def insert(self,word,num):
		temp=self.root
		
		wordlen=len(word)
		for n in range(wordlen):
			index=self.toAscii(word[n])
			if not temp.children[index] :
				
				temp.children[index]=TrieNode()		
			temp=temp.children[index]
		temp.indices.append(num)
		temp.isLeaf=True

	def search(self,word):
		wordlen=len(word)
		temp=self.root
		for i in range(wordlen):
			index=self.toAscii(word[i])
			if not temp.children[index]:
				return False
			temp=temp.children[index]
		return temp!=None and ( temp.isLeaf )
	def indicesret(self,word):
		wordlen=len(word)
		temp=self.root
		for i in range(wordlen):
			index=self.toAscii(word[i])
			temp=temp.children[index]
		return temp.indices



def main():

	t=Trie()
	f = open('hello.txt')
	words = f.readlines()
	for word in words:
		fin=word.split()
	for i in range(len(fin)):
		t.insert(fin[i],i)
	a=input("word")
	if t.search(a):
		print("Found")
		lis=t.indicesret(a)
		print(lis)
	else:
		print("Not found")

main()
			
