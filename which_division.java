import java.util.Scanner;
 class which_division{
 
     
 
    public static void main(String[] args){
        
    
    Scanner sc= new Scanner(System.in);
    Integer number;
    System.out.println("Enter number:");

    number =sc.nextInt();
    for (int i=0; i<number;i++){
        Integer n1=sc.nextInt();
        if (n1>2000){
        System.out.println(1);
        }
        else if(n1>=1600 && n1<2000){
            System.out.println(2);
        }
        else{
            System.out.println(3);
            
        }

    }
    


    }
    
}
