import org.junit.Test;
import java.util.HashMap;
import java.util.List;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class MainTest {

    @Test
    public void confereListaDeMulheres() {

        HashMap<String, String> map = new HashMap<>();
        map.put("Maria", "F");
        map.put("Matheus", "M");
        map.put("Anna", "F");
        map.put("Rigoni", "M");


        List<String> mulheres = Main.filtrarMulheres(map);


        for (String nome : mulheres) {
            assertTrue(map.get(nome).equalsIgnoreCase("F"));
        }

        
        assertFalse(mulheres.contains("João"));
        assertFalse(mulheres.contains("Carlos"));
    }
}
