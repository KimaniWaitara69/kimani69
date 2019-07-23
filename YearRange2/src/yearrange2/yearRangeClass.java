/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yearrange2;

import static javax.management.Query.lt;

public class yearRangeClass {

int yearRangeFrom;
int yearRangeTo;
int rangeType;
int firstDivisor;
int secondDivisor;

public yearRangeClass(int x, int y){
yearRangeFrom = x;
yearRangeTo = y;
}

public void setRangeType(int type){
rangeType = type;
switch(type){
case 1:
firstDivisor = 14;
secondDivisor = 20;
break;
case 2:
firstDivisor = 4;

break;
case 3:
firstDivisor = 3;
break;
}
}

public int getFirstDivisor(){
return firstDivisor;
}

public int getSecondDivisor(){
return secondDivisor;
}

public int getFirstYear(){
return yearRangeFrom;
}

public int getSecondYear(){
return yearRangeTo;
}

public void printYears(){
if(rangeType == 1){
for(int i = yearRangeFrom; i &lt;= yearRangeTo; i++){
if(i % firstDivisor == 0 &amp;&amp; i % secondDivisor == 0){
System.out.println(i);
}

}
} else if(rangeType == 2){
for(int i = yearRangeFrom; i &lt;= yearRangeTo; i++){
if(i % firstDivisor == 0){
System.out.println(i);
}
}
} else if(rangeType == 3){
for(int i = yearRangeFrom; i &lt;= yearRangeTo; i++){
if(i % firstDivisor == 0){
System.out.println(i);
}
}
}
}
}
