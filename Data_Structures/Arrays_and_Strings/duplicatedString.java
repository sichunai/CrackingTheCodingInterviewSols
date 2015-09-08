import java.util.Scanner;

public class duplicatedString {

	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner (System.in);
		str = scan.nextLine();
		str = str.toLowerCase();
		int [] ascii = new int [123]; //random array size
		if (str.length() > 123)
		{
			System.out.println("duplicated character");
		}
		for (int i = 0; i < str.length(); i++)
		{
			char aChar = str.charAt(i);
			if (ascii[(int) aChar] == 1 )
			{
				System.out.println("duplicated character");
			}
			ascii[(int) aChar] = 1;
		}
		
	}

}
