package ConsoleTest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Test1 {
	static char[]stack = new char[100];
	
	static int ptr = 49;
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			stack[i]=0;
		}
	
		Scanner in = new Scanner(System.in);
		String code = in.nextLine();
		char []codeChar =code.toCharArray();
		for(int i=0;i<codeChar.length;i++){
			
			switch (codeChar[i]) {
			case ',':
				stack[ptr] = in.nextLine().charAt(0);
				break;
			case '.':
				System.out.println(stack[ptr]);
				break;
			case '<':
				ptr--;
				break;
			case '>':
				ptr++;
				break;
			case '+':
				
				stack[ptr]++;
				break;
			case '-':
				stack[ptr]--;
				break;
			case '[':
				int temp = i;
				while(stack[ptr] != 0){
					i = temp;
				while(codeChar[i] != ']'){
					switch (codeChar[i]) {
					case '.':
						stack[ptr] = in.nextLine().charAt(0);
						break;
					case ',':
						System.out.println(stack[ptr]);
						break;
					case '<':
						ptr--;
						break;
					case '>':
						ptr++;
						break;
					case '+':
						stack[ptr]++;
						break;
					case '-':
						stack[ptr]--;
						break;
					}
					i++;
				}
				
				}
			default:
				break;
			}
		}
		
	}
	public void analyseCode(){
		
	}

}
