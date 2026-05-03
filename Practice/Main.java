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
