package lab2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

public class HashMapSort {
	static Logger log = Logger.getLogger(HashMapSort.class.getName());
	 public static void main(String[] args) {
	
	        HashMap<String, String> map = new HashMap<>();
	        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
	        ArrayList<String> list = new ArrayList<>();
	        map.put("1", "Chennai");
	        map.put("8", "MuMbai");
	        map.put("4", "Delhi");
	        map.put("7", "Punjab");
	        map.put("6", "kolkata");
	        map.put("9", "Rajasthan");
	        map.put("2", "Bangolore");
	        for (Map.Entry<String, String> entry : map.entrySet()) {
	            list.add(entry.getValue());
	        }
	        Collections.sort(list, new Comparator<String>() {
	            public int compare(String str, String str1) {
	                return (str).compareTo(str1);
	            }
	        });
	        for (String str : list) {
	            for (Entry<String, String> entry : map.entrySet()) {
	                if (entry.getValue().equals(str)) {
	                    sortedMap.put(entry.getKey(), str);
	                }
	            }
	        }
	       log.info(""+ sortedMap);
	    }

}

