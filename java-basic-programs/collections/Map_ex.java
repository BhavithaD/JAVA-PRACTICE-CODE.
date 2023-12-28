package collections;
import java.util.HashMap;  
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
 

public class Map_ex {
public static void main(String[] args) {
	System.out.println("-----------------Duplicate Characters in string------------------------");
	String s1="Programming";
	LinkedHashMap<Character,Integer > fq=new LinkedHashMap<>();
	for(char ch:s1.toCharArray()) {
		if(fq.containsKey(ch)) {
			fq.put(ch, fq.get(ch)+1);
		}
		else {
			fq.put(ch,1);
		}
	}
	System.out.println(fq);
	for( Entry<Character, Integer> entry:fq.entrySet()) {
		//System.out.println(entry);
		if(entry.getValue()>1) {
			System.out.println(entry);
		}
		
	}
	System.out.println("----------------occurence of distinct characters------------------");
	char[] ch=s1.toCharArray();
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	int i=0;
	while(i!=ch.length) {
		if(map.containsKey(ch[i])==false)
		{
			map.put(ch[i], 1);
			}
		else {
			int old=map.get(ch[i]);
			map.put(ch[i], old+1);
			}
		i++;
		}
	for(Entry<Character,Integer> e1:map.entrySet()) {
//		if(e1.getValue()<=1) {
//			System.out.println(e1.getKey()+"-->"+e1.getValue());
//		}
		System.out.println(e1.getKey()+" present "+e1.getValue()+" times");
	}
	
	System.out.println("-----------Distinct characters in map-------------------");
	for(char ch1:s1.toCharArray()) {
		if(fq.containsKey(ch)) {
			fq.put(ch1, fq.get(ch)+1);
		}
		else {
			fq.put(ch1,1);
		}
	}
	System.out.println(fq);
	System.out.println("-----------------------first max element in Map----------------------");
	 char ch2='\0';
	 int maxelemnt=0;
	 for(Entry<Character,Integer> e1:map.entrySet()) {
		 if(e1.getValue()>maxelemnt) {
			ch2=e1.getKey();
			maxelemnt=e1.getValue();
		 }
	 }
	 System.out.println(ch2+" present "+ maxelemnt+" times");
	 
		
	}
	

}
