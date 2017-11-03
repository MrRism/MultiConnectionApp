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
public class BestChangeVisaMCUsdMarkets extends AbstractPageResolver {


  @Override
  public Map<String, Map<ValuesTags, String>> getRegX(String page) {

    Pattern pattern = Pattern.compile(
        "<a href=\"https://www.bestchange.ru/visa-mastercard-usd-to(.{10,200})\\(\\D{3,7}\\)");
    Matcher matcher = pattern.matcher(page);
    Map<String, Map<ValuesTags, String>> matches = new HashMap<>();
    while (matcher.find()) {
      String found = matcher.group();

      Matcher identificator = Pattern.compile("(\\(\\D{2,6}\\))").matcher(found);
      identificator.find();


      Map<ValuesTags, String> gainedValues = new HashMap<>();
      gainedValues.put(ValuesTags.URL, matcherFindFirstAndGrabMidData(found, "\"","\""));
      matches
          .put(identificator.group().replaceAll("(\\()|(\\))", ""),
              gainedValues);

    }
    return matches;
  }
}
