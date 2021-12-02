package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) throws FileNotFoundException{
		File input = new File("resources/inputs/input2.txt");
		System.out.println(part1(input));
		System.out.println(part2(input));
	}
	
	public static int part1(File input) throws FileNotFoundException{
		int x = 0, y = 0, value;
		String currentLine, instruction;
		String[] parts;
		Scanner sc = new Scanner(input);
		while(sc.hasNextLine()) {
			currentLine = sc.nextLine();
			parts = currentLine.split(" ");
			instruction = parts[0];
			value = Integer.valueOf(parts[1]);
			if(instruction.equals("up")) {
				y -= value;
			} else if(instruction.equals("down")) {
				y += value;
			} else if(instruction.equals("forward")) {
				x += value;
			}
		}
		sc.close();
		return x*y;
	}
	
	public static int part2(File input) throws FileNotFoundException{
		int horizontalPosition = 0, depth = 0, aim = 0, value;
		String currentLine, instruction;
		String[] parts;
		Scanner sc = new Scanner(input);
		while(sc.hasNextLine()) {
			currentLine = sc.nextLine();
			parts = currentLine.split(" ");
			instruction = parts[0];
			value = Integer.valueOf(parts[1]);
			if(instruction.equals("up")) {
				aim -= value;
			} else if(instruction.equals("down")) {
				aim += value;
			} else if(instruction.equals("forward")) {
				horizontalPosition += value;
				depth += aim*value;
			}
		}
		sc.close();
		return depth*horizontalPosition;
	}
	
}
