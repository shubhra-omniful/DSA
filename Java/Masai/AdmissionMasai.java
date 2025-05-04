abstract class admissionProcess{
  
}

class intensiveProgram extends admissionProcess{
  int age ;
  boolean plusTwo;
  int creditScore;
  String citizen;

  public intensiveProgram(int age , boolean plusTwo, String citizen, int creditScore){
    this.age = age;
    this.plusTwo = plusTwo;
    this.creditScore = creditScore;
    this.citizen = citizen;
  }

  public intensiveProgram(int age , boolean plusTwo, String citizen){
    this.age = age;
    this.plusTwo = plusTwo;
    this.creditScore = 750;
    this.citizen = citizen;
  }

  public String finalDecision(){    

    if ( this.age > 18 && this.age < 28 && this.plusTwo && 
      this.creditScore >= 750 && citizen.equals("Indian")){
      return "You are eligible for the Intensive Program";
    }

    return "You are not eligible for the Intensive Program";
  }

}

class xProgram extends admissionProcess{

  int age ;
  boolean plusTwo;
  int creditScore;
  String citizen;
  int yearsOfExprience;

  public xProgram(int age , boolean plusTwo, String citizen, int creditScore, int yearsOfExprience){
    this.age = age;
    this.plusTwo = plusTwo;
    this.creditScore = creditScore;
    this.citizen = citizen;
    this.yearsOfExprience = yearsOfExprience;
  }

  public xProgram(int age , boolean plusTwo, String citizen, int yearsOfExprience){
    this.age = age;
    this.plusTwo = plusTwo;
    this.creditScore = 750;
    this.citizen = citizen;
    this.yearsOfExprience = yearsOfExprience;
  }

  public String finalDecision(){    

    if ( this.age > 18 && this.age < 35 && this.plusTwo && this.creditScore >= 750 
      && citizen.equals("Indian") || citizen.equals("American") && this.yearsOfExprience >= 2 ){
      return "You are eligible for the X Program";
    }

    return "You are not eligible for the X Program";
  }
}
