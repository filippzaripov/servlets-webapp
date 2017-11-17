import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.junit.Assert;
import org.junit.Test;

public class MainServletIT {

    @Test
    public void homePage() throws Exception {
      try(final WebClient webClient = new WebClient()){
          final HtmlPage page = webClient.getPage("http://localhost:8080/servlets-webapp");
          Assert.assertEquals("My webpage", page.getTitleText());
          final String pageAsText = page.asText();
          //Assert.assertTrue(pageAsText.contains("here should be something smart"));
      }
    }
}