/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package system.mavenproject1;

import java.util.Scanner;

enum nums {
    ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), ELEVEN(11), TWELVE(12), THIRTEEN(13), FOURTEEN(14), FIFTEEN(15), SIXTEEN(16), SEVENTEEN(17), EIGHTEEN(18), NINETEEN(19), TWENTY(20), THIRTY(30), FORTY(40), FIFTY(50), SIXTY(60), SEVENTY(70), EIGHTY(80), NINETY(90);

    int value;

    nums(int value) {
        this.value = value;
    }
    
    static String getstring(int n){
        for (nums v : values()){
            if(v.value == n){
                return v.toString();
            }
        }
        return " ";
    }

}

public class Mavenproject1 {

    static String convert(int n){
        if(n<20)
            return nums.getstring(n);
        if(n%10 == 0)
            return nums.getstring(n);
        else
            return nums.getstring((n/10)*10)+" "+nums.getstring(n%10);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if(num == 0){
            System.out.println(nums.ZERO.toString());
            return;
        }
        String word = "";
        if(num >=1000){
           word +=  convert(num/1000)+ " thousand ";
           num %= 1000;
        }
        if(num >= 100){
            word += convert(num/100)+" hundred ";
            num %= 100;
        }
        if(num >0){
            word+= convert(num);
        }

        System.out.println("word is:"+word);
    }
}
