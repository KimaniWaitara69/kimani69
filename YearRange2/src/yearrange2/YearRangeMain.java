/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yearrange2;


public class YearRangeMain {
public static void main(String [] args){
//Get all years divisible by 14 and 20

yearRangeClass myFirstRange = new yearRangeClass(1314, 2014);
myFirstRange.setRangeType(1);

//Get all leap years.
yearRangeClass mySecondRange = new yearRangeClass(1100, 3150);
mySecondRange.setRangeType(2);

//Get all Olympic years divisible by 3
yearRangeClass myThirdRange = new yearRangeClass(1500, 1890);
myThirdRange.setRangeType(3);

System.out.println(&quot;List of all years divisible by &quot; + myFirstRange.getFirstDivisor() + &quot; and &quot;
+ myFirstRange.getSecondDivisor());
myFirstRange.printYears();

System.out.println(&quot;\nList of all leap years between &quot; + mySecondRange.getFirstYear() + &quot;
and &quot; + mySecondRange.getSecondYear());
mySecondRange.printYears();

System.out.println(&quot;\nList of all Olympic years between &quot;+ myThirdRange.getFirstYear() + &quot;
and &quot; + myThirdRange.getSecondYear() + &quot; that are divisible by &quot; +
myThirdRange.getFirstDivisor());
myThirdRange.printYears();
}
}