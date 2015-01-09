import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(characterOnly(lines[i]))==true)
    {
      println(lines[i] + " IS a palidrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palidrome.");
    }
  }
}
public String characterOnly(String tWord)
{
  String cWord = tWord.toLowerCase();
  String fWord = "";
  for(int i = 0; i < cWord.length(); i ++)
  {
    if(Character.isLetter(cWord.charAt(i)))
    {
      fWord = fWord + cWord.charAt(i);
    }
  }
  return fWord;
}
public boolean palindrome(String word)
{
  String sWord = characterOnly(word);
  for(int i = 0; i < (sWord.length()/2); i++)
  {
    if((sWord.charAt(i))!=(sWord.charAt(sWord.length()-i-1)))
    {
      return false;
    }
  }
  return true;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
