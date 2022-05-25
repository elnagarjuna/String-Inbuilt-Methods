package string_methods;

import java.util.*;

public class BuiltinMethods {
	
	String str1;
	String str2;
	
	BuiltinMethods(String str1, String str2){
		this.str1 = str1;
		this.str2 = str2;
	}
	
	public char CharAt(int n) {
		int i;
		char c = 0;
		char[] ch = str1.toCharArray();
		try{
			for (i = 0; i < ch['\0']; i++) {
				if(i == n) {
					c = ch[i];
				}
			}
			return c;
		}catch(Exception e) {System.out.println(e);}
		return c;
	}
	
	public int CodePointAt(int n) {
		char c = CharAt(n);
		return (int)c;
	}
	
	public int CodePointBefore(int n) {
		char c = CharAt(n-1);
		return (int)c;
	}
	
	public int CodePointCount(int s, int e) {
		int count = 0;
		while(s < e) {
			count++;
			s++;
		}
		return count;
	}
	
	public int CompareTo() {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int i = 0, compared = -1;
		while(((i < Length(str1)) && (i < Length(str2))) && (Length(str1) == Length(str2))) {
			if((int)ch1[i] == (int)ch2[i]) {
				compared = 0;
				i++;
			}
			else {
				compared = -1;
				break;
			}
		}
		return compared;
	}
	
	public int CompareToIgnoreCase() {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int i = 0, compared = -1;
		while(((i < Length(str1)) && (i < Length(str2))) && (Length(str1) == Length(str2))) {
			if((((int)ch1[i]-(int)ch2[i] == -32) || ((int)ch1[i]-(int)ch2[i] == 32)) || (int)ch1[i]-(int)ch2[i] == 0) {
				compared = 0;
				i++;
			}else {
				compared = -1;
				break;
			}
		}
		return compared;
	}
	
	public String ConCat() {
		String str = str1+str2;
		return str;
	}
	
	public Boolean Contains(String str) {
		boolean flag = false;
		int i = 0, j = 0, count = 0;
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str.toCharArray();
		if(Length(str) <= Length(str1)) {
			for (i = 0; i < Length(str1); i++) {
				if(ch1[i] == ch2[0]) {
					for (j = 0; j < Length(str); j++) {
						if(ch1[i] == ch2[j]) {
							i++;
							count++;
						}
						if(count == Length(str)) {
							flag = true;
						}
					}
				}
			}
		}
		return flag;
	}	
	
