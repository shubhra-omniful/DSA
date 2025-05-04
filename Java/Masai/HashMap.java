import java.lang.*;
import java.util.*;

class HashMap{
  public static HashMap<Integer,Integer> createMap(int[] arr){
    HashMap<Integer,Integer>hashMap=new HashMap<>();
    for ( int i = 0;i < arr.length; i++ ){
      if ( hashMap.containsKey(arr[i]) ) hashMap.put(arr[i], hashMap.get(arr[i])+1);
      else hashMap.put(arr[i],1);
    }

    return hashMap;
  }
}
