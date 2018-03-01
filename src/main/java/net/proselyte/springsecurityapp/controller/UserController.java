package net.proselyte.springsecurityapp.controller;

import net.proselyte.springsecurityapp.model.Ship;
import net.proselyte.springsecurityapp.model.User;
import net.proselyte.springsecurityapp.service.SecurityService;
import net.proselyte.springsecurityapp.service.ShipService;
import net.proselyte.springsecurityapp.service.UserService;
import net.proselyte.springsecurityapp.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

/**
 * Controller for {@link net.proselyte.springsecurityapp.model.User}'s pages.
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private ShipService shipService;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getConfirmPassword());

        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null) {
            model.addAttribute("error", "Username or password is incorrect.");
        }

        if (logout != null) {
            model.addAttribute("message", "Logged out successfully.");
        }

        return "login";
    }
    @RequestMapping(value = "/ships")
    public ModelAndView listEmployee(ModelAndView model) throws IOException {
        List<Ship> listShip = shipService.getAllShips() ;
        model.addObject("listShips", listShip);
        model.setViewName("ships");
        return model;
    }
    //@RequestMapping(value = "/shipInfo", method = RequestMethod.GET)
    @RequestMapping(value = "/shipInfo")
    public String editContact(HttpServletRequest request, Model model) {
        int employeeId = Integer.parseInt(request.getParameter("id"));
        Ship ship = shipService.getShip(employeeId);
        model.addAttribute("name", ship.getName());
        model.addAttribute("flag", ship.getFlag());
        model.addAttribute("type", ship.getType());
        model.addAttribute("length", ship.getLength());
        model.addAttribute("width", ship.getWidth());
        model.addAttribute("maxeqp", ship.getMaxCarrying());
        model.addAttribute("eqpw", ship.getEqpWeight());
        model.addAttribute("maxseg", ship.getMaxSeaguage());
        model.addAttribute("year", ship.getYear());
        return "shipInfo";
    }

    @RequestMapping(value = "/shipInfo", method = RequestMethod.POST)
    public String calcView(Model model, @RequestParam String a, @RequestParam String b){
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        System.out.println(a1);
        model.addAttribute("result", a1+b1);
        return "calc";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "welcome";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(Model model) {
        return "admin";
    }
}