	public Boolean ContentEquals(String str) {
		boolean flag = false;
		int i = 0;
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str.toCharArray();
		while(((i < Length(str1)) && (i < Length(str))) && ((Length(str) <= Length(str1)))) {
			if(ch1[i] == ch2[i]) {
				flag  = true;
				i++;
			}else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public String CopyValueOf(int s, int e) {
		int i = 0, len = e-s;
		char[] ch = new char[len];
		while(s < e) {
			ch[i++] = CharAt(s);
			s++;
		}
		String str = new String(ch);
		return str;
	}
	
	public Boolean EndsWith(String str) {
		boolean flag = false;
		int i = Length(str1)-1, j = Length(str)-1;
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str.toCharArray();
		while((i >= 0) && (j >= 0)) {
			if (ch1[i] == ch2[j]) {
				flag = true;
				i--;
				j--;
			}else {
				flag = false;
				break;	
			}
		}
		return flag;
	}
	
	public Boolean Equals(String str) {
		boolean flag = false;
		int i = 0;
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str.toCharArray();
		while((Length(str1) == Length(str)) && (i < Length(str))) {
			if(ch1[i] == ch2[i]) {
				flag  = true;
				i++;
			}else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public Boolean EqualsIgnoreCase(String str) {
		boolean flag = false;
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str.toCharArray();
		int i = 0;
		while(((i < Length(str1)) && (i < Length(str))) && (Length(str) <= Length(str1))) {
			if((((int)ch1[i]-(int)ch2[i] == -32) || ((int)ch1[i]-(int)ch2[i] == 32)) || (int)ch1[i]-(int)ch2[i] == 0) {
				flag = true;
				i++;
			}else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public byte[] GetBytes() {
		char[] ch = str1.toCharArray();
		byte[] barr = new byte[Length(str1)];
		int i = 0;
		while(i < Length(str1)) {
			barr[i] = (byte)ch[i];
			i++;
		}
		return barr;
	}
	
	public void GetChars(int s, int e, char[] ch, int i) {
		int len = e - s;
		ch = new char[len];
		System.out.print("15. Gets Characters of String       : ");
		while(s < e) {
			if (i != len-1) {
				System.out.print(ch[i++] = CharAt(s));
				s++;
			}else {
				System.out.println(ch[i++] = CharAt(s));
				s++;
			}	
		}
	}
	
	public int IndexOf(String str) {
		int i = 0, j = 0, count = 0, ans = 0;
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str.toCharArray();
		if(Length(str) <= Length(str1)) {
			for (i = 0; i < Length(str1); i++) {
				if(ch1[i] == ch2[0]) {
					for (j = 0; j < Length(str); j++) {
						if(ch1[i] == ch2[j]) {
							i++;
							count++;
						}
						if(count == Length(str)) {
							ans = i - count; 
						}
					}
				}
			}
		}
		return ans;
	}
	
	public Boolean IsEmpty(String str) {
		boolean flag = false;
		if(str == "") {
			flag = true;
		}
		return flag;
	}
	
	public int LastIndexOf(String str) {
		int i, j = 0, count = 0, ans = 0;
		char[] ch1 = str2.toCharArray();
		char[] ch2 = str.toCharArray();
		if(Length(str) <= Length(str1)) {
			for (i = Length(str2)-1; i >= 0; i--) {
				if(ch1[i] == ch2[Length(str)-1]) {
					for (j = Length(str)-1; j >= 0; j--) {
						if(ch1[i] == ch2[j]) {
							i--;
							count++;
						}
						if(count == Length(str)) {
							ans = i+1; 
						}
					}
				}
			}
		}
		return ans;
	}
	
	public int Length() {
		int l = 0;
		char[] ch = str1.toCharArray();
		for (char c : ch) {
			l++;
		}
		return l;
	}
	
	public int Length(String str) {
		int l = 0;
		char[] ch = str.toCharArray();
		for (char c : ch) {
			l++;
		}
		return l;
	}
	
	public int OffsetByCodePoints(String str, int s, int e) {
		int index;
		if((s+e) > Length(str)-1) {
			index = 0;
		}else {
			index = s+e;
		}
		return index;
	}
	
	public String Replace(String str, char ch, char replace) {
		char[] ch1 = str.toCharArray();
		for (int i = 0; i < Length(str); i++) {
			if(ch1[i] == ch) {
				ch1[i] = replace;
			}
		}
		String st = new String(ch1);
		return st;
	}
	
	public String ReplaceFirst(char ch, char replace) {
		char[] ch1 = str1.toCharArray();
		for (int i = 0; i < Length(str1); i++) {
			if(ch1[i] == ch) {
				ch1[i] = replace;
				break;
			}
		}
		String str = new String(ch1);
		return str;
	}
	
	public String[] Split(char ch) {
		char[] ch1 = str1.toCharArray();
		String str = "";
		List<String> al = new ArrayList<String>();
		for (int i = 0; i < Length(str1); i++) {
			if(ch1[i] != ch) {
				str += ch1[i];
			}else {
				al.add(str);
				str ="";
			}
		}
		al.add(str);
		String[] strarr = new String[al.size()];
		for (int i = 0; i < al.size(); i++) {
			strarr[i] = al.get(i);
		}
		return strarr;
	}
	
	public Boolean StartsWith(String str) {
		boolean flag = false;
		int i = 0, j = 0;
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str.toCharArray();
		while((i < Length(str1) && j < Length(str)) && (Length(str) <= Length(str1))) {
			if (ch1[i] == ch2[j]) {
				flag = true;
				i++;
				j++;
			}else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public String SubSequence(int s, int e) {
		int len = e - s, i = 0;
		char[] ch = new char[len];
		while (s < e) {
			ch[i++] = CharAt(s);
			s++;
		}
		String str = new String(ch);
		return str;
	}
	
	public String SubString(int s, int e) {
		return SubSequence(s, e);
	}
	
	public char[] ToCharArray() {
		char[] ch = new char[Length(str1)];
		for (int i = 0; i < Length(str1); i++) {
			ch[i] = CharAt(i);
		}
		return ch;
	}
	
	public String ToLowerCase(String st) {
		char[] ch = st.toCharArray();
		char[] ch1 = new char[Length(st)];
		int i = 0;
		while(i < Length(st)) {
			if(((int)ch[i] >= 65) && ((int)ch[i] <= 90)) {
				ch1[i] = (char)((int)ch[i] + 32);
				i++;
			}
			else {
				ch1[i] = ch[i];
				i++;
			}
		}
		String str = new String(ch1);
		return str;
	}
	
	public String ToUpperCase(String st) {
		char[] ch = st.toCharArray();
		char[] ch1 = new char[Length(st)];
		int i = 0;
		while(i < Length(st)) {
			if(((int)ch[i] >= 97) && ((int)ch[i] <= 122)) {
				ch1[i] = (char)((int)ch[i] - 32);
				i++;
			}
			else {
				ch1[i] = ch[i];
				i++;
			}
		}
		String str = new String(ch1);
		return str;
	}
	
	public String Trim() {
		int s = 0, e = 0;
		char[] ch = str2.toCharArray();
		for (int i = 0; i < Length(str2); i++) {
			if(ch[i] != ' ') {
				s = i;
				break;
			}
		}
		for (int i = Length(str2)-1; i >= 0; i--) {
			if(ch[i] != ' ') {
				e = i;
				break;
			}
			
		}
		int len = (e-s)+1;
		char[] ch1 = new char[len];
		int i = 0;
		while (i < len) {
			ch1[i++] = ch[s++];
		}
		String str = new String(ch1);
		return str;
	}
}