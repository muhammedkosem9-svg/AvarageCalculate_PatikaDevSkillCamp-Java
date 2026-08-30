package program;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int Turkce,Fizik,Kimya,Biyoloji,Muzik,Matematik;
		
		System.out.println("Enter your Turkish lesson grade:");
		
		Turkce = in.nextInt();
		
		System.out.println("Enter your pyhsics lesson grade: ");
		
		Fizik = in.nextInt();
		
		System.out.println("Enter your chemistry lesson grade: ");
		
		Kimya = in.nextInt();
		
		System.out.println("Enter your biology lesson grade: ");
		
		Biyoloji = in.nextInt();
		
		System.out.println("Enter your music lesson grade: ");
		
		Muzik = in.nextInt();
		
		System.out.println("Enter your math lesson grade: ");
		
		Matematik = in.nextInt();
		
		in.close();
		
		int total = Turkce + Fizik + Kimya + Biyoloji + Muzik + Matematik;
		
		double avarage = total / 6;
		
		String result = avarage >= 0 ? "Passed" : "Failed";
		
		System.out.println( avarage + ":" + result);
		
		
	

	}

}
