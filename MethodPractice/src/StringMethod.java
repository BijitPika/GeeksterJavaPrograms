public class StringMethod {
    public static void main(String[] args) {
        String message=greet();
        String greeting="Hello";
        System.out.println(greeting+","+message);
    }
    static String greet(){
        return "How are you";
    }
}
