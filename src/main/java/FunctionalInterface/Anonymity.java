package FunctionalInterface;

/**
 * Created by dwy on 2015/10/29.
 */
public  class Anonymity {
    private  static String name = "Hello world";

    public static void main(String[] args) {

        AnonymityInterface anonymity = new AnonymityInterface(){
            @Override
            public String eat(String name3) {
                System.out.println("dawei" + name  + name3 +this.toString());
                return "";
            }
        };
        System.out.println("args = [" + anonymity.eat("test") + "]");

        AnonymityInterface test = (s) -> {
            System.out.println(s + name);
            return "";};
        System.out.println("args = [" + test.eat("test1") + "]");
    }
}
