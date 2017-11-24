package ua.i.on.light.dataGetters.resolvers;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created on 10/26/2017.
 *
 * @author Serhii Petrusha aka Mr_Rism
 */
public abstract class AbstractPageResolver implements PageResolver {

  protected String matcherFindFirstAndGrabMidData(String input, String prefix, String suffix) {
    Matcher data = Pattern.compile(prefix + ".*?" + suffix)
        .matcher(input);
    data.find();
    try {
      String result = data.group()
          .substring(prefix.length(), data.group().length() - suffix.length());
      return result;
    } catch (IllegalStateException e) {
      return "";
    }
  }

}
