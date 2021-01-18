package _01_list;

import java.util.Random;
import java.util.Scanner;

public class YYY {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		Random  ran  = new Random();
//		
//		int[][] map = {
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0},
//				{0,0,0,0,0,0,0,0,0,0}
//		};
//
//		int pX = 0;
//		int pY = 0;
//		int goalX = 0;
//		int goalY = 0;
//		int ballX = 0;
//		int ballY = 0;
//		int rX = 0;
//		int rY = 0;
//		int mapSize = map.length;
//		int wallCnt = 10;
//		int goalCnt = 3;
//		int ballCnt= goalCnt;
//		final int GOAL = 9;
//		final int PLAYER = 7;
//		final int BALL = 3;
//		final int WALL = 1;
//
//		// 게임 셋팅
//		boolean isSetWall = false;
//		boolean isSetBall = false;
//		boolean isSetGoal = false;
//		boolean isSetPlayer = false;
//		
//		while (true) {
//			
//			if(isSetWall && isSetBall && isSetGoal && isSetPlayer)
//				break;
//			
//			if(isSetBall) {
//				rX = ran.nextInt(mapSize);
//				rY = ran.nextInt(mapSize);
//			} else {
//				rX = ran.nextInt(mapSize-2)+1;
//				rY = ran.nextInt(mapSize-2)+1;
//			}
//			if (map[rY][rX] == 0) {
//			
//				if (!isSetBall) {
//					map[rY][rX] = BALL;
//					ballX = rX;
//					ballY = rY;
//					isSetBall = true;
//				}
//				else if (!isSetWall) {
//					map[rY][rX] = WALL;
//					wallCnt--;
//					if (wallCnt == 0) {
//						isSetWall = true;
//					}
//				}
//				else if (!isSetGoal) {
//					map[rY][rX] = GOAL;
//					goalX = rX;
//					goalY = rY;
//					isSetGoal = true;
//				}
//				else if (!isSetPlayer) {
//					map[rY][rX] = PLAYER;
//					pX = rX;
//					pY = rY;
//					isSetPlayer = true;
//				}
//				
//			}					
//			
//		}
//
//		// 기능 구현
//		int getDir = 0;
//		int tempX = 0;
//		int tempY = 0;
//		while (true) {
//			
//			for(int i=0; i<map.length; i++) {
//				for(int j=0; j<map[i].length; j++) {
//					if(map[i][j] == BALL)   System.out.print("@ ");
//					if(map[i][j] == PLAYER) System.out.print("C ");
//					if(map[i][j] == GOAL)   System.out.print("G ");
//					if(map[i][j] == WALL)   System.out.print("| ");
//					if(map[i][j] == 0)		System.out.print("* ");
//				}
//				System.out.println();
//			}
//			System.out.print("1)l 2)r 3)u 4)d #>");
//			getDir = scan.nextInt();
//			
//			tempX = pX;
//			tempY = pY;
//			if(getDir == 1)	tempX--;
//			if(getDir == 2)	tempX++;
//			if(getDir == 3)	tempY--;
//			if(getDir == 4)	tempY++;
//			
//			if(tempY < 0 || tempY == map.length) 		continue;
//			if(tempX < 0 || tempX == map[0].length) 	continue;
//			if(map[tempY][tempX] == 1) 					continue;
//			if(map[tempY][tempX] == BALL) {
//				int tempBallY = ballY;
//				int tempBallX = ballX;
//				if(getDir == 1)	tempBallX--;
//				if(getDir == 2)	tempBallX++;
//				if(getDir == 3)	tempBallY--;
//				if(getDir == 4)	tempBallY++;
//				
//				if (tempBallY < 0 || tempBallY == map.length ) 	  continue;
//				if (tempBallX < 0 || tempBallX == map[0].length ) continue;
//				if(map[tempBallY][tempBallX] == 1 )				  continue;
//				
//				ballX = tempBallX;
//				ballY = tempBallY;
//				map[ballY][ballX] = BALL;
//			}
//			if (map[pY][pX] == map[goalY][goalX]) {
//				map[pY][pX] = GOAL;
//				pY = tempY;
//				pX = tempX;
//				map[pY][pX] = PLAYER;
//
//				continue;
//			}
//			map[pY][pX] = 0;
//			pY = tempY;
//			pX = tempX;
//			map[pY][pX] = PLAYER;
//			
//			if(map[ballY][ballX] == map[goalY][goalX]) break;
//			
//		}
//		System.out.println("==========   GAME OVER ==========");
//		
		
		Scanner scan = new Scanner(System.in);
		Random  ran  = new Random();
		
		int[][] map = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}
		};
		
		int[] snake = new int[4];
		int[] snakeX = new int[4];
		int[] snakeY = new int[4];
		
		for(int i=0; i<snake.length; i++) {
			snakeX[i] = i;
			snakeY[i] = 0;
			snake[i] = i + 1;
		}
		int itemCount = 5;
		while(itemCount != 0) {
			int tempX = ran.nextInt(map.length-3) + 1 ;
			int tempY = ran.nextInt(map.length);
			if(map[tempY][tempX] == 0) {
				map[tempY][tempX] = 9;
				itemCount--;
			}
		}
		
		
		while(true) {
			
			for(int i=0; i<map.length; i++) {
				for(int j=0; j<map[i].length; j++) {
					if (map[i][j] != 9)
						map[i][j] =0;
				}
			}
			
			for(int i=0; i<snake.length; i++) {
				map[snakeY[i]][snakeX[i]] = snake[i];
			}
	
			for(int i=0; i<map.length; i++) {
				for(int j=0; j<map[i].length; j++) {
					System.out.print(map[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.print("1)l  , 2)r  , 3)u    ,4)d  ");
			int getDir = scan.nextInt();
			
			if(getDir == 1) {
				for(int i=snake.length-2; i>=0; i--) {
					snakeX[i+1] = snakeX[i];
				}
				snakeX[0]--;
				for(int i=snake.length-2; i>=0; i--) {
					snakeY[i+1] = snakeY[i];
				}
			}
			if(getDir == 2) {
				for(int i=snake.length-2; i>=0; i--) {
					snakeX[i+1] = snakeX[i];
				}
				snakeX[0]++;
				for(int i=snake.length-2; i>=0; i--) {
					snakeY[i+1] = snakeY[i];
				}
				
			}
			if(getDir == 3) {
				for(int i=snake.length-2; i>=0; i--) {
					snakeX[i+1] = snakeX[i];
				}
				
				
				for(int i=snake.length-2; i>=0; i--) {
					snakeY[i+1] = snakeY[i];
				}
				snakeY[0]--;
			}
			if(getDir == 4) {
				for(int i=snake.length-2; i>=0; i--) {
					snakeX[i+1] = snakeX[i];
				}
				
				
				for(int i=snake.length-2; i>=0; i--) {
					snakeY[i+1] = snakeY[i];
				}
				snakeY[0]++;
			}
			
			if (map[snakeY[0]][snakeX[0]] == 9) {
				int[] tempX = snakeX;
				int[] tempY = snakeY;
				int[] tempSnake = snake;//4
				snakeY = new int[tempX.length+1];//5
				snakeX = new int[tempY.length+1];//5
				snake = new int[tempSnake.length+1];//5
				
				for(int i=0;i<tempX.length; i++) {
					snakeX[i] = tempX[i];
					snakeY[i] = tempY[i];
					snake[i]  = tempSnake[i];
				}
				int addX = 0;
				int addY = 0;
				if(getDir == 1) { 
					addX = snakeX[snakeX.length-2]+1; 
					addY = snakeY[snakeY.length-2];
				}
				if(getDir == 2) { 
					addX = snakeX[snakeX.length-2]-1; 
					addY = snakeY[snakeY.length-2];
				}
				if(getDir == 3) {}
				if(getDir == 4) {}
				snakeX[snakeX.length-1] = addX;
				snakeY[snakeY.length-1] = addY;
				snake[snake.length-1]   = snake.length;
				
			}
			
			System.out.println("==================");
			System.out.println(snake.length);
			for(int i=0; i<snake.length; i++) {
				System.out.print(snakeY[i] + " ");
			}
			System.out.println();
			for(int i=0; i<snake.length; i++) {
				System.out.print(snakeX[i] + " ");
			}
			System.out.println();
			System.out.println("==================");
			
	
		}
		
		
	}

}
