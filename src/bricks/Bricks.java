package Bricks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
import java.io.*;


/**
 *
 * @author DELL
 */
public class Bricks {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException
    {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int p=0;
        int q=0;
        int i=0;
        int s=0;
        int d1=0;
        System.out.println("enter n");
        int n=Integer.parseInt(br.readLine());
       while(s+1>i)
       {
        
          p=p+i;
          q=(2*i)+q
                  ;
           s=n-(p+q);
           i++;
       }
       if(s<=(i-2)) 
            System.out.println("patlu");
           
       else
           System.out.println("motu");
       
       
       }} 
               
               
            
               
         
    

