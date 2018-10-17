package test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTest {

	
	public static void main(String args[]) {
		
		//arrayTest();
		//splitPlay();
		//arrayPlay(5);
		//listPlay();
		linkedPlay();
	}
	
	public static void arrayTest() {
		String[] otikamisenkalo = {"ena","dio","tria","tessera"};
		
		for(String w:otikamisenkalo) {
			if(w.startsWith("tr")) {
				System.out.println(w + " tsikkin");
			}
		}
	}
	
	public static void splitPlay() {
		String planet = "jupiter,mars,saturn,venus";
		String[] planets=planet.split(",");
		for(String w:planets) {
			System.out.print(w + " // ");
		}
	}
	
	public static void arrayPlay(int size) {
		
		ArrayList<Integer> array = new ArrayList<Integer>(size);
		
		for(int i=1;i<=size;i++) {
			array.add(i);
		}
		
		System.out.println(array);
	}
	
	
	public static void listPlay() {
		String[] words= {"en","thelo","na","pao","sxolio","avrio"};
		List<String> mylist=new ArrayList<String>();
		
		for(String x:words) {
			mylist.add(x);
		}
		
		System.out.println(mylist);
	}
	
	public static void linkedPlay() {
		List<String> list1=new LinkedList<String>();
		List<String> list2=new LinkedList<String>();
		String[] planets1= {"Saturn","Jupiter","Earth"};
		String[] planets2= {"Venus","Neptune","Mars"};
		
		for(String p:planets1) {
			list1.add(p);
		}
		for(String p:planets2) {
			list2.add(p);
		}
		
		list1.addAll(list2);
		System.out.println(list1);
	}
	
	public static void removeStuff(ArrayList list1) {
		
	}
	
}