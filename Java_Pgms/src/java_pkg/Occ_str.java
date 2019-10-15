package java_pkg;

public class Occ_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String string = "Spring is beautiful but so is winter";
	      String word = "so";
	      String temp[] = string.split(" ");
	      int count = 0;
	      for (int i = 0; i < temp.length; i++) {
	         if (word.equals(temp[i])) 
	            count++;
	      }
	      System.out.println("The string is: " + string);
	      System.out.println("The word " + word + " occurs " + count + " times in the above string");


	}

}
