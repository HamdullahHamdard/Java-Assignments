package thirdWeek;
import secondWeek.Student;

import java.beans.PersistenceDelegate;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class abstraction
{
    public static void main(String[] args)
    {
        // big decimal and big integer
        BigDecimal bigDecimal1= BigDecimal.valueOf(200);
        BigInteger bigInteger2= BigInteger.valueOf(100);

        System.out.println("bigDecimal1: "+bigDecimal1+"\nbigInteger2: "+bigInteger2);
        Person person = new Person(1,"Hamdullah", "Cs","KDR");
        // wrapper classes
        ArrayList<Person> arrayList= new ArrayList<>();
        arrayList.add(person);
        arrayList.add(new Person(2,"Hamdard Khan", "ECO","USA"));

        Iterator<Person> iterator = arrayList.iterator();
        while ( iterator.hasNext())
        {
            Person person1 = iterator.next();
            System.out.println(person1.id+": "+ person1.name+": "+person1.faculty+": "+person1.organization);
        }
    }
}