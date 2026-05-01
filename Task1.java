//Task1.java

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);



int a , b, c;

a = scanner.nextInt();
b = scanner.nextInt();
c = scanner.nextInt();

System.out.println(a + " " + b + " " + c);

int temp;

if (a > b){
    temp = a;
    a = b;
    b = temp;
}

if (b > c){
    temp = b;
    b = c;
    c = temp;
}

if (a > b){
    temp = a;
    a = b;
    b = temp;
}

System.out.println(a + " " + b + " " + c);

scanner.close();
}
}
