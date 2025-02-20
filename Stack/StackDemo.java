
class StackDemo {
    public static void main(String[] args) {
    
    /*
        ArrayStack<Integer> stack = new ArrayStack<>();

        stack.push(10);
        stack.push(20);
        stack.pop();
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        // stack.push(90);
        // stack.push(100);
        // stack.push(110);

        /*  
        while(!stach.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("");
        

        Iterator it = stack.iterator();
        while(it.hasNext()) 
            System.out.print(it.next() + " ");
        System.out.println("");
        
        /* 
        ArrayStack<String> nameStack = new ArrayStack<>("Alphi");
        nameStack.push("Charu");
        nameStack.push("Pushpa");
        nameStack.pop();
        nameStack.push("Soundar");

        Iterator names = nameStack.iterator();
        while(names.hasNext()) {
            System.out.print(names.next() + " ");
        }
            
    */


        LinkedListStack<Integer> stack = new LinkedListStack<>();

        stack.push(10);
        stack.pop();
        stack.push(20);
        stack.pop();
        stack.push(50);
        // stack.pop();
        stack.push(100);
        // stack.pop();
        System.out.print("Peek element: " + stack.peek() + "\n");

        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    
    }
}