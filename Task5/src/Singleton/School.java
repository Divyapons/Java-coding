package Singleton;

import java.util.ArrayList;

public class School {
	
    public final static School school = new School();
       private ArrayList<String> teachers;
      public School() {
    	teachers = new ArrayList<String>();
    	teachers.add("Divya");
    	teachers.add("Deva");
    	teachers.add("Lingam");
    	teachers.add("Pappa");
    	teachers.add("Anand");
    	teachers.add("Mala");
    	teachers.add("Mari");
    	teachers.add("Muthu");
    	
}
		public String getTeacher() {
			if(teachers.size()>0)
				return teachers.remove(0);
			return "No Teachers";
		}
			
	
}
