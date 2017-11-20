import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class MainServletIT {

    @Test
    public void homePage() throws Exception {
      try(final WebClient webClient = new WebClient()){
          final HtmlPage page = webClient.getPage("http://localhost:8080/servlets-webapp");
          Assert.assertEquals("My webpage", page.getTitleText());
          final String pageAsText = page.asText();
          Assert.assertTrue(StringUtils.containsIgnoreCase(pageAsText,"here should be something smart"));
      }
    }
}