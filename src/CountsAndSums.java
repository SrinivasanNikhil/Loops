import java.io.File;
import java.util.Scanner;

public class CountsAndSums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 0;
		while(i<= 10)
		{
			System.out.println(i);
			i++;
		}
		
		int sum=0;
		int j = 1;
		while(j<=10)
		{
			System.out.println(sum);
			sum += j;
			j++;
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n :");
		int n = scan.nextInt();
		
		i = 0;
		while(i<n)
		{
			System.out.println(i);
			i++;
		}
		
		
		System.out.println("Enter n :");
		 n = scan.nextInt();
		 
		 i =0;
		 while(i<n)
		 {
			 if(Math.floorMod(i, 2) == 0)
			 {
					System.out.println(i);
			 }
			 i++;
		 }
		
		//Times table
		 System.out.println("Enter n :");
		 n = scan.nextInt();
		 
		 i =0;
		 while(i<=12)
		 {
			 System.out.println(n + " times " + i + " is " + n*i);
			 
			 i++;
		 }
		 
		 
		
		File aFile;
		Scanner reader = null;
		
		try
		{
			 aFile = new File("./src/names.txt");
			 reader = new Scanner(aFile);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		while(reader.hasNext())
		{
			System.out.println(reader.nextLine());
		}
		
	}

}
