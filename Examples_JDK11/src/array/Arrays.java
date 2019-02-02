package array;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Arrays {

	public static void main(String[] args) {
		
		IntFunction<String[]> intFunction = new IntFunction<String[]>() {
		   
		    public String[] apply(int value) {
		        return new String[value];
		    }
		};
		
		List < Integer > listInts = new ArrayList < Integer> ();
		listInts.add(10);listInts.add(20);listInts.add(30);listInts.add(40);
		
		List < String > listStrs = new ArrayList < String> ();
		listStrs.add("VEnkat");listStrs.add("Saritha");listStrs.add("ok");listStrs.add("Gaytahri");
		
		//List < String > listStrsNew = listStrs.stream() .map((@Notnull var s) -> s.toLowerCase()) .collect(Collectors.toList());
		//System.out.println(listStrsNew);
		
		//String[] myNewArray = listInts.stream().toArray(intFunction);
		//System.out.println(myNewArray);
	}

}
