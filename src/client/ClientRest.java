/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Ben Kafirongo
 */
public class ClientRest {

    public static void main(String[] args) throws MalformedURLException, IOException {
        String url1 = "http://localhost:8080/WebTest/webresources/hello/hello/pierre";
        String url2 = "http://localhost:8080/WebTest/webresources/hello/addnbre/112";
        String url4 = "http://localhost:8080/WebTest/webresources/hello/addpers";

        URL url = new URL(url4);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        URL url3 = conn.getURL();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
       String personne ="{\"age\":20,\"name\":\"samy\"}";
        Personne1 personne1 = new Personne1("ben", 20);
        OutputStream os = conn.getOutputStream();
        os.write(personne1.toString().getBytes());
        os.flush();
//        int responseCode = conn.getResponseCode();
        //  System.out.println("responseCode = " + responseCode);
        InputStream inputStream = conn.getInputStream();
//        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        String output;
//        System.out.println("Output from Server .... \n");
//        while ((output = br.readLine()) != null) {
//            System.out.println(output);
//        }

    }

}
