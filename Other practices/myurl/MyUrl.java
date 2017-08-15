package myurl;

import java.awt.BorderLayout;
import java.io.InputStream;
import java.net.URL;
import java.net.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyUrl {

    public static void main(String[] args) throws Exception {
        // System.setProperty("http.agent", "Firefox");

        URL myrl = new URL("http://www.upwork.com/");

        System.out.println("Protocol : " + myrl.getProtocol()
                + "\nAddress :" + myrl.getHost() + "\nPort : " + myrl.getPort());

        HttpURLConnection oC = (HttpURLConnection) myrl.openConnection();

        oC.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0");

        long date = oC.getDate();
        System.err.println(date == 0 ? "No date Found " : ("Date is : " + date));

        System.out.println("Content Length : " + oC.getContentLength());

        InputStream in = oC.getInputStream();

        int c;

        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }

        Map<String, List<String>> headerFields = oC.getHeaderFields();

        Set<String> keySet = headerFields.keySet();

        for (String s : keySet ) {
            System.out.println("Key : "+ s);
            for(String st : headerFields.get(s))
            {
                System.out.println("Value : "+st+ ",  ");
            }
        }

    }

}
