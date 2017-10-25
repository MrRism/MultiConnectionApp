package ua.i.on.light.engine.resolvers;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ua.i.on.light.engine.PageResolver;

/**
 * Created on 24.10.2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public class BestChangeMarketsLinks implements PageResolver {


  @Override
  public Map<String, String> getRegX(String page) {

    Pattern pattern = Pattern.compile(
        "<a href=\"https://www\\.bestchange\\.ru/privat24-uah-to(.{10,200})\\(\\D{3,7}\\)");
    Matcher matcher = pattern.matcher(page);
    Map<String, String> matches = new HashMap<>();
    while (matcher.find()) {
      String found = matcher.group();

      Matcher identificator = Pattern.compile("(\\(\\D{2,6}\\))").matcher(found);
      identificator.find();
      Matcher data = Pattern.compile("\".*?\"")
          .matcher(found);
      data.find();
      matches
          .put(identificator.group().replaceAll("(\\()|(\\))", ""),
              data.group().replaceAll("\"", ""));

    }
    return matches;
  }
}
