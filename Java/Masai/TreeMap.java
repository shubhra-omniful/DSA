import java.lang.*;
import java.util.*;

class collection_in_java{
  public TreeMap<Character,Integer> solve(int n, String str){
      TreeMap<Character,Integer> treeMap = new TreeMap<>();
      
      for ( int i = 0 ;i < n  ; i++ ){
          Character key = str.charAt(i);
          
          if ( !treeMap.containsKey(key) ){
              treeMap.put(key,1);
              continue;
          }
          
          treeMap.put(key, treeMap.get(key)+1);
          
      }
      
      return treeMap;
  }
}