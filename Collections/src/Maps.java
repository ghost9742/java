import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "Compiled high level, OOP, platform independent language");
        languages.put("Python", "Interpreted OOP language");
        languages.put("Algol", "algorithmic language");
        languages.put("BASIC", "beginners instruction code");
        languages.put("LISP", "Lisp programming language");

        System.out.println(languages.get("Java"));
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "Java override");
        }

        System.out.println(languages.get("Java"));
        System.out.println("---------------------------------------------------");
        System.out.println(languages.keySet());

        languages.remove("Java");
        if (languages.remove("Algol", "algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed. Key/value pair not found");
        }

        if(languages.replace("LISP", "This will not work" , "Lisp programming language with replaced value")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp not replaced");
        }

        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }

    }
}
