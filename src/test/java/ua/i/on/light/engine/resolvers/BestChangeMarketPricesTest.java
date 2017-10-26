package ua.i.on.light.engine.resolvers;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import org.junit.Test;
import ua.i.on.light.engine.PageResolver.ValuesTags;

/**
 * Created on 10/26/2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BestChangeMarketPricesTest {

  private BestChangeMarketPrices testObj = new BestChangeMarketPrices();

  @Test
  public void getRegX() throws Exception {
    Map<String, Map<ValuesTags, String>> actual = testObj.getRegX("   </thead>\n"
        + "    <tbody>\n"
        + "<tr onclick=\"ccl(546, 56, 93, 1)\">\n"
        + "<td class=\"ir\"><span class=\"io\" id=\"io0\" onmousedown=\"shc(0)\" onclick=\"stopBubbling(event)\" onmouseover=\"show_info(0)\" onmouseout=\"shd()\"></span></td>\n"
        + "<td class=\"bj\"><div class=\"pa\"><a rel=\"nofollow\" target=\"_blank\" href=\"https://www.bestchange.ru/click.php?id=546&from=56&to=93&url=1\" onclick=\"return fco(546)\"></a><div class=\"pc\"><div class=\"ca\">NetEx24</div></div></div></td><td class=\"bi\"><div class=\"fs\">156 543.5180 <small>UAH Приват24</small></div><div class=\"fm\"><div class=\"fm1\">от 3 130.88</div></div></td>\n"
        + "<td class=\"bi\">1 <small>BTC</small></td>\n"
        + "<td class=\"ar arp\" title=\"Максимум валюты Bitcoin (BTC), сколько может выдать NetEx24\">40.70</td>\n"
        + "<td class=\"rw\" onclick=\"crw(0)\"><a href=\"https://www.bestchange.ru/netex24-exchanger.html\" class=\"rwa\" onclick=\"return arw(0)\" title=\"Отзывы NetEx24\"><table><tr><td class=\"rwl\">0</td><td class=\"del\">/</td><td class=\"rwr pos\">2563</td><td class=\"end\"></td></tr></table></a></td></tr><tr onclick=\"ccl(421, 56, 93, 1)\">\n"
        + "<td class=\"ir\"><span class=\"io\" id=\"io1\" onmousedown=\"shc(1)\" onclick=\"stopBubbling(event)\" onmouseover=\"show_info(1)\" onmouseout=\"shd()\"></span></td>\n"
        + "<td class=\"bj\"><div class=\"pa\"><a rel=\"nofollow\" target=\"_blank\" href=\"https://www.bestchange.ru/click.php?id=421&from=56&to=93&url=1\" onclick=\"return fco(421)\"></a><div class=\"pc\"><div cl");

    assertEquals("156 543.5181",
        actual.get("Receive-Money").get(ValuesTags.PRICE));

  }

}