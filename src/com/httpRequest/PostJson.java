package com.httpRequest;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostJson {
    public static void main(String[] args) {
      /*  {
            "animal": "dog",
            "name" : "john"
        }
       */
      String content = "{\"animal\" : \"dog\", \"name\": \"john\" }";
      String path = "http://httpbin.org/post";

      try {
          URL url new URL(path);
          HttpURLConnection connection = (HttpURLConnection) url.openConnection();
          connection.setRequestMethod("POST");
          connection.setRequestProperty("Content-type", "application/json");
          connection.setDoOutput(true);
          DataOutputStream out = new DataOutputStream( connection.getOutputStream() );
          out.writeBytes(content);
          out.flush()
      }
    }
}
