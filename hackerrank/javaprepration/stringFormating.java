package javaprepration;


public class stringFormating{
    public static void main(String[] args) {
        System.out.printf("%d",10); //prints int %n used for new line
        System.out.printf("%f%n",10.0909);//float 
        System.out.printf("%.3f%n",10.54366545);// not print 2 decimal point
        System.out.printf("%c%n",'a');//print character
        System.out.printf("%C%n",'a');//touppercase and print character
        System.out.printf("%b%n",2>1);//print boolean
        System.out.printf("%B",2>1);//print uppercase boolean
        System.out.printf("%s","hello");//print string
        System.out.printf("%S%n","hello");//print uppercase string
        // System.out.printf("%e",10.123);//scientific value
        // System.out.printf("%E",10);//scientific upppercase value
        // System.out.printf("%G",10);//scientific upppercase value
        System.out.printf("%o",10);//change to octo base
        System.out.printf("%x",10);//change to hexadecimaa base
        System.out.printf("%X",10);//change to uppercase hexadecimaa base
        System.out.printf("%h",10);//change to hash code
        System.out.printf("%H",10);//change to uppercase hash code
        //pressision
        System.out.printf("%.3f%n",2.5343455655);//print only to 3 decimal places used in int string boolean not for %c%n and other
        //width formatting
        System.out.printf("%6.2f%n",2.434545356);//width is 6 it print from right side for 2 decimal places decimal is aslo a char so it take one place in width
        System.out.printf("%9d",564545);
        //flag
        System.out.printf("%-8d",434343); //flag used for all exect %n it start from left side when flag - is used
        System.out.printf("%+8d",434343); //add sybhol to positive and not to negative number
        System.out.printf("%+8d",434343); //add space to positive and not to negative number
        System.out.printf("%08d",434343); //add 0 to width if width is 7 and int is 2 digit add other 0 
        System.out.printf("%,8d",434343); //add , to three digit  and it take one place in width not used on 0 in front
        System.out.printf("%(8d",-4545454); //add () negative numbers and not to positive numbers 
        System.out.printf("%(8d",-4545454); 
    

        
    }

}