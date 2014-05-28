//Writing Words 4/24/2014
//complete 5/4/2014

import java.math.*;
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class WritingWords {
 public static int write(String word) {
    int sum = 0;
    for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);			//loops through each character in string
        sum += ((byte)ch - (byte)'A') + 1; //convert between the character and its numeric representation
    }
    return sum;
}
	
	  public static void main(String[] args)
     {
	    String o = "VAMOSGIMNASIA";
	 
       System.out.println(write(o));
     }
  }
  
