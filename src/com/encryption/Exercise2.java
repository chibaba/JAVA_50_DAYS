package com.encryption;

import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            String plainText = "My Secret Message";
            String algorithm = "RSA";
            KeyPair KeyPair = KeyPairGenerator.getInstance(algorithm).generateKeyPair();
            String transformation = algorithm + "/ECB/PKCS1Padding";
            Cipher cipher = Cipher.getInstance(transformation);
            cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
        }
    }
}
