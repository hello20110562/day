import java.util.*;
//�ó���������֤input
public class InputTest{
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		//�õ���һ������
		System.out.println("What is Your name?");
		String name =in.nextLine();
		//�õ��ڶ�������
		System.out.print("How old are you?");
		int age = in.nextInt();
		//display output on console
		System.out.println("Hello,"+name+".Next year,you'll be"+(age+1));
	}
}