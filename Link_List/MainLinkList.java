public class MainLinkList{
	
  
  public static void main(String args[]){
	
     SignlyLinkList L1 = new SignlyLinkList();
     L1.addLast(16);
     L1.addLast(13);
     L1.addLast(14);
     L1.addLast(15);
     L1.addLast(16);
     L1.addLast(17);
     L1.addLast(19);
     L1.printNode();
     System.out.println("\nCount is "+L1.linkListCount());
     L1.reverse();
     L1.middleNode(65);
     L1.printNode();
     System.out.println();
     L1.deleteLast();
     L1.printNode();
     System.out.println();
     L1.search(16);
     L1.search(20);
     L1.addAnyPosition(25,4);
     L1.printNode();
     System.out.println();
     L1.deleteAnyPostion(2);
     L1.printNode();
     System.out.println();
     L1.sortList();
     L1.printNode();
     System.out.println();
    }
}