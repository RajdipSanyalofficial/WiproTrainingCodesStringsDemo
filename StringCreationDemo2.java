/**
 * Program to create strings using new keyword
 */


package stringsdemo;

public class StringCreationDemo2 {

    public static void main(String[] args)
    {
        /*
              A new String object is created, even if "Bengaluru"
              is already present in string pool
         */

        String city=new String("Bengaluru");
        String place=new String("Bengaluru");
        String itCity=new String("Bengaluru is a IT City");

        System.out.println(city+" - "+ city.hashCode());
        System.out.println(place+" - "+ place.hashCode());

        /*
         ==Operator checks if two references points to same object in memory
         equals() methods checks the content of two string objects are equal or not
         */


        System.out.println("Reference of city & place are same ? :"+city==place);
        System.out.println(itCity+" - "+ itCity.hashCode());

        System.out.println("The String is :"+city);
        System.out.println("Convert to uppercase :"+city.toUpperCase());


        System.out.println("********** String Split() function ***********");

        String [] result=itCity.split("");

        for(String s:result){
            System.out.println(s+"\t");
        }
    }
}
