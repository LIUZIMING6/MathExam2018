

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
public class MathExam1253 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean r = args[0].matches("[0-9]+");
		String h = args[0].substring(0,1);
		int n=0;
		if(r==true && args[0].length()<5 && h!="0") {
			  n =  Integer.valueOf(args[0]);
		}else {
			System.out.println("输入有误，程序结束");
			System.exit(0);
		}
		Random rand = new Random();
		int d = 0;
		String x="";
		String y="";
		for(int i=1;i<=n;i++) {
		int c=(rand.nextInt(2));//0表示加法，1表示减法
		if(c==0) {
			int a=(rand.nextInt(100));//随机生成两个0-99的相加减的数,且之和不大于100
			int b=(rand.nextInt(100-a));
			d=a+b;
			if(i!=1) {
				x = x + "\n";
				y = y + "\n";
			}
			 x = x + "("+i+")"+" "  +  a+" "+"+"+" "+b+" "+"=";//将题目存入x
			 y = y + "("+i+")"+" "  +  a+" "+"+"+" "+b+" "+"="+" "+d;//将题目及答案存入y


		}else {

			int a=(rand.nextInt(100));//随机生成两个0-99的相加减的数,且b不大于a
			int b=(rand.nextInt(a+1));
			d=a-b;
			if(i!=1) {
				x = x + "\n";
				y = y + "\n";
			}
			 x = x + "("+i+")"+" "  +  a+" "+"-"+" "+b+" "+"=";//将题目存入x
			 y = y + "("+i+")"+" "  +  a+" "+"-"+" "+b+" "+"="+" "+d;//将题目及答案存入y


		}
		}
		String z=x;
		System.out.println(z);
		String k=y;
		System.out.println("\n"+k);
		try {
			File f = new File("out1253.txt");
			PrintStream f1 = new PrintStream(new FileOutputStream(f));
			System.setOut(f1);
			System.out.println(z);
			System.out.println(k);
		}catch (Exception e) {
		}
	}
		
	}




