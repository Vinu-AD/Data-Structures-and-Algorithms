





class DoublyLinkedListDemo {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // list.insertAtBeginning(5);
        // list.insertAtPos(1, 60);
        // list.insertAtPos(7, 70);
        // list.insertAtEnd(100);
        // System.out.println(list.remove()); // remove at the end
        // System.out.println(list.removeAtBeginning());
        // System.out.println(list.remove(30));
        // list.update(10, 60);
        // System.out.println(list.search(80)); // will return the index of the value
        // System.out.println(list.get(1));
        // System.out.println(list.contains(30));

        list.display();
        System.out.println();
        list.revDisplay();

        // Iterator<Integer> item = list.iterator();
        // while (item.hasNext()) {
        //     System.out.print(item.next() + " ");
        // }
        // System.out.println();

        // for(int n : list)
        //     System.out.print(n + " ");

/*
        // For another type of values
        DoublyLinkedList<String> names = new DoublyLinkedList<>("Albert");
        names.add("Riche");
        names.insertAtBeginning("Ahmed");
        names.insertAtPos(1, "Lima");
        names.insertAtEnd("Vinu");

        for(String name : names)
            System.out.print(name + " ");
        System.err.println();
        names.revDisplay();
*/
    }
}
