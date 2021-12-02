package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) throws FileNotFoundException{
		File input = new File("resources/inputs/input1.txt");
		System.out.println(part1(input));
		System.out.println(part2(input));
	}
	
	public static int part1(File input) throws FileNotFoundException{
		Scanner sc = new Scanner(input);
		int increases = 0;
		int currentDepth = 10000000, newDepth;
		while(sc.hasNextLine()){
			newDepth = Integer.valueOf(sc.nextLine());
			if(newDepth > currentDepth) {
				increases++;
			}
			currentDepth = newDepth;
		}
		sc.close();
		return increases;
	}
	
	public static int part2(File input) throws FileNotFoundException{
		Scanner sc = new Scanner(input);
		int increases = 0, i = 0;
		ArrayList<Integer> depth = new ArrayList<Integer>();
		while(sc.hasNextLine()){
			depth.add(Integer.valueOf(sc.nextLine()));
			if(i > 2) {
				if(depth.get(i) > depth.get(i-3)) {
					increases++;
				}
			}
			i++;
		}
		sc.close();
		return increases;
	}

}
