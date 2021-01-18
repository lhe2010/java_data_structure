/*int mine[][] = {
				{0,0,0,0,1,1},   
				{1,1,1,1,0,0},
				{0,1,1,1,1,1},
				{0,1,1,1,0,0},
				{0,0,0,1,1,0}
		};

		System.out.print("y : ");
		int getY = scan.nextInt();
		System.out.print("x : ");
		int getX = scan.nextInt();
		
		Node n = null;
		
		if(mine[getY][getX] == 0) {	
			n = new Node(getY,getX);	
		}
		ArrayList<Node> tempList = new ArrayList<>();					
		ArrayList<Node> nodeList = new ArrayList<>();					
		tempList.add(n);
		int z = 0;
		while (z<15) {
			int tempY = tempList.get(z).y;
			int tempX = tempList.get(z).x;
			
			if(tempX + 1 < mine[0].length ) {
				if(mine[tempY][tempX+1] == 0) 	 {			
					n = new Node(tempY   , tempX+1);  
					tempList.add(n);
				}
			}
			if(tempY+ 1 < mine.length ) {
				if(mine[tempY+1][tempX] == 0) 	 {
					n = new Node(tempY+1 , tempX); 	
					tempList.add(n);
				}
			}
			if (tempX -1 >=0 ) {
				if(mine[tempY][tempX-1] == 0) 	 {				
					n = new Node(tempY   , tempX-1);  
					tempList.add(n);
				}
			}
			if (tempY-1 >=0 ) {
				if(mine[tempY-1][tempX] == 0)	 {				
					n = new Node(tempY-1 , tempX); 	
					tempList.add(n);
				}
			}
			if(tempY + 1 <  mine.length && tempX+1 < mine[0].length) {
				if(mine[tempY+1][tempX+1] == 0)	 {
					n = new Node(tempY+1 , tempX+1);  
					tempList.add(n);
				}
			}
			if(tempY + 1 <  mine.length && tempX-1 >=0 ) {
				if(mine[tempY+1][tempX-1] == 0)  {
					n = new Node(tempY+1 , tempX-1);  
					tempList.add(n);
				}
			}
			if(tempY - 1 >= 0 && tempX+1 < mine[0].length) {
				if(mine[tempY-1][tempX+1] == 0)  {
					n = new Node(tempY-1 , tempX+1);  
					tempList.add(n);
				}
			}
			if(tempY - 1 >= 0 && tempX-1 >=0 ) {
				if(mine[tempY-1][tempX-1] == 0)  {
					n = new Node(tempY-1 , tempX-1);  
					tempList.add(n);
				}
			}
			
			nodeList.clear();
			for(int i=0; i<tempList.size(); i++) {
				boolean isDuple = false;
				for(int j=0; j<i; j++) {
					if(tempList.get(i).x == tempList.get(j).x && tempList.get(i).y == tempList.get(j).y) {
						isDuple = true;
					}
				}
				if(!isDuple)
					nodeList.add(tempList.get(i));
			}
			
			for(int i=0; i<nodeList.size(); i++) {
				System.out.print(nodeList.get(i).y + "," + nodeList.get(i).x + " ");
			}
			System.out.println();
		
			z++;
			
		}
		System.out.print("size :"+ nodeList.size()+"       ");
*/
package _07_array_circle_queue;

import java.util.ArrayList;
import java.util.Scanner;

class Node {
	
	int x;
	int y;
	
	Node(int y , int x){
		this.x = x;
		this.y = y;
	}
	
	
}

public class Tester2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int mine[][] = {
				{0,0,0,0,1,1},   
				{1,1,1,1,0,0},
				{0,1,1,1,1,1},
				{0,1,1,1,0,0},
				{0,0,0,1,1,0}
		};
		
		boolean isVisit[][] = {
				{false,false,false,false,false,false},   
				{false,false,false,false,false,false},   
				{false,false,false,false,false,false},   
				{false,false,false,false,false,false},   
				{false,false,false,false,false,false}   
		};
		

		System.out.print("y : ");
		int getY = scan.nextInt();
		System.out.print("x : ");
		int getX = scan.nextInt();
		
		Node n = null;
		ArrayList<Node> nodeList = new ArrayList<>();	
		
		if(mine[getY][getX] == 0) {	
			n = new Node(getY,getX);	
			isVisit[getY][getX] = true;
			nodeList.add(n);
		}
		while (true) {
			
			int tempX = nodeList.get(0).x;
			int tempY = nodeList.get(0).y;
			
			if(tempX + 1 < mine[0].length ) {
				if(mine[tempY][tempX+1] == 0 && isVisit[tempY][tempX+1] == false) 	 {			
					n = new Node(tempY   , tempX+1);
					isVisit[tempY][tempX+1] = true;
					nodeList.add(n);
				}
			}
			if(tempY+ 1 < mine.length ) {
				if(mine[tempY+1][tempX] == 0 && isVisit[tempY+1][tempX] == false) 	 {
					n = new Node(tempY+1 , tempX);
					isVisit[tempY+1][tempX] = true;
					nodeList.add(n);
				}
			}
			if (tempX -1 >=0 ) {
				if(mine[tempY][tempX-1] == 0 && isVisit[tempY][tempX-1] == false) 	 {				
					n = new Node(tempY   , tempX-1);
					isVisit[tempY][tempX-1] = true;
					nodeList.add(n);
				}
			}
			if (tempY-1 >=0 ) {
				if(mine[tempY-1][tempX] == 0 && isVisit[tempY-1][tempX] == false)	 {				
					n = new Node(tempY-1 , tempX); 	
					isVisit[tempY-1][tempX] = true;
					nodeList.add(n);
				}
			}
			if(tempY + 1 <  mine.length && tempX+1 < mine[0].length) {
				if(mine[tempY+1][tempX+1] == 0 && isVisit[tempY+1][tempX+1] == false)	 {
					isVisit[tempY+1][tempX+1] = true;
					n = new Node(tempY+1 , tempX+1);  
					nodeList.add(n);
				}
			}
			if(tempY + 1 <  mine.length && tempX-1 >=0 ) {
				if(mine[tempY+1][tempX-1] == 0 && isVisit[tempY+1][tempX-1] == false)  {
					isVisit[tempY+1][tempX-1] = true;
					n = new Node(tempY+1 , tempX-1);  
					nodeList.add(n);
				}
			}
			if(tempY - 1 >= 0 && tempX+1 < mine[0].length) {
				if(mine[tempY-1][tempX+1] == 0 && isVisit[tempY-1][tempX+1] == false)  {
					isVisit[tempY-1][tempX+1] = true;
					n = new Node(tempY-1 , tempX+1);  
					nodeList.add(n);
				}
			}
			if(tempY - 1 >= 0 && tempX-1 >=0 ) {
				if(mine[tempY-1][tempX-1] == 0 && isVisit[tempY-1][tempX-1] == false)  {
					isVisit[tempY-1][tempX-1] = true;
					n = new Node(tempY-1 , tempX-1);  
					nodeList.add(n);
				}
			}
			
			nodeList.remove(0);
			if (nodeList.size() == 0)break;
		}
		
		int cnt = 0;
		for(int i=0;i<isVisit.length; i++) {
			for(int j=0; j<isVisit[i].length; j++) {
				if (isVisit[i][j] == true)cnt++;
				System.out.print(isVisit[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println(cnt);
		
	}

}
