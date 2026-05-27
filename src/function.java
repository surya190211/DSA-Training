public class function {
//    public static int table(int n){
//        for(int i = 1;i<=10;i++){
//            System.out.println(n +"x"+i+ " = "+ n*i);
//        }
//        return 1;
//    }
//    public static float AreaOfCircle(int r){
//        float pi = 3.14f;
//        return r*r*pi;
//    }
//    public static double ClesiustoFernite(float c){
//        return (c * 9/5)+32;
//    }
//    public static void add(int a){
//        if(a%2==0){
//            return ;
//        }
//    }
//    public static int Sum(int start,int end){
//        int sum =0;
//        for(int i = start;i<=end;i++){
//            if(i%2==0){
//                sum += i;
//
//            }
//
//        }
//        return sum;
//    }
public static int nCr(int n, int r) {
    int result = 1;
    for(int i = 1 ;i<n;i++){
        if(n<r){
            return 0;
        }else{
            result = fact(n)/(fact(n-r)*fact(r));
        }
    }
    return result;
}
    public static int fact(int n){
        int result = 1;
        for(int i =1;i<=n;i++){
            result *= i;
        }
        return result;

    }
//    public static   String greetings(String n){
//        System.out.print("hello"+ n);
//
//    }
    public static int countDigits(int n) {

        int count= 0;
        while(n>=1){
            n = n/10;
            count ++;

        }
        return count;

    }
    public static boolean evenOrNot(int n){
            int count =0;
            while(n>0){
                count++;
                if(count == 2){
                    int dig = n%10;
                    if(dig%2==0){
                         return true;
                    }
                }
                n = n/10;
            }
        boolean b = false;
        return b;

//            n = n/10;
//            boolean count = false;
//            if(n%2==0){
//                count = true;
//
//            }
//            return  count;
    }



    public static void main(String[] args) {
        // static variable and funtions are stored in static area sperate in memory
        //Function are stored in stack frame
//        table(3);
//        float result = AreaOfCircle(5);
//        System.out.print(result);
//        float result2 = (float)ClesiustoFernite(98.6f);
//        System.out.print(result2);
//        add(6);
        int x = nCr(4,4);
        System.out.println(x);
        int y = countDigits(2345677);
        System.out.println(y);
        boolean z = evenOrNot(234567);
        System.out.print(z);

    }
}
