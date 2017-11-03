package ua.i.on.light.engine.resolvers;

import static org.junit.Assert.*;

import java.util.Map;
import org.junit.Test;
import ua.i.on.light.engine.resolvers.PageResolver.ValuesTags;

/**
 * Created on 11/3/2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BestChangeVisaMCUsdMarketsTest {


  @Test
  public void getRegX() throws Exception {
    BestChangeVisaMCUsdMarkets testObj = new BestChangeVisaMCUsdMarkets();

    Map<String, Map<ValuesTags, String>> actual = testObj.getRegX(
        "ttps://www.bestchange.ru/unionpay-to-ripple.html\">UnionPay <span class=\"font13px\">&rarr;<"
            + "/span> Ripple (XRP)</a><br /><a href=\"https://www.bestchange.ru/unionpay-to-monero.html\">U"
            + "nionPay <span class=\"font13px\">&rarr;</span> Monero (XMR)</a><br /><a href=\"https://www.be"
            + "stchange.ru/unionpay-to-dash.html\">UnionPay <span class=\"font13px\">&rarr;</span> Dash (DASH"
            + ")</a><br /><a href=\"https://www.bestchange.ru/unionpay-to-zcash.html\">UnionPay <span cla"
            + "ss=\"font13px\">&rarr;</span> Zcash (ZEC)</a><br /><a href=\"https://www.bestchange.ru/uni"
            + "onpay-to-nem.html\">UnionPay <span class=\"font13px\">&rarr;</span> NEM (XEM)</a><br /><a "
            + "href=\"https://www.bestchange.ru/unionpay-to-okpay.html\">UnionPay <span class=\"font13"
            + "px\">&rarr;</span> OKPay USD</a><br /><a href=\"https://www.bestchange.ru/unionpay-to-mone"
            + "ypolo.html\">UnionPay <span class=\"font13px\">&rarr;</span> MoneyPolo USD</a><br /><a h"
            + "ref=\"https://www.bestchange.ru/unionpay-to-moneypolo-euro.html\">UnionPay <span class=\""
            + "font13px\">&rarr;</span> MoneyPolo EUR</a><br /><br /><a href=\"https://www.bestchange.r"
            + "u/visa-mastercard-usd-to-wmz.html\">Visa/MasterCard USD <span class=\"font13px\">&rarr;</s"
            + "pan> WMZ</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-usd-to-wmr.html\">Vi"
            + "sa/MasterCard USD <span class=\"font13px\">&rarr;</span> WMR</a><br /><a href=\"https://www.b"
            + "estchange.ru/visa-mastercard-usd-to-wmu.html\">Visa/MasterCard USD <span class=\"font13px\">&"
            + "rarr;</span> WMU</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-usd-to-yandex-mon"
            + "ey.html\">Visa/MasterCard USD <span class=\"font13px\">&rarr;</span> Яндекс.Деньги</a><br /><a h"
            + "ref=\"https://www.bestchange.ru/visa-mastercard-usd-to-qiwi.html\">Visa/MasterCard USD <span cl"
            + "ass=\"font13px\">&rarr;</span> QIWI RUB</a><br /><a href=\"https://www.bestchange.ru/visa-maste"
            + "rcard-usd-to-bitcoin.html\">Visa/MasterCard USD <span class=\"font13px\">&rarr;</span> Bitcoin ("
            + "BTC)</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-usd-to-ethereum.html\">Visa/Ma"
            + "sterCard USD <span class=\"font13px\">&rarr;</span> Ethereum (ETH)</a><br /><a href=\"https://ww"
            + "w.bestchange.ru/visa-mastercard-usd-to-privat24-uah.html\">Visa/"
            + "MasterCard USD <span class=\"font13px\">&rarr;</span> Приват 24 UAH</a><br /><br />"
    );
    String expected = "https://www.bestchange.ru/visa-mastercard-usd-to-bitcoin.html";

    assertEquals(expected, actual.get("BTC").get(ValuesTags.URL));


  }

}