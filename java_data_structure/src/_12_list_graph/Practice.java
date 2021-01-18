package _12_list_graph;

class sNode {
	int data;
	sNode link;
}

class LinkedStackAfter {
	
	sNode top;
	
	void push(int data) {
		sNode tempNode = new sNode();
		tempNode.data = data;
		if (top == null) {
			top = tempNode;
		} 
		else {
			top.link = tempNode;
			top = tempNode;
		}
	}
	
	void pop() {
		
	}
	
	void print() {
		sNode curNode = top;
		while (curNode != null) {
			System.out.print(top.data + " > ");
			curNode = curNode.link;
		}
		System.out.println();
	}
	
	void peek() {
		
	}
	
	
} 

class LinkedQueueAfter {
	
}


public class Practice {

	public static void main(String[] args) {
		
		System.out.println("a".compareTo("f"));

	}

}
