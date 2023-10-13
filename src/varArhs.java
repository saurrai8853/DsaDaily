import java.util.Arrays;

public class varArhs {
    public static void main(String[] args) {

        fun("ram","Shayam","syaaa","aao");
    }
    static void fun(String...v){
        System.out.println(Arrays.toString(v));
    }
}
