package arrays;

public class Person 
{
		public static final String[] FIRST_START = {"Chr","Am", "L","D","Br", "Ti", "J", "A" };
		public static final String[] FIRST_MIDDLE= {"ala","ima", "e","o","or","anna", "ola", "be","a"};
		public static final String[] FIRST_END= {"na","ck", "n","d","tt", "rian", "lius","lion"};
		
		public static final String[] LAST_START = {"Bl","Gr", "Ph","M","Thr", "Sh", "Br"};
		public static final String[] LAST_MIDDLE = {"an","in", "ast","own","il",};
		public static final String[] LAST_END = {"strom","son", "rack","les","vin", "ston"};
		
		
		private String firstName;
		private String lastName;
		private Borough home;
		public Person(String first,String last,Borough home)
		{
			this.firstName = first;
			this.lastName = last;
			this.home= home;

		}












	
}
