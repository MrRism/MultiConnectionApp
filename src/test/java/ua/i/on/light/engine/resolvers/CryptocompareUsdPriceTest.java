package ua.i.on.light.engine.resolvers;

import static org.junit.Assert.*;

import org.junit.Test;
import ua.i.on.light.engine.resolvers.PageResolver.ValuesTags;

/**
 * Created on 04.11.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class CryptocompareUsdPriceTest {

  @Test
  public void getRegX() throws Exception {

    CryptocompareUsdPrice testObj = new CryptocompareUsdPrice();

    String actual = testObj.getRegX(""
        + "{\"USD\":300.38}"
    ).get("Cryptocompare").get(ValuesTags.PRICE);

    assertEquals("300.38", actual);
  }

}