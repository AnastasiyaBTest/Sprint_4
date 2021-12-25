import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountParametrizedTest {

    private final String name;
    private final boolean expected;

    public AccountParametrizedTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getStringData() {
        return new Object[][] {
                {"Тимотииии Шаламеее", true}, //18 символов
                {"Тимотииии Шаламееее", true}, // 19 символов
                {"Тимотиииии Шаламееее", false}, //20 символов
                {"Т Ша", true},  //3 символа
                {"Ти Ша", true}, //4 символа
                {"Т Ш", true},   //2 символа
                {" ", false}, //пустая строка
                {" Тимоти Шаламе ", false},
                {"Тимоти Шаламе ", false},
                {" Тимоти Шаламе", false},
                {"ТимотиШаламе", false}
        };
    }

    @Test
    public void shouldBeNameValid() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}
