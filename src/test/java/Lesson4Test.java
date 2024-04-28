import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Lesson4Test {
    @Test
    void test(){
        open("https://github.com/selenide/selenide/wiki");
        $("div.markdown-body ul li a[href='/selenide/selenide/wiki/SoftAssertions']").shouldHave(text("Soft assertions"));
        $("div.markdown-body ul li a[href='/selenide/selenide/wiki/SoftAssertions']").click();
        $("#wiki-body").shouldHave(text("ExtendWith"));
    }
}
