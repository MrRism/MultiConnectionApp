package ua.i.on.light.connection;

/**
 * Created on 24.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public interface Connector {

  String proxyConnect(final String webAddress, final String proxyAddress,
      final int proxyPort);

  public String directConnect(String webAddress);


}
