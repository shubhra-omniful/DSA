
interface masaiAcademy{
  public boolean criteria();
  public int limit();
  public String[] courses();
  public String lead();
}


class javaAcademy implements masaiAcademy{
  @Override
  public boolean criteria(){
    return true;
  }

  @Override
  public int limit(){
    return 10;
  }

  @Override
  public String[] courses(){
    return new String[]{"JA111","SB101","SB201","RJ101"};
  }
  
  @Override
  public String lead(){
    return "Albert";
  }

  public int duration(){
    return 2;
  }

  public String difficulty(){
    return "Moderate-High";
  }
}

class mernAcademy implements masaiAcademy{
  @Override
  public boolean criteria(){
    return true;
  }

  @Override
  public int limit(){
    return 20;
  }

  @Override
  public String[] courses(){
    return new String[]{"JS101","WEB101","JS201","RCT101","NEM101","RM101"};
  }
  
  @Override
  public String lead(){
    return "Albert";
  }

  public int duration(){
    return 6;
  }

  public String difficulty(){
    return "Moderate";
  }
}
