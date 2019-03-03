import java.util.*;
public class SignlyLinkList{
	
	private Node head;//create a node type varible
	
	//constructor
	public SignlyLinkList(){
		head = null;
	}
	
	//check  the node is empty
	public boolean isEmpty(){
		if(head==null)return true;
		return false;
	}
	
	//add the node value
	public void addLast(int value){
		//create node 
		Node m = new Node(value);
		
		if(isEmpty()){
			head = m; //head is empty put the new node in head
		}
		else{
			 Node findlast = head; //head put into node type varible
			 while(findlast.getNext() != null){ //check which ndoe is null
				 findlast = findlast.getNext();  //set next node 
 			 }
			 findlast.setNext(m); //node is null put into new node
		}
	    
	}
	
	public void printNode(){
		
		if(isEmpty()){ //check link list is empty
			System.out.println("The LinkList is Empty"); 
		}
		else{ 
			Node count = head; //node type varible
			while(count.getNext()!=null){  //find last node
				System.out.print(count.getData()+" ");  //print the all node value
				count = count.getNext();  //set next node
			}
		}
	}
	 
	 public int linkListCount(){
		
		if(isEmpty()){ //check link list is empty
			System.out.println("The LinkList is Empty"); 
			return 0;
		}
		else{ 		
		    int i = 0;
			Node count = head; //node type varible
			while(count.getNext()!=null){  //find last node
				i++;
				count = count.getNext();  //set next node
			}
			return i++;
		}
	 }
		
		
     public void reverse(){
       		
		if(isEmpty()){ //check link list is empty
			   System.out.println("The LinkList is Empty"); 
		}
		else{
			Node count = head;
			int i = 0;
			int lenght = linkListCount();
			int arr[] = new int[lenght]; 
			while(count.getNext()!=null){  //find last node
			     arr[i] = count.getData();
				 i++;
				count = count.getNext();  //set next node
			}
			
			 Arrays.sort(arr);
			 int array [] = new int[lenght];
			 for(int j=0;j<array.length;j++){
				 array[j] = arr[i-1];
				 i--;
				 
			 }
			 
            System.out.println(Arrays.toString(array));
			System.out.println("The maximum Value is "+array[0]);
		}
			
			
	}

	//Insert the middle of the Node

	public void middleNode(int value){
       
		Node count = new Node(value);
		Node cNode = head;
		int len = 0;
		
		while(cNode.getNext()!=null){
			len++;
			cNode = cNode.getNext();
		}
		
		int midpos = len/2-1;
		
		Node x  = head;
		
		len = 0;
		while(x.getNext()!=null){
		  
			
             if(len==midpos){
				
				count.setNext(x.getNext());
                x.setNext(count);
				 break;
			 }
			len++;
			x = x.getNext();
			
		}
       

	}
  
	//delete the last node
	public void deleteLast(){
		
		Node count = head;
		while(count.getNext().getNext()!=null){
			count = count.getNext();
		}
        count.setNext(null);
		
	}

    //search element 
	public void search(int value){
	  
		Node count = head;
		
		boolean flag = false;

		while(count.getNext()!=null){
			 
			if(count.getData()==value){
				flag = true;
				break;
			} 
			else{
                flag = false;
			}
			
			count = count.getNext();
		}
		

		if(flag==true){
			System.out.println("Elemnet Founded!");
		}
		else{
			System.out.println("Element Not Founded!");
		}

	}

	//Add value any position	
	public void addAnyPosition(int value,int position){

        Node newNode = new Node(value);
		Node count = head;
		int len = 0;

		while(count.getNext()!=null){
			len++;
			if(len+2==position){
				
				newNode.setNext(count.getNext());
				count.setNext(newNode);
			}
			count = count.getNext();
		}

	}
	 
	//delete any Position value
	public void deleteAnyPostion(int position){

		Node count = head;
        int len = 0;
		while(count.getNext()!=null){
		     
			if(len+2==position){
			   
				count.setNext(count.getNext().getNext());
				break;	
			}
			len++;
			count = count.getNext();
		}
	}

	//Sort the element in the list
	public void sortList(){
		 
		Node count = head;
		int i = 0;
		int lenght = linkListCount();
		int arr[] = new int[lenght]; 
		while(count.getNext()!=null){  //find last node
			arr[i] = count.getData();
			i++;
			count = count.getNext();  //set next node
		}
		
		
		Arrays.sort(arr);
		for(int k=0;k<arr.length;k++){
			System.out.print( arr[k] +" ");
		}
		
		System.out.println();
		
	}

}