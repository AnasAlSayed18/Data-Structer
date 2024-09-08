package quadratic_hash;

public class HashTable {
	private HNode[] hash = new HNode[5];
	private int size = 5;
	private int counter = 0;

	public HashTable() {
		initialization();
	}

	public int getSize() {
		return size;
	}

	public HNode get(int index) {
		return hash[index];
	}

	public void insert(Object  object) {
		int j = hash(object);
		hash[j] = new HNode(object);
		hash[j].setState('F');
		counter++;
		if (counter >= size / 2)
			rehash(getNextPrime(2 * size));

	}

	private int getNextPrime(int x) {
		while (true) {
			if (isPrime(x))
				break;
			x++;
		}
		return x;
	}

	private boolean isPrime(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	private void rehash(int newSize) {
		HNode [] h = hash;
		hash = new HNode[newSize];
		initialization();
		counter = 0;
		size = newSize;
		for (int i = 0; i < h.length; i++) {
			if (h[i].getState() == 'F')
				insert(h[i].getData());
		}

	}

	public Object delete(Object data) {
		int j = search(data);
		if (j != -1) {
			counter--;
			hash[j].setState('D');
			if (counter <= size / 4)
				rehash(getPrevPrime(size / 2));

			return data;
		} else
			return null;
	}

	private int getPrevPrime(int x) {
		while (true) {
			if (isPrime(x))
				break;
			if (x < 3) {
				x = 3;
				break;
			}
			x--;
		}

		return x;
	}

	public int search(Object data) {
		int h = data.hashCode(), j = 1, i = h % hash.length, index = -1;
		
		while (hash[i].isFull()) {
			if (((String) hash[i].getData()).compareTo((String) data) == 0) {
				index = i;
				break;
			}
			i = (h + (int) Math.pow(j, 2)) % hash.length;
			j++;
		}
		return index;
	}

	private void initialization() {
		for (int i = 0; i < hash.length; i++) {
			hash[i] = new HNode();
		}
	}

	private int hash(Object data) {
		int h = data.hashCode(), j = 1, i = h % hash.length;
		
		while (hash[i].isFull()) {
			i = (h + (int) Math.pow(j, 2)) % hash.length;
			j++;
		}
		return i;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (HNode thNode : hash) {
			if (thNode.getState() != 'D')
				s.append(thNode).append("\n");
			else
				s.append("null\n");
		}
		return s.toString();
	}
	
	
	
	public static void main(String[] args) {
		HashTable hash=new HashTable();
		hash.insert(1);
		hash.insert(7);
		hash.insert(4);
		hash.insert(6);
		
		System.out.println(hash.toString());
		
	}
	
	
	
}
