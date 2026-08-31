package ExceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
       try{
          int a=10/0;
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }
}
