class TrieNode:
	def __init__(self):
		self.children=[None]*26
		self.isLeaf=False
class Trie:
	def __init__(self):
		self.root=TrieNode()
	def toAscii(self,ch):
		return ord(ch)-ord('a')
	def insert(self,word):
		temp=self.root
		mark=self.root
		wordlen=len(word)
		for n in range(wordlen):
			index=self.toAscii(word[n])
			if not temp.children[index] :				
				temp.children[index]=TrieNode()		
			
			temp=temp.children[index]

		temp.isLeaf=True
	def search(self,word):
		wordlen=len(word)
		temp=self.root
		for i in range(wordlen):
			index=self.toAscii(word[i])
			if not temp.children[index]:
				return False
			temp=temp.children[index]
		return temp!=None and temp.isLeaf


def main():
	t=Trie()
	t.insert('tra')
	t.insert('train')
	
	boolk=t.search('tra')
	print(boolk)
main()