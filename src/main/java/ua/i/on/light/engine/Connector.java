package ua.i.on.light.engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.net.UnknownHostException;
import sun.net.www.protocol.http.HttpURLConnection;

/**
 * Created on 10/10/2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class Connector {

  public String proxyConnect(final String webAddress, final String proxyAddress,
      final int proxyPort) throws UnknownHostException {
    URL url = null;
    StringBuilder responsePage = new StringBuilder();
    try {
      url = new URL(webAddress);

      HttpURLConnection urlConnection = new HttpURLConnection(url,
          new Proxy(
              Type.HTTP,
              new InetSocketAddress(
                  proxyAddress,
                  proxyPort
              )
          )
      );

      BufferedReader in = new BufferedReader(
          new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
      String inputLine;
      while ((inputLine = in.readLine()) != null) {
        responsePage.append(inputLine);
      }
    } catch (IOException e) {
      throw new RuntimeException("ProxyConnectError");
    }
    return responsePage.toString();
  }

  public String directConnect(String webAddress) {
    StringBuilder responsePage = new StringBuilder();
    try {

      URL url = new URL(webAddress);
      java.net.HttpURLConnection httpCon = (java.net.HttpURLConnection) url.openConnection();
      BufferedReader in = new BufferedReader(
          new InputStreamReader(httpCon.getInputStream(), "UTF-8"));
      String inputLine;
      while ((inputLine = in.readLine()) != null) {
        responsePage.append(inputLine);
      }
      in.close();

      httpCon.disconnect();
    } catch (IOException e) {
      throw new RuntimeException("DirectConnectionError");
    }
    return responsePage.toString();
  }


}
