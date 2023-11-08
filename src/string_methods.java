public class string_methods {
    public static void main(String[] args) {
        String java="hi i am Aryan and i am learning JAVA";
        System.out.println(java.lastIndexOf("i"));
        String new_string = java.toLowerCase();
        System.out.println(new_string);
        String new_string2= new_string.toUpperCase();
        System.out.println(new_string2);
        String string3=java.concat(". Bahot hard hai");
        System.out.println(string3);
        String substr=java.substring(4);
        System.out.println(substr);
        System.out.println(java.replace("hi", "bonjour"));
    }
}
