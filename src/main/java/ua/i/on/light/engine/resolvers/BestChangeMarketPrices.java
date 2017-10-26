package ua.i.on.light.engine.resolvers;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ua.i.on.light.engine.AbstractPageResolver;
import ua.i.on.light.engine.PageResolver;

/**
 * Created on 24.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BestChangeMarketPrices extends AbstractPageResolver {


  @Override
  public Map<String, Map<ValuesTags, String>> getRegX(String page) {

    //wip
    //abstractClass?

    Pattern pattern = Pattern.compile(
        "<td class=\"bj\">.*?<td class=\"bj\">");
    Matcher matcher = pattern.matcher(page);
    Map<String, Map<ValuesTags, String>> matches = new HashMap<>();
    while (matcher.find()) {
      String found = matcher.group();

      Matcher identificator = Pattern.compile("<div class=\"ca\">.*?</div>").matcher(found);
      identificator.find();

      Map<ValuesTags, String> values = new HashMap<>();

      values.put(ValuesTags.PRICE,
          matcherFindFirstAndGrabMidData(found, "<div class=\"fs\">", "</div>"));

      values.put(ValuesTags.URL,
          matcherFindFirstAndGrabMidData(found, "href=\"", "\""));
      values.put(ValuesTags.MINIMAL_AMOUNT,
          matcherFindFirstAndGrabMidData(found, "<div class=\"fm1\">от ", "</div>"));



    }
    return matches;
  }
}
