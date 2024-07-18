class Method {

  static void casting(int a, int b){
    byte b1 = (byte)a;
    byte b2 = (byte)b;
    byte sum1 = (byte)(b1+b2);
    System.out.println(sum1);
    
    
    float f = (float)a;
    double d = (double)b;
    int sum2 = (int)(f+d);
    System.out.println(sum2);
    
    char c = (char)a;
    int sum3 = c+b;
    System.out.println(sum3);

    int sum4 =  (int)b1+c;
    System.out.println(sum4);       
    

    short s = (short)b;
    System.out.println(b1+" "+b2+" "+s);
  }

}