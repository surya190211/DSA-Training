public class function {
    public static int table(int n){
        for(int i = 1;i<=10;i++){
            System.out.println(n +"x"+i+ " = "+ n*i);
        }
        return 1;
    }
    public static float AreaOfCircle(int r){
        float pi = 3.14f;
        return r*r*pi;
    }
    public static double ClesiustoFernite(float c){
        return (c * 9/5)+32;
    }

    public static void main(String[] args) {
        // static variable and funtions are stored in static area sperate in memory
        //Function are stored in stack frame
        table(3);
        float result = AreaOfCircle(5);
        System.out.print(result);
        float result2 = (float)ClesiustoFernite(98.6f);
        System.out.print(result2);

    }
}
