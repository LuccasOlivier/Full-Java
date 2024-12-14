package QClassesUtilitáriasStrings;

public class StringTest01 {
    public static void main(String[] args){
        
        String name = "Lucas"; //String constant pool
        String name2 = "Lucas";
        
        name = "Lucas";
        System.out.println(name);
        name = name.concat(" Oliveira");
        
        System.out.println(name);
        System.out.println(name == name2);

        String name3 = new String("Lucas");

        System.out.println(name2 == name3);

        System.out.println(name2 == name3.intern());
    }
}
