import java.lang.*;
import java.util.*;

class CollectionQuestion1{
  public static void solve(List<Integer> list){
    if ( list.size() %2 == 0){
      list.add(10);
    }else{
      list.add(0,10);
    }

    if ( list.size() > 5 ){
      list.add(3,3);
    }else{
      list.add(3);
    }

    if ( list.contains(5) ){
      System.out.println(true);
    }else{
      System.out.println(false);
    }

    int count  = 0;
    for (Integer num : list ){
      if ( num % 2 == 1) count++;
    }

    System.out.println(count);
    System.out.println(count);

    Set<Integer>set=new HashSet<>();
    for (Integer num : list ){
      if ( ! set.contains(num)) set.add(num);
    }

    System.out.println(set.size());

    Map<Integer,Integer>map= new LinkedHashMap<>();

    for (Integer num : list ){
      if ( map.containsKey(num)) map.put(num,map.get(num)+1);
      else map.put(num, 1);
    }

    count = 0;
    for ( Map.Entry<Integer,Integer> entry : map.entrySet() ){
      if ( entry.getValue() > 1 ) count++;
    }
    System.out.println(count);

    System.out.println(list.get(0)+" "+list.get(list.size()-1));

    for (Integer num : list){
      System.out.print(num+" ");
    }
  }
}
