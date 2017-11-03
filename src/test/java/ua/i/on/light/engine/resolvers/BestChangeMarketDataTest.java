package ua.i.on.light.engine.resolvers;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import org.junit.Test;
import ua.i.on.light.engine.resolvers.PageResolver.ValuesTags;

/**
 * Created on 10/26/2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BestChangeMarketDataTest {

  private BestChangeMarketData testObj = new BestChangeMarketData();

  @Test
  public void getRegX() throws Exception {
    Map<String, Map<ValuesTags, String>> actual = testObj.getRegX("   </thead>"
        + "    <tbody>"
        + "<tr onclick=\"ccl(546, 56, 93, 1)\">\n"
        + "<td class=\"ir\"><span class=\"io\" id=\"io0\" onmousedown=\"shc(0)\" onclick=\"stopBubbling(event)\" onmouseover=\"show_info(0)\" onmouseout=\"shd()\"></span></td>"
        + "<td class=\"bj\"><div class=\"pa\"><a rel=\"nofollow\" target=\"_blank\" href=\"https://www.bestchange.ru/click.php?id=546&from=56&to=93&url=1\" onclick=\"return fco(546)\"></a><div class=\"pc\"><div class=\"ca\">NetEx24</div></div></div></td><td class=\"bi\"><div class=\"fs\">156 543.5180 <small>UAH Приват24</small></div><div class=\"fm\"><div class=\"fm1\">от 3 130.88</div></div></td>"
        + "<td class=\"bi\">1 <small>BTC</small></td>"
        + "<td class=\"ar arp\" title=\"Максимум валюты Bitcoin (BTC), сколько может выдать NetEx24\">40.70</td>"
        + "<td class=\"rw\" onclick=\"crw(0)\"><a href=\"https://www.bestchange.ru/netex24-exchanger.html\" class=\"rwa\" onclick=\"return arw(0)\" title=\"Отзывы NetEx24\"><table><tr><td class=\"rwl\">0</td><td class=\"del\">/</td><td class=\"rwr pos\">2563</td><td class=\"end\"></td></tr></table></a></td></tr><tr onclick=\"ccl(421, 56, 93, 1)\">"
        + "<td class=\"ir\"><span class=\"io\" id=\"io1\" onmousedown=\"shc(1)\" onclick=\"stopBubbling(event)\" onmouseover=\"show_info(1)\" onmouseout=\"shd()\"></span></td>"
        + "<td class=\"bj\"><div class=\"pa\"><a rel=\"nofollow\" target=\"_blank\" href=\"https://www.bestchange.ru/click.php?id=421&from=56&to=93&url=1\" onclick=\"return fco(421)\"></a><div class=\"pc\"><div cl");

    assertEquals("156543.5180",
        actual.get("NetEx24").get(ValuesTags.PRICE));

  }
  @Test
  public void getRegXOtherPage() throws Exception {
    Map<String, Map<ValuesTags, String>> actual = testObj.getRegX(""
        + " "
        + "     "
        + "    <div id=\"rates_block\"> "
        + "      <table id=\"content_table\"> "
        + "    <thead> "
        + "      <tr> "
        + "<td class=\"info\"><img src=\"https://www.bestchange.ru/images/ajax.gif\" id=\"update_image\" class=\"hide\" width=\"16\" height=\"16\" alt=\"Курсы обмена\" title=\"Обновление курсов...\" /></td><td class=\"bj changer\"><a href=\"https://www.bestchange.ru/index.php?sort=changer&range=asc&from=58&to=139\" title=\"Сортировать обменники по колонке &quot;Обменник&quot;\" onclick=\"sort_type = 'changer'; sort_range = 'asc'; return update_rates()\">Обменник</a></td> "
        + "<td class=\"bj from\"><a href=\"https://www.bestchange.ru/index.php?sort=from&range=desc&from=58&to=139\" title=\"Сортировать обменники по колонке &quot;Отдаете&quot;\" onclick=\"sort_type = 'from'; sort_range = 'desc'; return update_rates()\">Отдаете <small>&#9650;</small></a></td> "
        + "<td class=\"bj to\"><a href=\"https://www.bestchange.ru/index.php?sort=to&range=desc&from=58&to=139\" title=\"Сортировать обменники по колонке &quot;Получаете&quot;\" onclick=\"sort_type = 'to'; sort_range = 'desc'; return update_rates()\">Получаете</a></td> "
        + "<td class=\"ar arp reserve\"><a href=\"https://www.bestchange.ru/index.php?sort=reserve&range=desc&from=58&to=139\" title=\"Сортировать обменники по колонке &quot;Резерв&quot;\" onclick=\"sort_type = 'reserve'; sort_range = 'desc'; return update_rates()\">Резерв</a></td> "
        + "<td class=\"bj reviews end\"><a href=\"https://www.bestchange.ru/index.php?sort=reviews&range=desc&from=58&to=139\" title=\"Сортировать обменники по колонке &quot;Отзывы&quot;\" onclick=\"sort_type = 'reviews'; sort_range = 'desc'; return update_rates()\">Отзывы</a></td> "
        + "</tr> "
        + "    </thead> "
        + "    <tbody> "
        + "<tr class=\"last\" onclick=\"ccl(310, 58, 139, 1)\"> "
        + "<td class=\"ir\"><span class=\"io\" id=\"io0\" onmousedown=\"shc(0)\" onclick=\"stopBubbling(event)\" onmouseover=\"show_info(0)\" onmouseout=\"shd()\"></span></td> "
        + "<td class=\"bj\"><div class=\"pa\"><a rel=\"nofollow\" target=\"_blank\" href=\"https://www.bestchange.ru/click.php?id=310&from=58&to=139&url=1\" onclick=\"return fco(310)\"></a><div class=\"pc\"><div class=\"ca\">IndaCoin</div></div></div></td><td class=\"bi\"><div class=\"fs\">419.6391 <small>USD Карта</small></div><div class=\"fm\"></div></td> "
        + "<td class=\"bi\">1 <small>ETH</small></td> "
        + "<td class=\"ar arp\" title=\"Максимум валюты Ethereum (ETH), сколько может выдать IndaCoin\">1.08</td> "
        + "<td class=\"rw\" onclick=\"crw(0)\"><a href=\"https://www.bestchange.ru/indacoin-exchanger.html\" class=\"rwa\" onclick=\"return arw(0)\" title=\"Отзывы IndaCoin\"><table><tr><td class=\"rwl\">0</td><td class=\"del\">/</td><td class=\"rwr pos\">126</td><td class=\"end\"></td></tr></table></a></td></tr></tbody> "
        + "  </table> "
        + "    </div> "
        + " "
        + "    <script type=\"text/javascript\"><!-- "
        + "    direct_data = {0: {'a': 'id=310&from=58&to=139&url=1', 'n': 'IndaCoin', 'w': '', 'b': 0, 't': 56, 'r': '$77 906', 'd': '3 года и 3 месяца', 's': 0, 'u': 'indacoin', 'h': 1, 'c': 'in', 'm': 'Индия'}}; "
        + "    update_runner(); "
        + "    //--> "
        + "    </script> "
        + "  </div><div id=\"content_stats\" class=\"hide\"> "
        + "    <div class=\"inner\"> "
        + " "
        + "      <form method=\"get\" action=\"https://www.bestchange.ru/index.php\"> "
        + "        <fieldset> "
        + "          <input type=\"hidden\" name=\"mt\" value=\"stats\" /> "
        + "<input type=\"hidden\" name=\"from\" value=\"58\" /> "
        + "<input type=\"hidden\" name=\"to\" value=\"139\" /> "
        + "<table class=\"stats_graph\"> "
        + "          <tr> "
        + "            <td class=\"desctext\">График</td> "
        + "            <td> "
        + "              <span class=\"selectstyle selecttype\"> "
        + "                <select class=\"styled\" id=\"stats_type\" name=\"stats_type\"> "
        + "<option value=\"0\" selected=\"selected\">изменения курса обмена</option> "
        + "<option value=\"1\">изменения суммарного резерва</option> "
        + "<option value=\"2\">колебания популярности обмена</option>"
        + "");

    assertEquals("419.6391",
        actual.get("IndaCoin").get(ValuesTags.PRICE));

  }

}