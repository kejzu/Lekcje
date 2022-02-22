public class Main {
    public static void main(String[] args) {
        Language polski = new Polish();
        Language angielski = new English();

        przywitajSie(polski, angielski);
    }

    public static void przywitajSie(Language arg0, Language...args){
        System.out.println(arg0.sayGreeting());
        for(int i=0;i<args.length;i++){
            System.out.println(args[i].sayGreeting());
        }
    }
}
