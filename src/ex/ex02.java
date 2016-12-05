package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int a = scn.nextInt();
double sum = 0;
double sun = 0;
if(a<=120){
	System.out.println(a*2.10);
	System.out.println(a*2.10);
}else{
    sum = sum+120*2.10;
    sun = sun+120*2.10;
	if(a>=121&&a<=330){
		System.out.println(sum+(a-120)*3.02);
		System.out.println(sum+(a-120)*2.68);
	}else{
		sum = sum+210*3.02;
		sun = sun+210*2.68;
		if(a>=331&&a<=500){
			System.out.println(sum+(a-330)*4.39);
			System.out.println(sun+(a-330)*3.61);
		}else{
			sum = sum+170*4.39;
			sun = sun+170*3.61;
			if(a>=501&&a<=700){
				System.out.println(sum+(a-500)*4.97);
				System.out.println(sun+(a-500)*4.01);
			}else{
				sum = sum+200*4.97;
				sun = sun+200*4.01;
				System.out.println(sum+(a-700)*5.63);
				System.out.println(sun+(a-700)*4.50);
			}
		}
	}
}

	}

}
