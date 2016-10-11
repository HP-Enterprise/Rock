package com.incar.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Teemol on 2016/10/11.
 */
public class HttpRequestUtil {

    public static String getRequest(String url)
    {
        String result = "";
        BufferedReader in = null;
        try {
            URL connect = new URL(url);
            URLConnection connection = connect.openConnection();
            connection.setRequestProperty("content-typ","application/json;charset=UTF-8");
            connection.connect();
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public static String postRequest(String url, String param)
    {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL connect = new URL(url);
            URLConnection connection = connect.openConnection();
            connection.setRequestProperty("content-typ","application/json;charset=UTF-8");
            connection.setDoOutput(true);
            connection.setDoInput(true);

            out = new PrintWriter(connection.getOutputStream());
            out.print(param);
            out.flush();
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }

        return result;
    }
}
