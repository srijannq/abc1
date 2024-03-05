import java.util.*;
class MyException extends Exception{
    int arr[]=new int[5];
    void check() throws MyException{
        for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int integer = sc.nextInt();
            if(integer%2==0){
                arr[i]=integer;
            }
            else{
                throw this;
            }
        }
    }
    void display(){
        System.out.print("The elements are: ");
        for (int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}

class New{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int integer;
        int arr[]=new int[5];
        MyException ob=new MyException();



            try{

                ob.check();
            }
            catch (MyException e) {
                System.out.println("Exception caught");
            }

        ob.display();
    }
}
