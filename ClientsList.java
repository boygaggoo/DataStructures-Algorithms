import java.util.*;

public class ClientsList {
	public String[] dataCleanup(String[] names) {
		Person p;
		String[] ans = new String[names.length];
		ArrayList<Person> clients = new ArrayList<>();
		for(int i=0; i<names.length; i++){
			p = new Person(names[i]);
			clients.add(p);
		}
		Collections.sort(clients); //sort arrayList of clients by name
		for(int i=0; i<ans.length;i++){
			ans[i] = clients.get(i).toStr(); //format names
		}
		return ans;
   }
	 public class Person implements Comparable<Person>{
			String first;
			String last;
			
			//assign correct strings as first and last names
			public Person(String s) {
				if(s.contains(",")){
					first = s.split("\\, ")[1];
					last = s.split("\\, ")[0];
				}
				else{
				first = s.split(" ")[0];
				last = s.split(" ")[1];
				}
			}
			//concatenate full name
			public String toStr(){
				return first + " " + last;
			}
			@Override
			public int compareTo(Person p) {	
				//compare by last name
				int lastComp = (this.last).compareTo(p.last);
				if(lastComp == 0 ){ //compare by first name
					return (this.first).compareTo(p.first);
				}
				return lastComp;
			}
		}
}
