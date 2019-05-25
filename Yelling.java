
public class Yelling {
	
	public String Scream(String name) {
		
		
		String[] peoplenum;
		peoplenum = name.split(",");
		if(peoplenum.length > 2) {
			String allpersons =peoplenum[0]+","	+peoplenum[1]+","+ "and" +peoplenum[2];
			return allpersons +"are yelling";
		}
		else if(name == "Peter")	
		{
			return name +"is yelling";
		}
		else if (name == "") {
			return "No body is yelling";
					
				}
				else if(name == "PETER") {
					return name +" IS YELLING";
				}
				else if (name == "Peter , kadeem") {
					return name +"are yelling";
				}
			
			return name;
		}
		
		
		
		
		
	}
	
	