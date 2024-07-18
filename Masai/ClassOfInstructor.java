class instructor_details{

  String name;
  int age;
  String course_name;
  String coding_language;

  public instructor_details(String name,int age,String course_name, String coding_language){
    this.name = name;
    this.age = age;
    this.course_name = course_name;
    this.coding_language = coding_language;
  }

  public void name(){
    System.out.println(this.name);
  }

  public void age(){
    System.out.println(this.name+" "+this.age);
  }

  public void courseName(){
    System.out.println(this.name+" "+this.course_name);
  }

  public void codingLanguage(){
    System.out.println(this.name+" "+this.coding_language);
  }
}
