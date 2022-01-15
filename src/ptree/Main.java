package ptree;

public class Main {

	public static void main(String[] args) {
	
		Person person1 = new Person("banduuq", 25);
		Person person2 = new Person("jacfar", 30);
		Person person3= new Person("yusuf", 20);
		Person person4 = new Person("qoryoley", 30);
		Person person5 = new Person("Ahmet", 60);
		Person person6= new Person("banduuq", 32);
		
		BST bst = new BST();
		bst.additem(person1);
		bst.additem(person2);
		bst.additem(person3);
		bst.additem(person4);
		bst.additem(person5);
		bst.additem(person6);
        bst.showAll(bst.root);
        
     Person p =   bst.getDate(bst.findParent("banduuq"));
     System.out.println("parent " + p.toString());
	}

}
