package ptree;

public class Intbst {
private Node root;

public void AddNode(int key , String name) {
  Node newNode = new Node(key, name); 
   
  if(root == null) {
	 root = newNode;
  }
  else {
 Node focus = root;  
 Node parent;
 while(true) {
 parent =  focus;
 if(key < focus.key) {
	 
	 focus = focus.letfChild;
 
  if(focus == null) {
  parent.letfChild = newNode;
   return;
 }
 }
  else {
   focus = focus.RightChild;
   if(focus == null) {
	  parent.RightChild = newNode;
     return;
  }	 
 }
 }
 }	
}

public static void main(String[] args) {
	Intbst a = new Intbst();
	a.AddNode(5, "banduuq");
	a.AddNode(7, "qoruoley");
	a.AddNode(9, "yusuf");
	a.AddNode(3, "ban");
	a.inOrderTraverseTree(a.root);
	
}

//public void showAll(Node n) {
// if(n != null) {
//  showAll(n.letfChild);	 
//  System.out.println(n);
//  showAll(n.RightChild);	 
// }
//}

public void inOrderTraverseTree(Node focusNode) {

       if (focusNode != null) {

           // Traverse the left node

           inOrderTraverseTree(focusNode.letfChild); 

           // Visit the currently focused on node
          System.out.println(focusNode);

           // Traverse the right node
           inOrderTraverseTree(focusNode.RightChild);
       }
}
       public void postOrderTraverseTree(Node focusNode) {
    	  
    	           if (focusNode != null) {
    	   
    	               postOrderTraverseTree(focusNode.letfChild);
    	   
    	               postOrderTraverseTree(focusNode.RightChild);
    	  
    	               System.out.println(focusNode);
    	   
    	           }
   }

       public void preorderTraverseTree(Node focusNode) {
    	   if (focusNode != null) {
    	       System.out.println(focusNode);
    	           preorderTraverseTree(focusNode.letfChild);
    	  
    	               preorderTraverseTree(focusNode.RightChild);
    	     }
    	     }

class Node {
Node letfChild;
Node RightChild;
int key;
String name;	


public Node(int key , String name) {
	  this.key = key;
	  this.name  = name;
}

public String toString() {
 return  name + " has the key " + key;
}

  
}

}
