
public class Main {
	int arr[];
	int top;
	int size;
	Main(){
		this.size=10;
		this.top=-1;
		arr=new int[this.size];
	}
	public void push(int i) {
		arr[++top]=i;
	}
	public int pop() {
		return arr[top--];
	}
	public boolean isempty() {
		return top==-1;
	}
	public int peck() {
		return arr[top];
	}
	
	


	

}
