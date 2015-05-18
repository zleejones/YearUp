
public class Person 
{
   private String m_name;
   private int m_age;
   private String m_phoneNumber;
   private String m_address;
   
   public Person(String name, int age, String phoneNumber, String address)
   {
	   SetName(name);
	   SetAge(age);
	   SetPhoneNumber(phoneNumber);
	   SetAddress(address);
   }
   
   public String GetName()
   {
	   return m_name;
   }
   
   private void SetName(String name)
   
   {
	   m_name = name;
   }
   
   public int GetAge()
   {
	   return m_age;
   }
   
   private void SetAge(int age)
   
   {
	   m_age = age;
   }
   
   public String GetPhoneNumber()
   {
	   return m_phoneNumber;
   }
   
   private void SetPhoneNumber(String phoneNumber)
   
   {
	   m_phoneNumber = phoneNumber;
   }
   
   public String GetAddress()
   {
	   return m_address;
   }
   
   private void SetAddress(String address)
   
   {
	   m_address = address;
   }
   
   public int GrowsOlder()
   { 
	  return m_age++;
   }
}

