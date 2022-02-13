import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GitPractice {


    public static void main(String[] args) {

     String name  = "Shokhzod";
     System.out.println("Gulistan ");
     System.out.println("Hi this is from Komil");

     List<String> list = new ArrayList<>();
     list.addAll(Arrays.asList("Feruza","Komil","Gulistan","Abbos","Shahzod"));
     list.forEach(System.out::println);


    }

    private String name;
    private int age;






}
