class LinkedList:
    """Defines a Singly Linked List.

    attributes: head
    """
    
    def __init__(self):
        """Create a new list with a Sentinel Node"""
        self.head=ListNode()
       

    def insert(self,x,p):
        """Insert element x in the position after p"""
        temp=ListNode()
        temp.value=x
        temp.next=p.next
        p.next=temp


    def delete(self,p):
        p.next=p.next.next
       
        """Delete the node following node p in the linked list."""
        

    def printt(self):
        """ Print all the elements of a list in a row."""
        temp=self.head.next
        while temp is not None:
            print (temp.value,end='')
            temp=temp.next



    def insertAtIndex(self,x,i):
        """Insert value x at list position i. (The position of the first element is taken to be 0.)"""
        temp=ListNode()
        temp.value=x
        c=self.head
        for k in range(0,i):
            c=c.next
        temp.next=c.next
        c.next=temp
            

    def search(x):
        temp=self.head.next
        while temp.value != x:
            temp=temp.next
        if temp.value == x:
            return temp
        else:
            return None
        
        """Search for value x in the list. Return a reference to the first node with value x; return None if no such node is found."""
       

    def len(self):
        """Return the length (the number of elements) in the Linked List."""
        count=0
        while self.head:
            count=count+1
            self.head=self.head.next
        return count
        

    def isEmpty(self):
        if self.head.next is None:
            return True
        else:
            return False


class ListNode:
    """Represents a node of a Singly Linked List.

    attributes: value, next. 
    """
    def __init__(self,val=None,nxt=None):
        self.value=val
        self.next=nxt

def main():
    L = LinkedList()
    L.insert(10,L.head)
    print('List is: ')
    L.printt()

    L.insert(12,L.head.next)
    print('List is: ')
    L.printt()
    L.insert(2,L.head)
    print('List is: ')
    L.printt()
    print('Size of L is ',L.len())

    print('List is empty?',L.isEmpty())
    print('Size of L is ',L.len())
    L.insertAtIndex(2,0)
    L.insertAtIndex(1,0)
    L.insertAtIndex(4,2)
    L.insertAtIndex(3,2)
    print('List is: ')
    L.printt()

if __name__ == '__main__':
    main()