package com.encryption;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            String plainText = "My Secret Message";
            String algorithm = "RSA";
            KeyPair KeyPair = KeyPairGenerator.getInstance(algorithm).generateKeyPair();
            String transformation = algorithm + "/ECB/PKCS1Padding";
            Cipher cipher = Cipher.getInstance(transformation);
            cipher.init(Cipher.ENCRYPT_MODE, KeyPair.getPublic());
            byte[] cipherText = new byte[cipher.getOutputSize(plainText.getBytes().length)];
            int encryptedLength = cipher.update(plainText.getBytes(), 0, plainText.getBytes().length,
                    cipherText);
            cipher.doFinal(cipherText, encryptedLength);
            System.out.println(new String (cipherText));
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
