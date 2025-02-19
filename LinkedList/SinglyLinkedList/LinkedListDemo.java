


class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // list.insertAtBeginning(5);
        // list.insertAtPos(1, 60);
        // list.insertAtPos(2, 70);
        // list.remove(); // remove at the end
        // list.removeAtBeginning();
        // list.remove(20);
        System.out.println(list.remove(30));
        // list.update(100, 60);
        // System.out.println(list.search(60));
        // System.out.println(list.get(3));
        // System.out.println(list.contains(30));

        list.display();
        // System.out.println();
        // list.reverse();

        // Iterator<Integer> item = list.iterator();
        // while(item.hasNext()) {
        //     System.out.print(item.next() + " ");
        // }
        // System.out.println();

        // for(int n : list)
        //     System.out.print(n + " ");

        // LinkedList<String> names = new LinkedList<>();
        // names.add("Riche");
        // names.insertAtBeginning("Ahmed");
        // names.insertAtPos(1, "Lima");
        // names.insertAtEnd("Vinu");

        // for(String name : names)
        //     System.out.print(name + " ");
    }
}