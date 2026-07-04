package core.java.Basic;

public class RetryClass {

    static void retryMethod(){
        int retry=3;
        int attempt=0;
        boolean success=false;
        int b=0;

        while (attempt < retry && !success) {
            attempt++;
            try{
                int a=20/b;
                success=true;
            }catch (ArithmeticException e){
                if(attempt==2){
                  b=5;
                }
                System.out.println("Got some Error..");

            }finally {
                System.out.println("Finally executed...");
             }
        }
        if (!success) {
           // logger.error("Failed to upload file after {} attempts: {}", maxRetries, filePath);
            throw new RuntimeException("File upload failed after multiple attempts.");
        }else{
            System.out.println("there is attemts"+attempt);
        }

    }
    public static void main(String[] args) {
        retryMethod();
    }
}
