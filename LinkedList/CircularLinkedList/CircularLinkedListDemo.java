import java.util.Iterator;

class CircularLinkedListDemo {

    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // list.insertAtBeginning(5);
        // list.insertAtEnd(100);
        // list.insertAtBeginning(55);
        // list.insertAtEnd(200);
        // System.out.println(list.deleteAtBeginning());
        // System.out.println(list.deleteAtEnd());
        // list.update(10, 60);
        
        // list.deleteVal(50);
        // list.insertAfter(30, 25); 
        // System.out.println(list.contains(10));
        // System.out.println(list.size()); // 7

        // list.display();
        // System.out.println();

        Iterator<Integer> item = list.iterator();
        while (item.hasNext()) {
            System.out.print(item.next() + " ");
        }
        // System.out.println();
        // for(int n : list)
        //     System.out.print(n + " ");

        /*
        // For another type of values
        CircularLinkedList<String> names = new CircularLinkedList<>("Alphi");
        names.add("Riche");
        names.insertAtBeginning("Ahmed");
        names.insertAtEnd("Vinu");

        names.display();
        // for(String name : names)
        //     System.out.print(name + " ");
        // System.out.println();
        */
    }
}
