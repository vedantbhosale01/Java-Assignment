public class JavaBasic_04 {
    // 4. Write a method “add” to add n number of integers. Use VarArgs
    public static void main(String[] args) {
        
        int a = 5;
        int b = 6;
        System.out.println(add(a, b));
    }
    public static int add(int a, int b){

        return a + b;
    }
}
