package smallword.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import smallword.model.Room;
import smallword.model.Weapon;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/weapons")
public class WeaponController {


    private static List<Weapon> weaponlist = new ArrayList<>();

    static  {
        weaponlist.add(new Weapon("Rope"));
        weaponlist.add(new Weapon("Candlestick"));
        weaponlist.add(new Weapon("Lead pipe"));
        weaponlist.add(new Weapon("Revolver"));
        weaponlist.add(new Weapon("Spanner"));
        weaponlist.add(new Weapon("Knife"));

    }



    @GetMapping
    public String getAllRooms(Model model){
        model.addAttribute("weapons", weaponlist); //fist 'rooms' is the attrubute we add to the model object - the name you use to call it in the html. Second one is the arraylist
        return "weapons"; // Return the name of your view (html page)
    }
}

