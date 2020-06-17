package com.encryption;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import java.security.Key;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        try  {
            String algorithm = "AES";
            Key privateKey = KeyGenerator.getInstance(algorithm).generateKey();
            String transformation = algorithm + "/ECB/PKCS5Padding";
            Cipher cipher = Cipher.getInstance(transformation);
            cipher.init(Cipher.ENCRYPT_MODE, privateKey);
            String plainText = "My Secret Message";
            byte[] ciphertext = new byte[cipher.getOutputSize(plainText.getBytes().length)];
            int encryptedLength = cipher.update(plainText.getBytes(), 0, plainText.getBytes().length,ciphertext);


            cipher.doFinal(ciphertext, encryptedLength);
            System.out.println(Arrays.toString(ciphertext));


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (ShortBufferException e) {
            e.printStackTrace();
        }
    }
}
