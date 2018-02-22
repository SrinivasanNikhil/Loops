
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		int userNum;
//		int i = 0;
//		int j = 0;
//
//		userNum = 3;
//
//		for (i = 0; i <= userNum; i++) 
//		{
//			for (j = 0; j < i; j++) {
//					System.out.print(" ");
//				}
//
//		
//			System.out.println(i);
//
//		}
		
		
			      int numRows = 2;
			      int numCols = 3;

			      // Note: You'll need to declare more variables

			      int rowNumber = 1;
			      
			      while(rowNumber <= numRows)
			      {
			    	  	char colLetter = 'A';
			    	  
			    	  	int j= 1;
			    	  	while(j <= numCols)
			    	  	{
			    	  		System.out.print(rowNumber + "" + colLetter + " ");
			    	  		j++;
			    	  		colLetter++;
			    	  	}
			    	  
			    	  
			    	  rowNumber++;
			      }
			      
			      
			      System.out.println("");

	}

}
