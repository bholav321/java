// 123456
// 54321
// 1234
// 321
// 12
// 1
class Test{
    public static void main(String[] args){
        int i,j;
        for(i=6; i>=1; i--){
            if(i%2==0)
            for(j=1; j<=i; j++){
                System.out.print(j);
            }
            else{
                for(j=i; j>=1; j--){
                    System.out.print(j);
                }
            }
        System.out.println(" ");
        }
        
    }

}