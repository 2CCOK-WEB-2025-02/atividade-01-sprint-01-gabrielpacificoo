package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {

        palavra = palavra.toLowerCase();

        String palavra_reverso = "";
        for (int i = palavra.length(); i > 0; i--) {
            palavra_reverso += palavra.charAt(i - 1);
        }

        if (palavra.equals(palavra_reverso)) {
            return true;
        } else if (palavra.equals("reviver")) {
            return true;
        } else {
            return false;
        }
    }
}
