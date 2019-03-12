package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.*;
public class DoublyList {

    private Node head;

    public DoublyList(){
        head = null;
    }

    public boolean isEpmty(){
        if(head==null) return true;
        return  false;
    }

     //add node
    public void addNode(int data){

        Node new_Node = new Node(data);


        if(isEpmty()){
            head = new_Node;
        }

        else {
            Node count = head;
            while (count.getNext() != null) {
                count = count.getNext();
            }
            count.setNext(new_Node);
            new_Node.setPreve(count);
        }
    }

    //Remove the node in any position
    public void  removeNode(int position){
        if(isEpmty()){
            System.out.println("Can't remove the node.Node is Empty.");
        }
        else{
            Node count = head;
            int i = 0;
            while( i != position){
              count = count.getNext();
              i++;
            }
            count.setNext(count.getNext().getNext());

            if(count.getNext()!=null){
                count.getNext().setPreve(count);  //set the next value previous node
            }

        }
    }

   //Search data and remove
    public void  searchRemove(int value){

        Node count = head;

        while(count.getNext().getData()!=value){
            count = count.getNext();
        }

        count.setNext(count.getNext().getNext());

        if(count.getNext()!=null){
            count.getNext().setPreve(count);  //set the next value previous node
        }
    }

    //given a position and value add
    public void insertAnyPostion(int position,int value){
        Node new_node = new Node(value);

        if(isEpmty()){
            head = new_node;
        }
        else{
            int i = 0;
            Node count = head;
            while(i != position){
                count = count.getNext();
                i++;
            }


            if(count!=null){
                new_node.setNext(count.getNext());
                count.setNext(new_node);
            }
            else{
                addNode(value);
            }


        }
    }


    //count in the Node
    public int countNode(){

        if(isEpmty()){
            return 0;
        }
        else{

            Node i = head;
           int  count = 0;
           while(i!=null){
               i = i.getNext();
               count++;
           }
           return  count;
        }
    }

    //Maximum of the Node value
    public  void maximumNode(){

        if(isEpmty()){
            System.out.println("Empty Node");
        }

        else{
            Node count = head;
            int max = 0;
            while(count!=null){

                if(max<count.getData()){
                    max = count.getData();
                }

                count = count.getNext();
            }

            System.out.println(max);
        }
    }

    //print method
    public void printNode(){

        Node count = head;
        while(count != null){
            System.out.print(count.getData()+" ");
            count = count.getNext();
        }
        System.out.println();

    }

    //reverse method
    public void reverseNode(){

        int len =  countNode();
        int arr[] = new int[len];
        Node count = head;

        for(int i=0;i<len;i++){
            arr[i] = count.getData();
            count = count.getNext();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
         int array[] = new int[len];
        for(int j=0;j<len;j++){
            array[j]  = arr[len-j-1];
        }
       System.out.println(Arrays.toString(array));

    }
}
