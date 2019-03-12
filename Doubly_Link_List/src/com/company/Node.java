package com.company;

public class Node {

    private  Node next;
    private Node preve;
    private  int data;

    public  Node(int dt){

        data = dt;
        next = null;
        preve = null;
    }

    public int getData(){
        return  data;
    }
    public Node getNext(){
        return next;
    }
    public Node getPreve(){
        return preve;
    }
    public void setNext(Node nt){
        next = nt;
    }
    public void setPreve(Node pre){
        preve = pre;
    }

}
