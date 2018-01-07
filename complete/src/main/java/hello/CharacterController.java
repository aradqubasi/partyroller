package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CharacterController {
    @GetMapping("/character")
    public String characterForm(Model model) {
        model.addAttribute("character", new Character());
        return "character";
    }

    @PostMapping("/character")
    public String characterSubmit(@ModelAttribute Character character) {
        System.out.print("name " + character.name + " initialive " + character.initiative);
        return "charsheet";
    }
}
