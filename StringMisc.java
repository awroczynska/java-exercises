public class StringMisc {

    public static String norm(String name) {
        if (name == null || name.isEmpty()){
            return name;
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public static String init(String name){
        if (name == null || name.isEmpty()){
            return name;
        }
        String[] parts = name.split(" ");

        if (parts.length == 0){
            return name;
        }
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < parts.length - 1; i++){
            if (parts[i].length() > 0){
                result.append(parts[i].substring(0, 1).toUpperCase());
                result.append(". ");
            }
        }

        if (parts.length > 0){
            result.append(norm(parts[parts.length - 1]));
        }
        return result.toString();
    }

    public static String tr(String s, String from, String to){
        if (s == null || s.isEmpty()){
            return s;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);

            int index = from.indexOf(currentChar);

            if (index != -1 && index < to.length()){
                result.append(to.charAt(index));
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();

    }

public static void main (String[] args) {
    System.out.println(norm("caravaggio"));
    System.out.println(norm("VERMEER"));
    System.out.println(init("johann sebastian bach"));
    System.out.println(init("i. babeL"));
    System.out.println(init("jorge LUIS BORGES"));
    System.out.println(init("WOLFGANG a. mozart"));
    System.out.println(tr("Mississippi",
        "abcdefghijklmnopqrstuvwyz",
        "BCDEFGHIJKLMNOPQRSTUVWYZA"));
System.out.println(tr("abcXYZ","aZcX","||Cx"));
    }

}
    
