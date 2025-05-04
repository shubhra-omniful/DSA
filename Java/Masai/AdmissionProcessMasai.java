abstract class admissionProcess{

    abstract boolean ageLimit(int age);
    abstract boolean educationCriteria(boolean plusTwo);
    abstract boolean creditScore(int score);
    abstract boolean nationality(String citizen);

}

class intensiveProgram extends admissionProcess{

    int age ;
    boolean plusTwo;
    int creditScore;
    String citizen;

    @Override
    public boolean ageLimit(int age){
        return age > 18 && age < 28 ;
    }

    @Override
    public boolean educationCriteria(boolean plusTwo){
        return plusTwo;
    }

    @Override
    public boolean creditScore(int score){
        return score >= 750;
    }

    @Override
    public boolean nationality(String citizen){
        return citizen.equals("Indian");
    }


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

        if ( ageLimit(this.age) && educationCriteria(this.plusTwo) && creditScore(this.creditScore) && nationality(this.citizen)){
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

    @Override
    public boolean ageLimit(int age){
        return age > 18 && age < 35 ;
    }

    @Override
    public boolean educationCriteria(boolean plusTwo){
        return plusTwo;
    }

    @Override
    public boolean creditScore(int score){
        return score >= 750;
    }

    @Override
    public boolean nationality(String citizen){
        return citizen.equals("Indian") || citizen.equals("American");
    }

    public boolean exprience(){
        return this.yearsOfExprience >= 2;
    }

    public xProgram(int age , boolean plusTwo, String citizen, int creditScore, int yearsOfExprience){
        this.age = age;
        this.plusTwo = plusTwo;
        this.creditScore = creditScore;
        this.citizen = citizen;
        this.yearsOfExprience = yearsOfExprience;
    }

    public xProgram(int age , boolean plusTwo, String citizen, int yearsOfExperience){
        this.age = age;
        this.plusTwo = plusTwo;
        this.creditScore = 750;
        this.citizen = citizen;
        this.yearsOfExprience = yearsOfExperience;
    }

    public String finalDecision(){

        if ( ageLimit(this.age) && educationCriteria(this.plusTwo) && creditScore(this.creditScore) && nationality(this.citizen) && exprience() ){
            return "You are eligible for the X Program";
        }

        return "You are not eligible for the X Program";
    }
}
