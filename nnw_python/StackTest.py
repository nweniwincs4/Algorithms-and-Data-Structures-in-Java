class Stack:
    def __init__(self):
        self.stack = []
        
    def push(self,item):
        self.stack.append(item)
        
    def pop(self):
        self.stack.pop()
        
    def peek(self):
        return self.stack[-1]
    
    def isEmpyt(self):
        return len(self.stack)==0

    def size(self):
        return len(self.stack)
    
    
if __name__=="__main__":
    stack = Stack()
    stack.push("A")
    stack.push("B")
    stack.push("C")
    stack.push("D")
    print(f" Stack's items : {stack.stack}")
    print(f" Stack Size : {stack.size()}")
    print(f" Stack's last item : {stack.peek()}")
    stack.pop()
    print(f" Stack's items after removing last item: {stack.stack}")
    print(f" Is Stack empty? : {stack.isEmpyt()}")



