package org.example.hibLab.authorization;

import org.example.hibLab.entity.Person;
import org.example.hibLab.entity.User;
import org.example.hibLab.menu.Menu;
import org.example.hibLab.service.PersonService;
import org.example.hibLab.service.serviceImpl.PersonServiceImpl;

import java.util.List;
import java.util.Scanner;

public class LogIn {
    Scanner in = new Scanner(System.in);

    public void authorization() {
        PersonService personService = new PersonServiceImpl();
        List<Person> people = personService.showPeople();
        System.out.print("Введите логин: ");
        String login = in.nextLine();
        System.out.print("Введите пароль: ");
        String password = in.nextLine();
        User currentUser = null;
        for(Person p : people) {
            if(p.getUser().getLogin().equals(login) && p.getUser().getPassword().equals(password)) {
                currentUser = p.getUser();
                p.setPersonId(people.size());
            }
            if (p.getUser().getLogin().equals(login) && !p.getUser().getPassword().equals(password)) {
                System.out.println("Проверьте корректность пароля!");
            }
        }
        if (currentUser != null) {
            System.out.println("Авторизация пройдена успешно! Добро пожаловать " +
                    currentUser.getPerson().getSurname() + " " + currentUser.getPerson().getName());
            Menu menu = new Menu();
            String role = currentUser.getRole();
            if(role == "Admin"){
                menu.AdminMenu();
            } else {
                menu.UserMenu(currentUser);
            }
        }
        else {
            System.out.println("Такого пользователя не найдено");
        }
    }

    public int authorizationForTest(String log, String pass) {
        PersonService personService = new PersonServiceImpl();
        List<Person> people = personService.showPeople();
        User currentUser = null;
        for(Person p : people) {
            if(p.getUser().getLogin().equals(log) && p.getUser().getPassword().equals(pass)) {
                currentUser = p.getUser();
                p.setPersonId(people.size());
            }
            if (p.getUser().getLogin().equals(log) && !p.getUser().getPassword().equals(pass)) {
                System.out.println("Проверьте корректность пароля!");
            }
        }
        if (currentUser != null) {
            Menu menu = new Menu();
            String role = currentUser.getRole();
            return 1;
        }
        else {
            System.out.println("Такого пользователя не найдено");
            return 0;
        }
    }
}
