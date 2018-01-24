package model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public class Greeting {

    private long id;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Controller
    public static class CharacterController {
        @GetMapping("/character")
        public String characterForm(Model model) {
            Character wizard = new Character();
            wizard.name = "Shaeren";
            wizard.initiative = -1;
            model.addAttribute("character", wizard);
            return "character";
        }

        @GetMapping("/character/{id}")
        public String characterFormById(@PathVariable("id") Integer employeeId, Model model) {
            Character wizard = new Character();
            wizard.name = "Shaeren";
            wizard.initiative = employeeId;
            model.addAttribute("character", wizard);
            return "character";
        }

        @PostMapping("/character")
        public String characterSubmit(@ModelAttribute Character character) {
            System.out.print("name " + character.name + " initialive " + character.initiative);
            return "charsheet";
        }
    }

    @Controller
    public static class GreetingController {

        @GetMapping("/greeting")
        public String greetingForm(Model model) {
            model.addAttribute("greeting", new Greeting());
            return "greeting";
        }

        @PostMapping("/greeting")
        public String greetingSubmit(@ModelAttribute Greeting greeting) {

            return "result";
        }

    }
}
