package ua.i.on.light.engine.resolvers;

import static org.junit.Assert.*;

import java.util.Map;
import org.junit.Test;

/**
 * Created on 26.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BankGovUaUsdRateTest {

  @Test
  public void getRegX() throws Exception {

    Map<String,String> actual = new BankGovUaUsdRate().getRegX("<exchange>\n"
        + "<currency>\n"
        + "<r030>840</r030>\n"
        + "<txt>Долар США</txt>\n"
        + "<rate>26.770046</rate>\n"
        + "<cc>USD</cc>\n"
        + "<exchangedate>26.10.2017</exchangedate>\n"
        + "</currency>\n"
        + "</exchange>");

    String expexted = "26.770046";

    assertEquals(expexted, actual.get("USD"));
  }



}