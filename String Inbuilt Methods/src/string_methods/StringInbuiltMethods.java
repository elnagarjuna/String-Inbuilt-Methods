package string_methods;

import java.util.*;

public class StringInbuiltMethods {

	public static void main(String[] args) {
		
		String str1 = "Zoho corp";
		String str2 = "  Welcome to zoho ";
		BuiltinMethods bm = new BuiltinMethods(str1, str2);
		
		System.out.println("01. Character at the index of       : "+bm.CharAt(8));
		System.out.println("02. Code Point of the index of      : "+bm.CodePointAt(2));
		System.out.println("03. Code Point before the index of  : "+bm.CodePointBefore(6));
		System.out.println("04. Code Point count is             : "+bm.CodePointCount(3, bm.Length()));
		System.out.println("05. String compare with Lex.        : "+bm.CompareTo());
		System.out.println("06. String Compare Ignore case      : "+bm.CompareToIgnoreCase());
		System.out.println("07. String Concatenation            : "+bm.ConCat());
		System.out.println("07. String Contains Sub-String      : "+bm.Contains("ll"));
		System.out.println("09. String Content is Equal         : "+bm.ContentEquals("Hello"));
		System.out.println("10. Copy the String values          : "+bm.CopyValueOf(1, 7));
		System.out.println("11. String Ends With                : "+bm.EndsWith("rp"));
		System.out.println("12. String Equals                   : "+bm.Equals("Zoho corp"));
		System.out.println("13. String Equals Ignore case       : "+bm.EqualsIgnoreCase("ZoHo CoRp"));
		System.out.println("14. String to Bytecode              : "+Arrays.toString(bm.GetBytes()));
		char[] ch = null;
		bm.GetChars(2, 8, ch, 0);
		System.out.println("16. String Index                    : "+bm.IndexOf("oho"));
		System.out.println("17. String is Empty or Not          : "+bm.IsEmpty(str1));
		System.out.println("18. String Last Index               : "+bm.LastIndexOf("world"));
		System.out.println("19. Length of the String            : "+bm.Length());
		System.out.println("20. String Offset by Code Points    : "+bm.OffsetByCodePoints(str1, 2, 8));
		System.out.println("21. Replace String Characters       : "+bm.Replace(str1, 'o', 'n'));
		System.out.println("22. Replace First String Characters : "+bm.ReplaceFirst('o', 'k'));
		System.out.println("23. String Split                    : "+Arrays.toString(bm.Split(' ')));
		System.out.println("24. String Starts With              : "+bm.StartsWith("Hell"));
		System.out.println("25. String Sub Sequence             : "+bm.SubSequence(2, 7));
		System.out.println("26. Sub String                      : "+bm.SubString(1, 6));
		System.out.println("27. String to Character Array       : "+Arrays.toString(bm.ToCharArray()));
		System.out.println("28. String To Lower Case            : "+bm.ToLowerCase(str2));
		System.out.println("29. String to Upper Case            : "+bm.ToUpperCase(str1));
		System.out.println("30. String Trim                     : "+bm.Trim());
	}
}