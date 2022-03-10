import java.util.Arrays;

public class StringManipulation {
    public static void main (String[] args) {
    

    //-----main method:-----
        boolean encrypt = false;
        int secretNumber = 13;
        int minWordSize = 0; 
        
        //check input encrypt/decrypt:
        if (args[0].equalsIgnoreCase("encrypt")) {
            encrypt = true;
        } else if (args[0].equalsIgnoreCase("decrypt")) {
            encrypt = false;
        } else {
            error();
            return;
        }

        if (args[1].equalsIgnoreCase("-minWordSize") && args[3].equalsIgnoreCase("-secretNumber")) {
            minWordSize = Integer.parseInt(args[2]);
            secretNumber = secretNumber(Integer.parseInt(args[4]));
        } else if (args[1].equalsIgnoreCase("-minWordSize")) {
            minWordSize = Integer.parseInt(args[2]);
        } else if (args[1].equalsIgnoreCase("-secretNumber")) {
            secretNumber = secretNumber(Integer.parseInt(args[2]));  
        } 
        String toEncrypt = args[args.length-1];
        encryptDecrypt(encrypt, toEncrypt, secretNumber, minWordSize);
    }

    //-----encrypt/decrypt method-----
    public static String encryptDecrypt(boolean encrypt, String toEncrypt, int secretNumber, int minWordSize) {       
        if (!encrypt) {
            secretNumber = (secretNumber*(-1));
        } //this if statement is for decryption and turns the math equation for the rot13 encryption into a negative, reversing the affects of a previously rotated alphabet
        
        String encrypted = "";
        String[] inputArr = toEncrypt.split(" ");

        for (int j = 0; j < inputArr.length; j++) {
            char[] word = inputArr[j].toCharArray();
            //after creating a string array, we'll compare the separated word (using .split()) lengths to the minWordSize int given, keeping those smaller un-encrypted
            if (word.length >= minWordSize) {
                for (int i = 0; i < word.length; i++) {
                    //once words greater than minWordSize are established, the nested for loop separates them into individual characters and rotate their ascii value according to the secretNumber giving
                    //char c are the characters and char e are them after being encrypted/decrypted
                    char e;
                    char c = word[i];
                    
                    if (c >= 'a' && c <= 'z') {
                        e = (char)(c + secretNumber);
                        
                        if (e > 'z') { //nested if statement accounts for those rotated characters that fall outside the alphabets list in the ascii table and keeps the encrypted/decrypted character wihtin ascii values
                            e = (char)(e - 26);
                        } else if (e < 'a') {
                            e = (char)(e + 26);
                        }
                    } else if (c >= 'A' && c <= 'Z') {
                        e = (char)(c + secretNumber);
                        
                        if (e > 'Z') {
                            e = (char)(e - 26);
                        } else if (e < 'A') {
                            e = (char)(e + 26);
                        }
                    } else { //this else statement is accounting for the non-alphabet characters inputted in the initial phrase (blank space, punctuation, etc.) and keeps them un-encrypted
                        e = c;
                    }
                    encrypted += Character.toString(e);
                }

            } else {
                encrypted += inputArr[j];
            }
            encrypted += " ";
        }    
        System.out.print("\nThank you for using our services");
        System.out.print("\nYour phrase is: "+ encrypted + "\n");
        return encrypted.trim();
    }

    //-----secretNumber method-----
    public static int secretNumber(int secretNumber) { 
        //this method compares the secretNumber given to the number of alphabet letters and alters it accordingly (i.e. keeps it under/non-divisable by 26 and makes sure it's not 0)
        if (secretNumber < 26) {
            secretNumber = secretNumber;
        } else if (secretNumber > 26) {
            secretNumber = secretNumber / 26;
        } else if (secretNumber == 0) {
            System.out.println("\nIn order to encrypt your msg pls input a value greater than 0\n");
        } else {
            error();
        }
        return secretNumber;
    }

    //-----error method-----
    public static void error() {
        System.out.println("\nyou've reached the help function\n");
        System.out.println("* Please input Encrypt/Decrypt (of your choosing) and the phrase you wish to have ciphered in double quotations\n");
        System.out.println("* Please note you may add -minWordSize # (this will omit encrypting small words of #-length) and -secretNumber # (greater than 0, not a multiple of 26) for further customization\n");
        System.out.println("* If the above is desired, please input them in the above layout whether one, the other, or both\n");
    }
}
