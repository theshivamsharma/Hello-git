import java.util.*;
class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("first name","shivay");
		hm.put("Last name","sharma");
		hm.put("address","kangra");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue());  
		}
	}
}