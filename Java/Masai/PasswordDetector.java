import java.util.*;
import java.lang.*;

abstract class passwordDetector{
    abstract boolean checkLength(String password);
    abstract boolean checkSpecialCharacter(String password);
    abstract boolean checkNumber(String password);
    abstract boolean checkUpperCase(String password);
    abstract boolean checkLowerCase(String password);
}

class checker extends passwordDetector{
  int size;

  public checker(int size){
    this.size = size;
  }

  @Override
  public boolean checkLength(String password){
    return password.length() >= this.size;
  }

  @Override
  public boolean checkSpecialCharacter(String password){
    for ( int i = 0; i < password.length() ; i++ ) {
      char key = password.charAt(i);
      if ( key == '@' || key == '#' || key == '$' || key == '&' || key == '*') return true;
    }

    return false;
  }

  @Override
  public  boolean checkNumber(String password){
    for ( int i = 0; i < password.length() ; i++ ) {
      char key = password.charAt(i);
      if ( Character.isDigit(key) ) return true;
    }

    return false;
  }

  @Override
  public boolean checkUpperCase(String password){
    for ( int i = 0; i < password.length() ; i++ ) {
      char key = password.charAt(i);
      if ( Character.isUpperCase(key) ) return true;
    }

    return false;
  }

  @Override
  public  boolean checkLowerCase(String password){
    for ( int i = 0; i < password.length() ; i++ ) {
      char key = password.charAt(i);
      if ( Character.isLowerCase(key) ) return true;
    }

    return false;
  }
}