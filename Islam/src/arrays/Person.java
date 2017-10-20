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
		private Hobby hobby;
		private Person[] friends;
		private String nickname;
		
		public static String createNickname(String name)
		{
			name = name.toLowerCase();
			String[] vowels = new String[name.length()];
			int vowelCounter = 0;
			for(int i = 0; i<name.length();i++)
			{
				String letter = name.substring(i, i+1);
				if(isVowel(letter))
				{
					vowels[vowelCounter] = letter;
					vowelCounter++;
				}
			}
			if(vowels.length < 2)
			{
				return name;
			}
			return name.substring(0,name.indexOf(vowels[1]));
			
		}
		public String getFirstName() 
		{
			return firstName;
		}
		public void setFirstName(String firstName) 
		{
			this.firstName = firstName;
		}
		private static boolean isVowel(String vol)
		{
			vol = vol.toLowerCase();
			if(vol.equals("a") || vol.equals("e") 
			|| vol.equals("i") || vol.equals("o") || vol.equals("u"))
			{
				return true;
			}
			return false;
		}
		public Person(String first,String last,Borough home)
		{
			this.firstName = first;
			this.lastName = last;
			this.home= home;
			friends = new Person[3];
			hobby = Hobby.randomHobby();
			nickname = createNickname(firstName);

		}
		public void stateYourFriends()
		{
			String statement = "My friends are";
			for(int i = 0; i < friends.length-1;i++)
			{
				statement += friends[i].firstName + ",";
			}
			statement+= "and" + friends[friends.length-1];
			System.out.println(statement);
			
		}
		public void mingle(Person[] peers)
		{
			for(Person p:peers)
			{
				if(p != this)
				{
					setInFirstPlace(p);
				}
			}
		}
		public void setInFirstPlace(Person f)
		{
			for(int i = friends.length-1; i>0;i-- )
			{
				friends[i] = friends[i -1];
			}
			friends[0] = f;
		}
		public String toString()
		{
			return "Hi My name is" + " " + firstName+ " "  + lastName + ".Call me" + nickname + " " 
			+  " "  +"and I am from" + " " + home;
		}
		











	
}
