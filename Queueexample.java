package QueueArray;

public class Queueexample {
   int queue []= new int[1];
   int frontend=0;
   int rearend=0;
   public void queuein(int element) {
	   queue[frontend]=element;
	   frontend++;
	   System.out.println(element);
   }
   public void queueout() {
	   int element1;
	   element1 = queue[rearend];
	   rearend++;
	   System.out.println(element1);
   }

	public static void main(String[] args) {
		Queueexample qe = new Queueexample();
		qe.queuein(10);
		qe.queuein(20);
		qe.queuein(30);
		qe.queueout();
		
		

	}

}
