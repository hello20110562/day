import java.util.*;
//该程序用于验证input
public class InputTest{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		//得到第一个输入
		System.out.println("What is Your name?");
		String name =in.nextLine();
		//得到第二个输入
		System.out.print("How old are you?");
		int age = in.nextInt();
		//display output on console
		System.out.println("Hello,"+name+".Next year,you'll be"+(age+1));
	}
}