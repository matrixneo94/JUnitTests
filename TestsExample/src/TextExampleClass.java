import java.util.ArrayList;


public class TextExampleClass {
private int numberFirst,numberSecond;
private String textFirst,textSecond;
private ArrayList al =null;
public int getNumberFirst(){
return this.numberFirst;
}
public int getNumberSecond(){
return this.numberSecond;		
}
public String getTextFirst(){
	return this.textFirst;
}
public String getTextSecond(){
	return this.textSecond;
}
public ArrayList getAl(){
	return this.al;
}
public void setNumberFirst(int n){
	this.numberFirst = n;
}
public void setNumberSecond(int n){
	this.numberSecond = n;
}
public void setTextFirst(String s){
	this.textFirst = s;
}
public void setTextSecond(String s){
	this.textSecond =s;
	
}
public void createStringArrayListWithSize(int s){
	this.al = new ArrayList<String>(s);
}
public Boolean validateNumberIsPrimaryNumber(int number) {
    for (int i = 2; i < (number / 2); i++) {
       if (number % i == 0) {
          return false;
       }
    }
    return true;
 }

}



