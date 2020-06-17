package com.encryption;

import javax.crypto.KeyGenerator;
import java.security.NoSuchAlgorithmException;

import java.security.Key;

public class Exercise1 {
    public static void main(String[] args) {
        try  {
            String algorithm = "AES";
            Key privateKey = KeyGenerator.getInstance(algorithm).generateKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
