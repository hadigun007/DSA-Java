## Defenition

- Common known as FIFO(First in First Out)
- Queue inherit from Collection class


## Common Methods
1.  add/offer => adding new item to the first index => return true
2.  poll/remove => remove item from first index => return deleted item
3.  peek => return string first index
4.  empty => check the stack wether its empty or not => return boolean
5. peek => return top element of stack
6. size => check length of Queue => return int
7. isEmpty => check is queue empty => return int
8. contains => check if Queue contains param sring => return boolean
    
## How To Run

- Compile and Run
``` bash
javac Main.java
java Main
```

## USE CASES

- Keyboad Buffer (Letter Should appear on the screen in the order they are pressed)
- Printer Queue (Print Jobs Should be Completed in Order)
- Used in LinkedList, Priority Queues, Bread-first Search