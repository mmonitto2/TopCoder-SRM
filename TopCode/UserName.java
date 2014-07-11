
public class UserName {

  public String newMember(String[] existingNames, String newNames) {
    int numberOfnames = 0;
	String name = newNames;
	boolean found = false;
	do {
	  found = false;
	  for(int i = 0; i < existingNames.length; i++) {
	    if (existingNames[i].equals(name)){
	      found = true;
	      break;
	    }
	  }
	  if(found) {
	    numberOfnames++;
	    name = newNames + numberOfnames;
	  }
	}while(found);
	return name;
  }


  public static void main(String[] args) {
    String newName = "grokster1";
	String[] existingNames = {"grokster2", "BrownEyedBoy", "Yoop", "BlueEyedGirl", 
 "grokster", "Elemental", "NightShade", "Grokster1"};

	UserName Name = new UserName();
	System.out.println(Name.newMember(existingNames, newName));
	
  }
}
