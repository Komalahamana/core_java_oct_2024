package com.ksg.flowcontrol;

public class SwitchVowelsDemo1 {
	
	public static void main(String[] args) {
		
		char ch = 'a';
		
		switch (ch) {
		case 'a':
			System.out.println("vowel");
		break;
			
		case 'e':
			System.out.println("vowel");
		break;
		
		case 'i':
			System.out.println("vowel");
			break;
			
		case '0':
			System.out.println("vowel");
			break ;
			
		case 'u':
			System.out.println("vowel");
			break ;
		
		default :
			System.out.println("Consonant");
			
		}
		}

}
