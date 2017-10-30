package ua.i.on.light.engine.resolvers;

import static org.junit.Assert.*;

import java.util.Map;
import org.junit.Test;
import ua.i.on.light.engine.resolvers.PageResolver.ValuesTags;

/**
 * Created on 25.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BestChangePrivate24MarketsTest {

  private BestChangePrivate24Markets testObj = new BestChangePrivate24Markets();

  @Test
  public void getRegX() throws Exception {
    Map<String, Map<ValuesTags, String>> actual = testObj.getRegX(
        "<a href=\"https://www.bestchange.ru/privat24-uah-to-bitcoin.html\">Приват 24 UAH <span class=\"font13px\">→</span> Bitcoin (BTC)</a>");


    assertEquals("https://www.bestchange.ru/privat24-uah-to-bitcoin.html", actual.get("BTC").get(ValuesTags.URL));

  }

}