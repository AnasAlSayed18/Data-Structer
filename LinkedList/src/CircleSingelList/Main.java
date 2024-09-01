package CircleSingelList;

public class Main {

	public static void main(String[] args) {
LinkedList arr = new LinkedList();
arr.add(6, 0);;
arr.add(9, 1);;
arr.add(10, 2);;
arr.add(15, 3);;
arr.add(20, 4);;
System.out.println(arr.getFirst());

arr.printList();
arr.removeFirst();
System.out.println(arr.last.next.getData());
arr.printList();



	}

}
