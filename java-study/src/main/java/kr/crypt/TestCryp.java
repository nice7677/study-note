package kr.crypt;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class TestCryp {

    public  static String decryptAES256WithEncoding(String str, String aesKey, Charset charset) {

        try {
            String key = aesKey.substring(0, 32);
            Key keySpec = new SecretKeySpec(key.getBytes(charset), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");

            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(str.getBytes(charset)));
            return new String(decrypted, charset);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        String test = "HCFqeV6XhJwVnIaKNY9Uvg==";
        String test2 = "ghJnt6aUI9aEJXC3hHIxlA==";
//        String test3 = "rr/KoRVE6Lv1nnZ6QliMpw==";
        String test4 = "MMLQnJCDz608KR3UNa8N4A==";
        String key = "finnqXLendingMachine123^&*(@#$!!";
        String test11 = decryptAES256WithEncoding(test, key, StandardCharsets.UTF_8);
        String test22 = decryptAES256WithEncoding(test2, key, StandardCharsets.UTF_8);
//        String test33 = decryptAES256WithEncoding(test3, key, StandardCharsets.UTF_8);
        String test44 = decryptAES256WithEncoding(test4, key, StandardCharsets.UTF_8);
        System.out.println(test11);
    }

}
