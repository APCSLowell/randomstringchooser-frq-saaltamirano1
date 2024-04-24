import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> words;

  public RandomStringChooser(String [] wordArray){
    words = new ArrayList <String>();
    for(String w : wordArray){
      words.add(w);
    }
  }
  public String getNext(){
    if(word.size() == 0){
      return "NONE";
    }
    int i = (int) (Math.random() * word.size());
    return words.remove(i);
  }
}
