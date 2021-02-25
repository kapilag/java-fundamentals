package operators;

public class StringEquals {

    public static void main(String args[]){
        String session1 = "Java Fundamentals";
        String session2 = "Java Fundamentals";
        String session3 = new String("Java Fundamentals");

        if(session1 == session3){
            System.out.println("Both courses are same!");
        }
        if(session1.equals(session3)){   //compares for equavility whether they are logically equal
            System.out.println("Equals works!");
        }

    }
}
