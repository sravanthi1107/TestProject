

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		
		String str=" My name is Prasad";
		
		Map<Character,Integer> CharMapCount=new HashMap<>();
		for(Character c:str.toCharArray())
		{
			
			if(CharMapCount.containsKey(c))
			{
              
				CharMapCount.put(c,CharMapCount.get(c)+1 );
			}
			else
			{
				CharMapCount.put(c, 1);
}
		}

	System.out.println("duplicate occurance is");
System.out.println(CharMapCount);
}
}
