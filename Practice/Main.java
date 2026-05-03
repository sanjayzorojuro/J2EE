// split function
// public class Main {
//     public static void main(String[] args) {
//         String text = "apple,banana,mango";
//         String[] fruits = text.split(",");

//         for (String fruit : fruits) {
//             System.out.println(fruit);
//         }

//     }
// }

// String text = "one:two:three:four";
// String[] result = text.split(":", 2);

// for (String s : result) {
//     System.out.println(s);
// }


//region matches()
// boolean regionMatches(int toffset, String other, int ooffset, int len)

// boolean regionMatches(boolean ignoreCase,
//                       int toffset,
//                       String other,
//                       int ooffset,
//                       int len)
// public class Main {
//     public static void main(String[] args) {
//         String str1 = "HelloWorld";
//         String str2 = "World";

//         boolean result = str1.regionMatches(5, str2, 0, 5);
//         System.out.println(result);
//     }
// }




// getchars() and replace()
// void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)

// public class Main {
//     public static void main(String[] args) {
//         String str = "HelloWorld";
//         char[] arr = new char[5];

//         str.getChars(0, 5, arr, 0);

//         System.out.println(arr);
//     }
// }

// String replace(char oldChar, char newChar)

// String replace(CharSequence target, CharSequence replacement)

// public class Main {
//     public static void main(String[] args) {
//         String str = "banana";
//         String result = str.replace('a', 'o');

//         System.out.println(result);
//     }
// }




// string buffer class method a insert() b. deletecharat()
// StringBuffer insert(int offset, String str)
// StringBuffer insert(int offset, char c)

// public class Main {
//     public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer("HelloWorld");

//         sb.insert(5, " ");

//         System.out.println(sb);
//     }
// }

// StringBuffer deleteCharAt(int index)

// public class Main {
//     public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer("Hello");

//         sb.deleteCharAt(1);

//         System.out.println(sb);
//     }
// }