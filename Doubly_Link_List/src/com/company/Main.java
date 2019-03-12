package com.company;

public class Main {

    public static void main(String[] args) {


        DoublyList obj =  new DoublyList();

          obj.addNode(20);
          obj.addNode(30);
          obj.addNode(40);
          obj.addNode(50);
          obj.addNode(60);
          obj.printNode();
          obj.removeNode(3);
          obj.printNode();
          obj.searchRemove(40);
          obj.printNode();
          obj.insertAnyPostion(3,70); //last position
          obj.printNode();
          obj.insertAnyPostion(2,80);
          obj.printNode();
          System.out.println(obj.countNode());
          obj.maximumNode();
          obj.printNode();
          obj.reverseNode();

    }
}
