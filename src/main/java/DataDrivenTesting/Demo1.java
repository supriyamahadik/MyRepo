package DataDrivenTesting;

public class Demo1 {

	public static void main(String[] args) {
		String[][] abc = new String[5][3];

		// Add values inside the array
		abc[0][0] = "firstname1";
		abc[0][1] = "middlename1";
		abc[0][2] = "lastname1";

		abc[1][0] = "firstname2";
		abc[1][1] = "Middlename2";
		abc[1][2] = "Lastname2";

		abc[2][0] = "firstname3";
		abc[2][1] = "middlename3";
		abc[2][2] = "lastname3";

		abc[3][0] = "firstname4";
		abc[3][1] = "middlename4";
		abc[3][2] = "lastname4";

		abc[4][0] = "firstname5";
		abc[4][1] = "middlenam5";
		abc[4][2] = "lastname5";

		
		System.out.println(abc[0][0]);//firstname1
		System.out.println(abc[1][0]);//firstname2
		System.out.println(abc[2][0]);//firstname3
		System.out.println(abc[3][0]);//firstname4
		System.out.println(abc[4][0]);//firstname5
		
        int a = abc.length;                                       //it will count rows
		System.out.println(a);                              //5
		
		for(int i=0;i<abc.length;i++)
		{
			
			System.out.println(abc[i][0]);//fn1 fn2 fn3 fn4 fn5
			
		}

              System.out.println("_______________________________________");		

              for (int i = 0; i < abc.length; i++) 
              {
			System.out.println(abc[i][0] + "  " + abc[i][1] + "  " + abc[i][2]);
	     }
	}

}
