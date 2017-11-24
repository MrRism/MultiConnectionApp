package ua.i.on.light.dataGetters.resolvers;

import static org.junit.Assert.*;

import java.util.Map;
import org.junit.Test;
import ua.i.on.light.dataGetters.resolvers.PageResolver.ValuesTags;

/**
 * Created on 11/3/2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BestChangeVisaMCUahMarketsTest {

  @Test
  public void getRegX() throws Exception {
    BestChangeVisaMCUahMarkets testObj = new BestChangeVisaMCUahMarkets();

    Map<String, Map<ValuesTags, String>> actual = testObj.getRegX("a-mastercard-uah-to-yandex-money.html\">Visa/MasterCard UAH <span class=\"font13px\">&rar"
        + "r;</span> Яндекс.Деньги</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-qiwi.html\">Visa/MasterCard UAH <span class=\"font13px\">&rar"
        + "r;</span> QIWI RUB</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-perfectmoney-usd.html\">Visa/MasterCard UAH <span class=\"font13px\">&rar"
        + "r;</span> Perfect Money USD</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-perfectmoney-eur.html\">Visa/MasterCard UAH <span class=\"font13p"
        + "x\">&rarr;</span> Perfect Money EUR</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-bitcoin.html\">Visa/MasterCard UAH <span class=\"fon"
        + "t13px\">&rarr;</span> Bitcoin (BTC)</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-bitcoin-cash.html\">Visa/MasterCard UAH <span class=\"f"
        + "ont13px\">&rarr;</span> Bitcoin Cash (BCH)</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-ethereum.html\">Visa/MasterCard UAH <span class=\"fo"
        + "nt13px\">&rarr;</span> Ethereum (ETH)</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-litecoin.html\">Visa/MasterCard UAH <span class=\"font"
        + "13px\">&rarr;</span> Litecoin (LTC)</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-monero.html\">Visa/MasterCard UAH <span class=\"font13px\">&"
        + "rarr;</span> Monero (XMR)</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-dogecoin.html\">Visa/MasterCard UAH <span class=\"font13px\">&rarr;</spa"
        + "n> Dogecoin (DOGE)</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-dash.html\">Visa/MasterCard UAH <span class=\"font13px\">&rarr;</span> Dash "
        + "(DASH)</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-zcash.html\">Visa/MasterCard UAH <span class=\"font13px\">&rarr;</span> Zcash (ZEC)</a"
        + "><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-tether.html\">Visa/MasterCard UAH <span class=\"font13px\">"
        + "&rarr;</span> Tether (USDT)</a><br /><a href=\"https://www.bestchange.ru/visa-mastercard-uah-to-wex.html\">Visa/MasterCard UAH <span cla");

    String expected = "https://www.bestchange.ru/visa-mastercard-uah-to-bitcoin.html";

    assertEquals(expected, actual.get("BTC").get(ValuesTags.URL));

  }

}