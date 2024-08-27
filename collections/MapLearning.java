package collections;

import java.util.HashMap;
import java.util.Map;

public class MapLearning {
	public static void main(String[] args) {
		Map<Integer,String> hm= new HashMap();
		hm.put(1, "Sindhu");
		hm.put(2, "Arjun");
		hm.put(3,"Mithran");
		//System.out.println(hm);
		//Map<Integer,String> hmm=new HashMap<Integer,String>();
		//hmm.put(new Integer(1) , "Shin-Chan");
		//System.out.println(hmm);
		//hmm.put(new Integer(1), "Doroemon");
		//System.out.println(hmm);
		//hmm.remove(new Integer(1));
		//System.out.println(hmm);
		hm.put(2, "Chocolate");
		System.out.println(hm);
		
		
		
	}

}
