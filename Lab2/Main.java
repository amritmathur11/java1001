class Main{


    public static void main(String args[]){
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        
        String output = "";
        //Encrypt text
        output = encryptText("Sample Text", 3);
        System.out.println(output);




        //Decrypt text
        output = decryptText("Vdpsoh#Wh{w", 3);
        System.out.println(output);

        //Sum of Array
        System.out.println(sum(myArray));

        //Contains
        System.out.print("Array contains number 5?: " + arrayContains(myArray,5));


    }


    public static String encryptText(String base, int offset){
        String encrypted = "";
        for(int i = 0 ; i < base.length() ; i++){
           encrypted += (char)(((int)base.charAt(i))+offset);   
        }
        return encrypted;
    }

    public static String decryptText(String base, int offset){
        String decrypted = "";
        for(int i = 0 ; i < base.length() ; i++){
           decrypted += (char)(((int)base.charAt(i))-offset);   
        }
        return decrypted;
    }



    public static boolean arrayContains(int[] ar, int num){
        for(int i=0;i<ar.length;i++){
            if(ar[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int sum(int[] ar){
        int sum = 0;
        for(int i=0; i<ar.length;i++){
            sum += ar[i];
        }
        
        return sum;
    }


}