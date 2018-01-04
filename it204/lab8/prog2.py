class TrieNode:
	def __init__(self):
		self.children=[None]*28
		self.isLeaf=False
class Trie:
	def __init__(self):
		self.root=TrieNode()
	def toAscii(self,ch):
		return ord(ch)-ord('a')
	def insert(self,word):
		temp=self.root
		flag=0
		mark=self.root
		wordlen=len(word)
		for n in range(wordlen):
			index=self.toAscii(word[n])
			if not temp.children[index] :
				if temp.isLeaf is True:
					temp.children[index]=TrieNode()
					temp=temp.children[27]
					temp.children[27]=TrieNode()
					flag=1
				else:		
					temp.children[index]=TrieNode()		
			temp=temp.children[index]

		if flag ==1:
			temp.children[27]=TrieNode()
			temp=temp.children[27]

		temp.isLeaf=True
	def search(self,word):
		wordlen=len(word)
		temp=self.root
		for i in range(wordlen):
			index=self.toAscii(word[i])
			if not temp.children[index]:
				return False
			temp=temp.children[index]
		return temp!=None and ( temp.isLeaf or temp.children[27])


def main():
	t=Trie()
	t.insert('train')
	t.insert('tra')
	boolk=t.search('in')
	print(boolk)
main()