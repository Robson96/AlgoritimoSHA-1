package com.robson;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TesteAlgoritimo {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String senha = "admin1234";

        MessageDigest algorithm = MessageDigest.getInstance("SHA-1");
        byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();
        for (byte b: messageDigest) {
            hexString.append(String.format("%02x", 0xFF & b));
        }
        String senhaHex = hexString.toString();
        System.out.println(senhaHex);
    }
}
