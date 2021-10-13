package practice;
import java.util.Scanner;
public class FindingDuplicateValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int count, flag, num = 0, flag2;
		char[] ch = str.toCharArray();
		int len = ch.length;
		char[] new_ch = new char[len];
		for (int a = 0; a < ch.length; a++) {
			count = 1;
			flag = 1;
			flag2 = 0;
			if (a==0) {
				new_ch[num] = ch[0];
				num++;
				continue;
		}
			//System.out.println(new_ch[1]);
			for (int k = 0; k < num+1; k++) {
				if (new_ch[k] == ch[a])		
					flag2++;
			}
			if (flag2 != 0) {
				new_ch[num] = ch[a];
				num++;
				for (int b = a + 1; b < ch.length; b++) {
					if (ch[a] == ch[b]) {
						count++;
					}
					if (ch[a] == ' ')
						flag++;
				}
				if (count >= 1 && flag == 1)
					System.out.println(ch[a] + " - " + count);
			}
		}
	}
}
