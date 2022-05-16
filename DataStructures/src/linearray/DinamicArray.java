package linearray;

public class DinamicArray<T> {
	 public int count;
	 public T[] array;
	 public DinamicArray() {
		 this.array = (T[]) new Object[2];
		 this.count = 0;
	 }
	 public boolean empty() {
		 return this.count==0;
	 }
	 public boolean addFront(T item) {
		 if(this.count==0) {
			 array[0] = item;
			 this.count++;
			 return true;
		 }
		 if(this.count+1>=this.array.length) {
			 T[] newArray = (T[]) new Object[this.array.length*2];
			 for(int i =0; i<this.count; i++) {
				 newArray[i+1] = this.array[i];
			 }
			 this.array = newArray;
		 }
		 else {
			 for(int i = count-1; i>=0; i--) {
				 this.array[i+1] = this.array[i];
			 }
		 }
		 this.array[0] = item;
		 this.count++;
		 return true;
	 }
	 public boolean addBack(T item) {
		 if(this.count+1>=this.array.length) {
			 T[] newArray = (T[]) new Object[this.array.length*2];
			 for(int i =0; i<this.count; i++) {
				 newArray[i] = this.array[i];
			 }
			 this.array = newArray;
		 }
		 this.array[this.count] = item;
		 this.count++;
		 return true;
	 }
	 public T popFront() {
		 if(empty()) {
			 System.out.println("Array is empty!");
			 return null;
		 }
		 T ret = this.array[this.count-1];
		 T mov;
		 for(int i = this.count-2; i>=0; i--) {
			 mov = this.array[i];
			 this.array[i] = ret;
			 ret = mov;
		 }
		 this.count--;
		 return ret;
	 }
	 public T popBack() {
		 if(empty()) {
			 System.out.println("Array is empty!");
			 return null;
		 }
		 this.count--;
		 return this.array[count];
	 }
	 public T peekFront() {
		 return this.array[0];
	 }
	 public T peekBack() {
		 return this.array[this.count-1];
	 }
}
