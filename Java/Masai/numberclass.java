interface comparison{
  public int comparemax(int a,int b);
  public int comparemax(int a,int b,int c);
  public int comparemax(int a,int b,int c,int d);
  public int comparemax(int a);
  public int comparemin(int a);
  public int comparemin(int a,int b);
  public int comparemin(int a,int b,int c);
  public int comparemin(int a,int b,int c,int d);
}

class numberclass implements comparison{

  @Override
  public int comparemax(int a,int b){
    return a > b ? a : b;
  }

  @Override
  public int comparemax(int a,int b,int c){
    if ( a > b && a > c){
      return a;
    }else if ( b > c && b > a){
      return b;
    }

    return c;
  }

  @Override
  public int comparemax(int a,int b,int c,int d){
    if ( a > b && a > c && a > d){
      return a;
    }else if ( b > a && b > c && b > d){
      return b;
    }else if ( c > a && c > b && c > d){
      return c;
    }

    return d;
  }

  @Override
  public int comparemax(int a){
    return a;
  }

  @Override
  public int comparemin(int a){
    return a;
  }

  @Override
  public int comparemin(int a,int b){
    return a > b ? b : a;
  }

  @Override
  public int comparemin(int a,int b,int c){
    if ( a  > b  && c > b ){
      return b;
    }else if ( b > c && a > c){
      return c;
    }

    return a;
  }

  @Override
  public int comparemin(int a,int b,int c,int d){
    if ( b > a && c > a && d > a){
      return a;
    }else if ( a > b && c > b && d > b){
      return b;
    }else if ( a > c && b > c && d > c){
      return c;
    }

    return d;
  }

}