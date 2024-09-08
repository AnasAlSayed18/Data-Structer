package quadratic_hash;

public class HNode {
	private Object data;
	private char state = 'N';

	public HNode() {
	}

	public HNode(Object data) {
		this.data = data;
	}

	public char getState() {
		return state;
	}

	public void setState(char state) {
		if (state == 'D' || state == 'N' || state == 'F')
			this.state = state;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isFull() {
		return state != 'D' && state != 'N';
	}

	@Override
	public String toString() {
		return data + "";
	}
}
