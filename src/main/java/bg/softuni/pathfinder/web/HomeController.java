package bg.softuni.pathfinder.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 * Controller handling the info pages - home, about, contact
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model){
        double sofiaTemp = new Random().nextDouble();
        model.addAttribute("sofiaTemperature", sofiaTemp);
//        ModelAndView mnv = new ModelAndView();
//        mnv.setViewName("index");
//        mnv.addObject("sofiaTemperature", sofiaTemp);
        return "index";
    }
}
