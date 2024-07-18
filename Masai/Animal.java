
abstract class Animal{

  abstract boolean run();
  abstract boolean swim();
  abstract boolean crawl();
  abstract boolean fly();

}

class Tiger extends Animal{

  @Override
  public boolean run(){
    return true;
  }

  @Override
  public boolean swim(){
    return true;
  }

  @Override
  public boolean crawl(){
    return false;
  }

  @Override
  public boolean fly(){
    return false;
  }

}

class Snake extends Animal{

  @Override
  public boolean run(){
    return false;
  }

  @Override
  public boolean swim(){
    return false;
  }

  @Override
  public boolean crawl(){
    return true;
  }

  @Override
  public boolean fly(){
    return false;
  }

}

class Eagle extends Animal{

  @Override
  public boolean run(){
    return false;
  }

  @Override
  public boolean swim(){
    return false;
  }

  @Override
  public boolean crawl(){
    return false;
  }

  @Override
  public boolean fly(){
    return true;
  }

}

class Shark extends Animal{

  @Override
  public boolean run(){
    return false;
  }

  @Override
  public boolean swim(){
    return true;
  }

  @Override
  public boolean crawl(){
    return false;
  }

  @Override
  public boolean fly(){
    return false;
  }

}