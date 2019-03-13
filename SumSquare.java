Public class SumSquare{
  Public static void main(String [] args){
    double num1 = 0;
    double multiple = 3;
    double sum = 0;
    while(num1 < 12){
    System.out.println(multiple);
    System.out.println(sum);
    double num = multiple * multiple;
    sum = Math.pow(multiple,2) + num;
    multiple += 3;
    num1 += 1;
    }
    System.out.println(sum);


  }
}
  
