package Heap;

import java.util.Arrays;

public class Heap {
	static int heap[] ;
	static int count=-1;
	Heap () {
		this(25);
	}

	Heap (int size ) {
		heap =new int [size];

	}
	public static void heapify(int heap[], int n, int i) {
		int l = (2 * i) + 1;

		int r = (2 * i )+ 2;
		int max = i;

		if (l < n && heap[l] < heap[max])
			max = l;
		if (r < n && heap[r] < heap[max])
			max = r;

		if (max != i) {
			int temp = heap[i];
			heap[i] = heap[max];
			heap[max] = temp;
			heapify(heap, n, max);
		}
	}


	public void swap ( int heap[], int max, int i) {

		int temp = heap[i];
		heap[i] = heap[max];
		heap[max] = temp;
	}

	public static void buildHeap(int heap[], int n) {
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(heap, n, i);
	}

	public  void insert(  int data) {
		int n = heap.length;


		if(isFull()) {
			System.out.println("Heap is Full, canot add :  "+data);
			return;
		}
		for (int i=0 ; i<n;i++) {
			if(heap[i]==0) {
				heap [i]=data;
				count++;
				break;

			}
		}

		//heap = heapays.copyOf(heap, n+1);

		for (int i = n / 2 - 1; i >= 0; i--) {

			heapify(heap, n, i);

		}

		//heapSort(heap);
	}


	public static void heapSort(int heap[]) {
		int n = heap.length;

		buildHeap(heap, n);
		for (int i = n - 1; i >= 0; i--) {
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			heapify(heap, i, 0);
		}
	}

	public int removeMax ( ) // Remove max pty element
	{
		int Max = heap[count];
		heap[count] = 0;
		count= count-1;
		heapSort(heap);
		return Max;
	}

	public int getMax() {
		heapSort(heap);
		return heap[heap.length-1];
	}



	public int getMin() {
		heapSort(heap);

		return heap[0];
	}

	public void clear() {
		heap = new int [heap.length];

	}

	public boolean isEmpty() {

		return heap[1] == -1;
	}

	public boolean isFull() {

		return heap.length == count+1;
	}

	public static void printHeap(int heap[]) {
		for (int i : heap) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static int log(int x, int base){
		return (int) (Math.log(x) / Math.log(base));
	}

	public int getLevel() {
		int level = (int) log(count+1,2);
		if (count == (int )Math.pow(2,level))
			return level+1;
		else
			return level +1;

	}
	public void showHeapStructure ( ){
		int heapSize = count / 2;
		for (int i = 1; i <= heapSize; i++ ){

			System.out.print(" PARENT : " + heap[i-1] );
			System.out.print(" LEFT : " + heap[2*i -1  ] );
			System.out.print(" RIGHT : " + heap[2 * i ] );
			System.out.println();
		}
	}
	private void showSubtree(int index) {
		int l=index*2+1;
		int r=index*2+2;
		if(l<count && r<count )
			if(heap[index]!=0 && heap[l ]!=0 && heap[r  ]!=0) {
				System.out.print(" PARENT : " + heap[index] );
				System.out.print(" LEFT : " + heap[l ] );
				System.out.print(" RIGHT : " + heap[r ] );
			}

		System.out.println();
	}


	public static void main(String[] args) {
		Heap H = new Heap(5);
		H.insert(10);
		H.insert(80);
		H.insert(30);
		H.insert(40);
		H.insert(20);

		//H.showHeapStructure();
		//  H.insert(233);
		//H.showSubtree(2);


		// insert(100);

		heapSort(heap);
		//printHeap(heap);
		//  H.clear();
		;
		//System.out.println(H.isFull());
		printHeap(heap);

	}
}



