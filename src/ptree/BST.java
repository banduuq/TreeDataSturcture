package ptree;

public class BST {
  Node root;
 

//public boolean AddNode(Person item) {
//  Node node = new Node();
//  node.data = item;
//  node.lc = null;
//  node.rc = null;
//  if(root == null) {
//    root = node;
//    return true;
//  }
//  Node c = root;
//  Node p = root;
//  while( c != null) {
//   p = c;
// if(item.getName().compareTo(c.data.getName()) < 0) {
//	 c = c.lc;
// } else {
//	c = c.rc;
// }
//  }
//  if(item.getName().compareTo(p.data.getName()) < 0) {
//	  p.lc = node;
//  }else {
//	 p.rc = node;
//  }
// return true;	
//}
	
 public boolean additem(Person item) {
 Node n = new Node();
 n.data = item;
 n.lc = null;
 n.rc  = null;
  if(root == null) {
	root = n;
	return true;
  }
  Node p = root;
  Node c = root;
  while(c != null) {
	p = c;
  if(item.getName().compareTo(c.data.getName()) < 0) {
	c = c.lc;  
  }else {
	 c = c.rc;
  }
  }
  
  if(item.getName().compareTo(p.data.getName()) < 0) {
	p.lc  = n;
  }else {
	 p.rc = n;
  }
  return true;	  
 }
 
 public Node findNode(String key) {
	Node c = root;
	while( c!= null) {
	if(key.compareTo(c.data.getName()) == 0) {
		break;
	}
	  if(key.compareTo(c.data.getName()) < 0) {
		 c = c.lc;
	  }else {
		 c = c.rc;
	  }
	}
	 return c;
 }
	
 public Node findParent(String key) {
  Node p = root;
  Node c = root;
  do {
  if(key.compareTo(c.data.getName()) == 0) {
	  break;
  }
   p = c;
   if(key.compareTo(c.data.getName()) < 0) {
	   c = c.lc;
   }
   else {
	  c = c.rc;
   }
  } while(c != null);
  
   System.out.println(">>>" + p.data.getName()); 
   
   if( c != null) {
	  return p;  
   }
   else {
	 return null;
   }
   
 }
 
  public Person getDate(Node n) {
	  return n.data;
  }
 
 public void showAll(Node n) {
  Node p = n;
  if(p != null) {
 System.out.print(" " +p.data);
  showAll(p.lc);
  showAll(p.rc);
 
  }
 }

	 
	
 public class Node{
  Node lc;
  Node rc;
  Person data;
 }

}
