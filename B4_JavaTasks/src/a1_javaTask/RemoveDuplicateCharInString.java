package a1_javaTask;

import java.util.Arrays;

public class RemoveDuplicateCharInString {

	
	public static void main(String[] args) {
		int index=0;
		String str="hello";
		char[] ch=str.toCharArray();
		int length=(ch.length);
		for(int i=0;i<length;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(ch[i]==ch[j]) {
					break;
				}
			}
			if(j==i) {
				ch[index++]=ch[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(ch, index)));
		
	}
}
