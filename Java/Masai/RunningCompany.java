class employee{

  int employee_id;
  String name;
  int salary;
  boolean stock_options;
  int vesting_period;

  public employee(int employee_id, String name, int salary, boolean stock_options, int vesting_period){
    this.employee_id = employee_id;
    this.name = name;
    this.salary = salary;
    this.stock_options = stock_options;
    this.vesting_period = vesting_period;
  }

  public int employeeNumber(){
    return this.employee_id;
  }

  public String name(){
    return this.name;
  }

  public int salary(){
    return this.salary;
  }

  public boolean stock_options(){
    return this.stock_options;
  }

  public int vesting_period(){
    return this.vesting_period;
  }

}

class company{

  int size;
  employee[] arr;

  public company(int size, employee[] arr){
    this.size = size;
    this.arr = arr;
  }

  public void sortSalary(){
    for ( int i = 0 ; i < size; i++ ){
      for ( int j = 0 ; j < size - 1 - i ; j++ ){
        if ( arr[j].salary > arr[j+1].salary ){
          employee temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  public void sortEmployeeId(){
    for ( int i = 0 ; i < size; i++ ){
      for ( int j = 0 ; j < size - 1 - i ; j++ ){
        if ( arr[j].employee_id > arr[j+1].employee_id ){
          employee temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  public void sortVestingPeriod(){
    for ( int i = 0 ; i < size; i++ ){
      for ( int j = 0 ; j < size - 1 - i ; j++ ){
        if ( arr[j].vesting_period < arr[j+1].vesting_period ){
          employee temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  public void stockOrNot(int id){
    for (employee num : arr){
      if ( num.employee_id == id ){
        if ( num.stock_options){
          System.out.println("Stock Granted to "+num.name);
        }else System.out.println("Stock not Granted to "+num.name);

        return ;
      }
    }

    System.out.println("Invalid Employee ID");
  }

  public int size(){
    return this.size;
  }

}
