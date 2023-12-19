package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
//    public static void main(String[] args) {
//        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
//        byte[] outSrc = null;
//
//        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
//        ByteArrayOutputStream output = new ByteArrayOutputStream();
//
//        byte[] temp = new byte[4];
//
//        try {
//            while (input.available() > 0){
//                int len = input.read(temp);
//                output.write(temp, 0, len);
//            }
//        }catch (IOException e) {}
//
//        outSrc = output.toByteArray();
//
//        System.out.println("Input Source : " + Arrays.toString(inSrc));
//        System.out.println("Output Source : " + Arrays.toString(outSrc));
//    }

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            FileOutputStream fos = new FileOutputStream(args[1]);

            int data = 0;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
