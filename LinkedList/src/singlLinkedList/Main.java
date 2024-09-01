package singlLinkedList;

public class Main {

	public static void main(String[] args) {
LinkedList arr = new LinkedList();

arr.addFirst(6);;

arr.addFirst(3);;
arr.addFirst(8);;
arr.addFirst(8);;
arr.addFirst(8);;
arr.addFirst(8);;

arr.addFirst(100);;
arr.addFirst(100);;

arr.addFirst(50);;
arr.addFirst(50);;


arr.rd(arr.first,arr.first);
arr.pr(arr.first);
;

System.out.println(arr.max(arr.first,arr.first));
//arr.rd(arr.first);

//System.out.println(arr.getFirst());

arr.printList();
//System.out.println(arr.removeByData(55));

//arr.getReverse();
//arr.sort();

arr.printList();



	}

}
