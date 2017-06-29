import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MaxHeap {

	private List<Integer> items;

	public MaxHeap() {
		items = new ArrayList<>();
	}

	private void shiftUp() {
		int k = items.size() - 1;

		while (k > 0) {
			int p = (k - 1) / 2;
			int item = items.get(k);
			int parent = items.get(p);

			if (k > p) {
				items.set(k, parent);
				items.set(p, item);
				k = p;
			} else {
				break;
			}
		}
	}

	private void shiftDown() {
		int k = 0;
		int l = 2 * k + 1;

		while (l < items.size()) {
			int max = l, r = l + 1;
			if (r < items.size()) {
				if (items.get(l) < items.get(r)) {
					max++;
				}
			}
			if (items.get(k) < items.get(max)) {
				int temp = items.get(k);
				items.set(k,items.get(max));
				items.set(max, temp);
				k = max;
				l = 2 * k + 1;
			} else {
				break;
			}
		}

	}

	public void insert(int j) {
		items.add(j);
		shiftUp();

	}

	public int delete() {
		if (items.size() == 0)
			throw new NoSuchElementException();
		if (items.size() == 1)
			return items.remove(0);
		int temp = items.get(0);
		items.set(0, items.remove(items.size() - 1));
		shiftDown();
		return temp;

	}

	public int size() {
		return items.size();
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}
	
	
	public String toString(){
		return items.toString();
	}
	
	public static void main(String args[]){
		MaxHeap h=new MaxHeap();
		h.insert(4);
		h.insert(3);
		h.insert(5);
		h.insert(8);
		h.insert(9);
		h.insert(10);



		System.out.println("Heap:"+h);
		
		System.out.println("Max Heap Implementation:-");
		
		while(!h.isEmpty()){
			int max=h.delete();
			System.out.println(max+" "+h);
		}
	}
}
