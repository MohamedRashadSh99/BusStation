/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busa;

/**
 *
 * @author pc
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Formatter;
import java.io.*;

/**
 *
 * @author pc
 */
public class CreatingFiles {

    ArrayList<Trips> list1 = new ArrayList<Trips>();
    ArrayList<Trips> list2 = new ArrayList<Trips>();

    int index;

 //   ArrayList<Manager> list3 = new ArrayList<Manager>();
    // ArrayList<Driver> list4 = new ArrayList<Driver>();
    void addarraylist1() {
        Trips trip1 = new Trips("alex", "cairo", "1", "20");
        Trips trip2 = new Trips("agamy", "asafra", "2", "30");
        //      Trips trip3 = new Trips("france","england","3","40");
        System.out.println("mmmm");
        list1.add(trip1);
        list1.add(trip2);
             //   list1.add(trip3); 

    }
     void addarraylist2() {
        Trips trip1 = new Trips("alex", "cairo", "1", "20");
        Trips trip2 = new Trips("agamy", "asafra", "2", "30");
        //      Trips trip3 = new Trips("france","england","3","40");
        System.out.println("mmmm");
        list2.add(trip1);
        list2.add(trip2);
             //   list1.add(trip3); 

    }

    public void addTrip1(Trips trip) {
        list1.add(trip);

    }

    public void addTrip2(Trips trip) {
        list2.add(trip);

    }
    
     public void save1() throws FileNotFoundException, IOException, ClassNotFoundException{

     // El code dah ye save el data le file ana mesameeh persons , howa beysave el object ka kol
     ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Trips.txt"));
     int size = list1.size();
     int i =0;
     while(i<size)
     {
     // now i loop 3ala kol object fe list wa save fe file
     out.writeObject(list1.get(i));
     i++;
			
     }
		
     }
		
     // Now lets try to input data in a new empty arraylist list2


     public void load1() throws FileNotFoundException, IOException, ClassNotFoundException{
     ObjectInputStream in = new ObjectInputStream(new FileInputStream("Trips.txt"));

		
     // loop read object by object we add le list
     while(true)
     {
     try { // tries to read from file , then adds to list
     Trips p = (Trips)in.readObject();
     list1.add(p);}
			
     catch (java.io.EOFException eofe){ // if end of file reached exception is thrown and caught here so break out of loop
     break;
     }
			

     }}
		
     

    public ArrayList<Trips> getList1() {
        return list1;
    }

    public ArrayList<Trips> getList2() {
        return list2;
    }


       public void save2() throws FileNotFoundException, IOException, ClassNotFoundException{
   

   

     ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Tripsbooked.txt"));
     System.out.println("sad");
     int size = list2.size();
     int i =0;
     while(i<size)
     {
     // now i loop 3ala kol object fe list wa save fe file
     out.writeObject(list2.get(i));
     i++;
			
     }
		
		
		
     // now i loop 3ala kol object fe list wa save fe file
			
			
			
		
		
     }	
           
           
     public void load2() throws FileNotFoundException, IOException, ClassNotFoundException{
     ObjectInputStream in = new ObjectInputStream(new FileInputStream("Tripsbooked.txt"));

		
     // loop read object by object we add le list
     while(true)
     {
     try { // tries to read from file , then adds to list
     Trips p = (Trips)in.readObject();
     list2.add(p);}
			
     catch (java.io.EOFException eofe){ // if end of file reached exception is thrown and caught here so break out of loop
     break;
     }
			

     }}
}
