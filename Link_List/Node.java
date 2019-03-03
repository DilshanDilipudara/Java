public class Node{
	
	private int data;
	private Node next;
	
	
	//contructor
   public Node(int data){
	   this.data = data;
	   next = null;
	   
   }	
	//get the int value
	public int getData(){
		return data;
	}
	//get the next node value
	public Node getNext(){
		return next;
	}
	
	//set the next node
	public void setNext(Node next){
		this.next  = next;
	}
    
	
}