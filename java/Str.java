public class Str {
    public static void main(String[] args) {
        String name = "         Bro         ";

        //boolean res = name.equalsIgnoreCase("bro");

        //int res = name.length();
        //char res = name.charAt(0);
        //int res = name.indexOf("o");
        //boolean res = name.isEmpty();
        String res = name.replace('o','a');

        System.out.println(res);
    }
}
