
interface Instructor{
    public String topic();
    public int evaluation();
    public boolean constructWeek();
    public String instructorName(String a);
}

class dsa implements Instructor{

    @Override
    public String topic(){
        return "Data Structures & Algorithms";
    }

    @Override
    public int evaluation(){
        return 2;
    }

    @Override
    public boolean constructWeek(){
        return false;
    }

    @Override
    public String instructorName(String a){

        if ( a.equals("DSA101") ){
            return "Varun Bhatt";
        }else if ( a.equals("DSA201") ){
            return "Venugopal Panchamurthi";
        }else if ( a.equals("DSA301") ){
            return "Aishwarya Shivachandran";
        }else if ( a.equals("DSA401") ){
            return "Akshay Gupta";
        }

        return "";
    }
}

class coding implements Instructor{
    @Override
    public String topic(){
        return "Java & Spring boot";
    }

    @Override
    public int evaluation(){
        return 3;
    }

    @Override
    public boolean constructWeek(){
        return true;
    }

    @Override
    public String instructorName(String a){

        if ( a.equals("JA111") ){
            return "Ratan Lal Gupta";
        }else if ( a.equals("SB101") ){
            return "Arjun Thakur";
        }else if ( a.equals("SB201") ){
            return "Ratan Lal Gupta";
        }else if ( a.equals("RJ101") ){
            return "Varun Bhatt";
        }

        return "";
    }
}