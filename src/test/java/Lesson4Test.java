import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Lesson4Test {
    @Test
    void shouldFindJUnit5Code(){
        open("https://github.com/selenide/selenide/wiki");
        $("div.markdown-body ul li a[href='/selenide/selenide/wiki/SoftAssertions']").shouldHave(text("Soft assertions"));
        $("div.markdown-body ul li a[href='/selenide/selenide/wiki/SoftAssertions']").click();
        $("#wiki-body").shouldHave(text(
                "@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}"));
    }
}
