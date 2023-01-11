class Node:
    def __init__(self, dataVal=None):
        self.dataVal = dataVal
        self.nextVal = None
    
class SLinkedList:
    def __init__(self):
        self.headerVal = Node()
    
    def printList(self):
        printVal = self.headerVal
        while printVal is not None:
            print(printVal.dataVal)
            printVal = printVal.nextVal
        print("\n")

    def insertAfter(self, _target, _newVal):
        currentVal = self.headerVal
        while currentVal is not None:
            if currentVal.dataVal != _target:
                currentVal = currentVal.nextVal
            else:
                previousVal = currentVal.nextVal
                currentVal.nextVal = _newVal
                _newVal.nextVal = previousVal
                break

    def insertBefore(self, _target, _newVal):
        currentVal = self.headerVal
        previousVal = None
        while currentVal is not None:
            if currentVal.dataVal != _target:
                previousVal = currentVal
                currentVal = currentVal.nextVal
            else:
                _newVal.nextVal = currentVal
                previousVal.nextVal = _newVal
                break


llist = SLinkedList()
e1 = Node("Tom")
e2 = Node("Alex")
e3 = Node(12)

e2.nextVal = e3
llist.headerVal = e1
e1.nextVal = e2
e2.nextVal = e3
llist.printList()

# Inserting After "Tom"
llist.insertAfter("Tom",Node("Peter"))
llist.printList()

# Inserting Before 12
llist.insertBefore(12,Node("Benjamin"))
llist.printList()

