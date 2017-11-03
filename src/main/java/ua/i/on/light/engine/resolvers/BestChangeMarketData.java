package ua.i.on.light.engine.resolvers;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created on 24.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BestChangeMarketData extends AbstractPageResolver {


  @Override
  public Map<String, Map<ValuesTags, String>> getRegX(String page) {

    Pattern pattern = Pattern.compile(
        "<td class=\"bj\">.+((<td class=\"bj\">)|(</div>))");
    Matcher matcher = pattern.matcher(page);
    Map<String, Map<ValuesTags, String>> matches = new HashMap<>();
    while (matcher.find()) {
      String found = matcher.group();

      Map<ValuesTags, String> values = new HashMap<>();
      String price = matcherFindFirstAndGrabMidData(found, "<div class=\"fs\">", "<small>");
      price = price.length() > 0 ? price
          : matcherFindFirstAndGrabMidData(found, "<div class=\"fs\">", "</div>");
      values.put(ValuesTags.PRICE, price.replaceAll(("[^\\d\\.]"), ""));

      values.put(ValuesTags.URL,
          matcherFindFirstAndGrabMidData(found, "href=\"", "\""));
      values.put(ValuesTags.MINIMAL_AMOUNT,
          matcherFindFirstAndGrabMidData(found, "<div class=\"fm1\">от ", "</div>"));

      matches.put(matcherFindFirstAndGrabMidData(found, "<div class=\"ca\">", "</div>"), values);


    }
    return matches;
  }
}
