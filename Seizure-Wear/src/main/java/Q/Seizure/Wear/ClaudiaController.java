package Q.Seizure.Wear; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
public class ClaudiaController {

    @GetMapping("/claudia")
    public String info() {
        return "Estado de la pulsera: conectada";
    }
}