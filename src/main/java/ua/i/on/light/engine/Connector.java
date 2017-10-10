package ua.i.on.light.engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * Created on 10/10/2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class Connector {

  public String proxyConnect(final URL webAddress, final String proxyAddress, final int proxyPort) throws UnknownHostException {
    HttpURLConnection urlConnection = new sun.net.www.protocol.http.HttpURLConnection(webAddress,
        new Proxy(
            Type.HTTP,
            new InetSocketAddress(
                proxyAddress,
                proxyPort
            )
        )
    );
    StringBuilder responsePage = new StringBuilder();
    try {


      BufferedReader in = new BufferedReader(
          new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
      String inputLine;
      while ((inputLine = in.readLine()) != null) {
        responsePage.append(inputLine);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return responsePage.toString();
  }



}
