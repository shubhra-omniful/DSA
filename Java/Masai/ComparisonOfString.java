
interface stringFunctions{
  public String print(String a,String b);
  public int countVowels(String a,String b);
  public int countConsonants(String a,String b);
}

class strClassOne implements stringFunctions{

  public boolean isVowel(char key){
    return key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u' ||
    key == 'A' || key == 'E' || key == 'I' || key == 'O' || key == 'U';
  }

  @Override
  public String print(String a,String b){
    return a+" "+b;
  }

  @Override
  public int countVowels(String a,String b){
    int countA  = 0, countB  = 0;
    for ( int i =0 ; i < a.length() ; i++ ){
      char key = a.charAt(i);

      if ( isVowel(key) ) countA++;
    }

    for ( int i =0 ; i < b.length() ; i++ ){
      char key = b.charAt(i);

      if ( isVowel(key) ) countB++;
    }
    

    if ( countA == countB ){
      if ( a.length() > b.length() ) return a.length();
      else return b.length();
    }else if ( countA > countB ) return b.length();

    return a.length();
  }

  @Override
  public int countConsonants(String a,String b){
    int countA  = 0, countB  = 0;
    for ( int i =0 ; i < a.length() ; i++ ){
      char key = a.charAt(i);

      if ( !isVowel(key) ) countA++;
    }

    for ( int i =0 ; i < b.length() ; i++ ){
      char key = b.charAt(i);

      if ( !isVowel(key) ) countB++;
    }

    if ( countA == countB ){
      if ( a.length() > b.length() ) return a.length();
      else return b.length();
    }else if ( countA > countB ) return b.length();

    return a.length();
  }
}


class strClassTwo implements stringFunctions{

  public boolean isVowel(char key){
    return key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u' ||
    key == 'A' || key == 'E' || key == 'I' || key == 'O' || key == 'U';
  }

  @Override
  public String print(String a,String b){
      return a+"\n"+b;
  }

  @Override
  public int countVowels(String a,String b){
    int countA  = 0, countB  = 0;
    for ( int i =0 ; i < a.length() ; i++ ){
      char key = a.charAt(i);

      if ( isVowel(key) ) countA++;
    }

    for ( int i =0 ; i < b.length() ; i++ ){
      char key = b.charAt(i);

      if ( isVowel(key) ) countB++;
    }
    
    
    if ( countA == countB ){
      if ( a.length() > b.length() ) return b.length();
      else return a.length();
    }else if ( countA > countB ) return a.length();

    return b.length();
  }


  @Override
  public int countConsonants(String a,String b){
      int countA  = 0, countB  = 0;
    for ( int i =0 ; i < a.length() ; i++ ){
      char key = a.charAt(i);

      if ( !isVowel(key) ) countA++;
    }

    for ( int i =0 ; i < b.length() ; i++ ){
      char key = b.charAt(i);

      if ( !isVowel(key) ) countB++;
    }


    if ( countA == countB ){
      if ( a.length() > b.length() ) return b.length();
      else return a.length();
    }else if ( countA > countB ) return a.length();

    return b.length();
    }

}
